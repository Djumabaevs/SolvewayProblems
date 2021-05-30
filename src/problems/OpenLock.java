package problems;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OpenLock {

   static int openLock(int numberOfLocks, int[] numberOfCircles, int[] currentPosition, int[] targetPosition) {

       ArrayList<int[]> num = new ArrayList<>(numberOfLocks);
       for (int i = 0; i < numberOfLocks; i++) {
           num.add(numberOfCircles);
           num.add(currentPosition);
           num.add(targetPosition);
       }

       if(numberOfCircles.length != num.size() || currentPosition.length != num.size()
       || targetPosition.length != num.size()) {
           System.out.println("wrong arguments");
       }

       if(currentPosition.toString() == targetPosition.toString()) {
           return 0;
       }

       int[] copyOfArray = currentPosition.clone();
       int step = 0;
       while (true) {
           for (int i = 0; i < copyOfArray.length; i++) {
               int item = copyOfArray[i];
               if(item == numberOfCircles[i]) {
                   copyOfArray[i] = 1;
               } else {
                   copyOfArray[i] = item + 1;
               }
           }
           step += 1;

           if(copyOfArray.toString() == currentPosition.toString()) {
               System.out.println("no solution");
           }


       }


   }

    public static void main (String[] args) {

    }

}
