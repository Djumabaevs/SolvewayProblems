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



   }

    public static void main (String[] args) {

    }

}
