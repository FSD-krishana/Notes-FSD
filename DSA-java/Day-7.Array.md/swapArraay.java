package Array;

public class swapArraay {
    public static void main(String[] arg) {
        // 1.Array reverse or reverse a array means changing the position of each number of the given array to
// its opposite position from end, i.e.if a number is at position 1 then its new position will be Array.length,
// similarly if a number is at position 2 then its new position will be Array.length – 1, and so on.

        //  Using Temp Array
        int[] array = {2, 3, 4, 7, 8, 0, 1};
        /*

        int[] reversArray = new int[array.length];
        int arraySize = array.length;
        int j = arraySize - 1;
        for (int i = 0; i < arraySize; i++) {
            reversArray[i] = array[j];
            j -= 1;
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(reversArray[i]);
        }

 */

        // Using Swapping

        int arraySize = array.length;
        int temp;

        for (int i = 0; i < (arraySize / 2); i++) {
            temp = array[i];
            array[i] = array[arraySize - i - 1];
            array[arraySize - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


    }
}
