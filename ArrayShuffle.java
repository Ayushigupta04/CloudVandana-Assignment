import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        fisherYatesShuffle(arr);

        // Print the shuffled array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void fisherYatesShuffle(int[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap elements at indices i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}