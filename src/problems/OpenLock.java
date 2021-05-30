package problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OpenLock {

   static int openLock(int numberOfLocks, int[] numberOfCircles, int[] currentPosition, int[] targetPosition) {

//       ArrayList<int[]> num = new ArrayList<>(numberOfLocks);
//       for (int i = 0; i < numberOfLocks; i++) {
//           num.add(numberOfCircles);
//           num.add(currentPosition);
//           num.add(targetPosition);
//       }

       if(numberOfCircles.length != numberOfLocks || currentPosition.length != numberOfLocks
       || targetPosition.length != numberOfLocks) {
           System.out.println("wrong arguments");
       }

       if(Arrays.toString(currentPosition).equals(Arrays.toString(targetPosition))) {
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

           if(Arrays.toString(copyOfArray).equals(Arrays.toString(currentPosition))) {
               System.out.println("no solution");
           }

           if(Arrays.toString(copyOfArray).equals(Arrays.toString(targetPosition))) {
               return step;
           }
       }

   }

    public static void main (String[] args) {
        int[] sizes = {4,4};
        int[] current = {1,2};
        int[] target = {1,3};
        int result = openLock(2, sizes, current, target);
        System.out.println(result);
    }

}
