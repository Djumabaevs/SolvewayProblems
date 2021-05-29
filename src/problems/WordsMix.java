package problems;



public class WordsMix {
    private static String getDecodedMessage(int numberOfStrings, String encryptedMessage, int[]Array) {

      char[] arrayOfChars = encryptedMessage.toCharArray();
      int[] givenArray = Array;

        for (int i = 0; i < arrayOfChars.length; i++) {
            if(arrayOfChars[i] >= 'a' && arrayOfChars[i] <= 'z') {
                char[] temp = arrayOfChars;
                arrayOfChars[i] += givenArray[i];
                System.out.println(arrayOfChars);

            }
        }


      return arrayOfChars.toString();
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        getDecodedMessage(1, "hello", array);
    }
}
