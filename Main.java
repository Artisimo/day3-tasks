public class Main {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];    // array and stores multiplication table (from 1 - 10) in it.
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                multiplicationTable[i][j] = (i+1)*(j+1);
                System.out.println((i +1) + " * " + (j + 1) + " = " + multiplicationTable[i][j]);
            }
        }
    }
}
