package problems;



public class WordsMix {
    private static String getDecodedMessage(int numberOfStrings, String encryptedMessage, int[]Array) {

      char[] arrayOfChars = encryptedMessage.toCharArray();

        for (int i = 0; i < arrayOfChars.length; i++) {
            if(arrayOfChars[i] >= 'a' && arrayOfChars[i] <= 'z') {

                System.out.println(arrayOfChars);
            }
        }


      return arrayOfChars.toString();
    }


    public static void main(String[] args) {
        int[] array = {-1,-1,-1,-1,-10};
        getDecodedMessage(1, "ifmmy", array);
    }
}
