import java.util.Random;

public class InsertionSort {

    // https://www.youtube.com/watch?v=0lOnnd50cGI
    // link where i got this work

    public static void main(String[] args) {
        //init random
        Random rand = new Random();
        //create array of int with 10 variables
        int[] playArray = new int[10];
        //add random numbers to array of 10
        for(int i = 0; i<playArray.length; i++) {
            playArray[i] = rand.nextInt(100);
        }
        //printing out before unsorted list
        System.out.println("Before: ");
        printArray(playArray);

        //call to algorithm
        insertionSort(playArray);

        //printing out after sorted list
        System.out.println();
        System.out.println("After: ");
        printArray(playArray);
    }

    // just used for printing values in array
    private static void printArray(int[] playArray) {
        for (int j : playArray) {
            System.out.print(j + ", ");
        }
    }

    // does the sorting of the algorithm
    private static void insertionSort(int[] playArray) {
        //start with 2nd element so we use 1 not 0 at the start
        for(int i = 1; i < playArray.length; i++) {
            //current val were working with
            int currentVal = playArray[i];
            //this is the first val that were comparing the current val with
            int j = i -1;
            // **remember** - playArray[j] = value
            // **remember** - j = position in array
            //this will go towards the start of the array. If its 0 or lower than last number!
            while(j >= 0 && playArray[j] > currentVal) {
                //moving j over one and setting it in the next spot basically
                playArray[j + 1] = playArray[j];
                j--;
            }
            //brings current val back to the spot before where j was.
            playArray[j + 1] = currentVal;
        }
    }
}
