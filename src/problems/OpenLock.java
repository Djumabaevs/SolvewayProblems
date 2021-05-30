package problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OpenLock {

   static int openLock(int numberOfLocks, int[] numberOfCircles, int[] currentPosition, int[] targetPosition) {


       if (numberOfCircles.length != numberOfLocks || currentPosition.length != numberOfLocks
               || targetPosition.length != numberOfLocks) {
           System.out.println("wrong arguments");
       }

       if (Arrays.toString(currentPosition).equals(Arrays.toString(targetPosition))) {
           return 0;
       }

       int[] copyOfArray = currentPosition.clone();
       int step = 0;
       while (true) {
           for (int i = 0; i < copyOfArray.length; i++) {
               int item = copyOfArray[i];
               if (item == numberOfCircles[i]) {
                   copyOfArray[i] = 1;
               } else {
                   copyOfArray[i] = item + 1;
               }
           }
           step += 1;


           if (Arrays.toString(copyOfArray).equals(Arrays.toString(currentPosition))) {
               return -1;
           }


           if (Arrays.toString(copyOfArray).equals(Arrays.toString(targetPosition))) {
               return step;
           }

       }

   }

    public static void main (String[] args) {
        int[] sizes = {3,3,3,3};
        int[] current = {1,1,1,1};
        int[] target = {2,2,2,2};
        int result = openLock(4, sizes, current, target);
        System.out.println(result);
    }

}
