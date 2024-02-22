import java.util.Arrays;
import java.util.Random;

public class Zad2 {
    public  static void Random_array() {
        Random rand = new Random();
        int size = rand.nextInt(10, 20);
        int[][] random_array = new int[size][size];
        int largestA = random_array[0][0];
        int largestB = random_array[0][0];

        for (int i = 0; i < random_array.length;i++) {
            for (int j = 0; j < random_array[i].length; j++) {
            random_array[i][j]=rand.nextInt(-100,101);
            }
        }
            for (int i = random_array.length - 1; i > 0; i--) {
                for (int j = 0, x = i; x <= random_array.length - 1; j++, x++) {
                    int temp=rand.nextInt(1,3);
                    if(temp==1) {
                        random_array[x][j] =-1;
                    }
                    else {
                        random_array[x][j] = 1;
                    }
            }

        }
        for (int i = 0; i < random_array.length;i++) {
            for (int j = 0; j < random_array[i].length; j++) {

                if (random_array[i][j] > largestA) {
                    largestA = random_array[i][j];
                }
                if (random_array[i][j] < largestA) {
                    largestB = random_array[i][j];
                }
            }
        }
        System.out.println("Zad2 najwieksza wartosc: "+largestA);
        System.out.println("Zad2 najwieksza wartosc: "+largestB);

       System.out.println(Arrays.deepToString(random_array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }
