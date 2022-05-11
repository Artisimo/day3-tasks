import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];    // array and stores multiplication table (from 1 - 10) in it.
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                multiplicationTable[i][j] = (i+1)*(j+1);
                System.out.println((i +1) + " * " + (j + 1) + " = " + multiplicationTable[i][j]);
            }
        }

        int[] toCopy = new int[4];
        System.out.println("First array: ");
        for(int i = 0; i < 4; i++){                   // Initialize array with four arbitrary integers.
            toCopy[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            System.out.println(toCopy[i]);
        }

        System.out.println("Copied array: ");
        int[] copiedArray = toCopy;    // Copy the array.
        for(int i = 0; i < 4; i++){
            System.out.println(copiedArray[i]);
        }
    }
}
