import java.util.Arrays;
import java.util.Random;

public class Zad2 {
    public static void Random_array() {
        Random rand = new Random();
        int size = rand.nextInt(10, 21);
        int[][] random_array = new int[size][size];
        int largestA = random_array[0][0];
        int largestB = random_array[0][0];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < random_array.length; i++) {
            random_array[i] = new int[size];
            for (int j = 0; j < random_array[i].length; j++) {
                if (i == j) {
                    int temp = rand.nextInt(1, 3);
                    if (temp == 1) {
                        random_array[i][j] = 1;
                    } else {
                        random_array[i][j] = -1;
                    }
                } else {
                    random_array[i][j] = rand.nextInt(-100, 101);
                }
            }
        }
        // metoda do wypisania matrycy
        // System.out.println(Arrays.deepToString(random_array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        for (int[] innarr : random_array) {
            for (int num : innarr) {
                if (num > largestA) {
                    largestB = largestA;
                    largestA = num;
                } else if (num > largestB && num != largestA) {
                    largestB = num;
                }
            }
        }
        System.out.println("Zad2 najwieksza wartosc: " + largestA);
        System.out.println("Zad2 druga najwieksza wartosc: " + largestB);

        for (int i = 0; i < random_array.length; i++) {
            for (int j = 0; j < random_array[i].length; j++) {
                if (i % 2 == 0) {
                    sum1 = sum1 + random_array[i][j];
                }
                if (j % 2 != 0) {
                    sum2 = sum2 + random_array[i][j];
                }
            }
        }
        int divison = sum1 / sum2;
        System.out.println("Zad2 stosunek: " + divison);
        int count = 0;
        for (int i = 0; i < random_array.length; i++) {
            for (int j = 0; j < random_array[i].length; j++) {
                if (random_array[i][j] < i * j) {
                    count++;
                }
            }
        }
        System.out.println("Liczba komórek o wartościach mniejszych niż iloczyn indeksów: " + count);
    }
}




