import java.util.Random;

public class Zad2 {
    public  void Random_array() {
        Random rand = new Random();
        int size = rand.nextInt(10, 20);
        int[][] random_array = new int[size][size];

        for (int i = 0; i < random_array.length;i++) {
            for (int j = 0; j < random_array[i].length; j++) {
            random_array[i][j]=rand.nextInt(-100,100);
            }
        }
            for (int i = random_array.length - 1; i > 0; i--) {
                for (int j = 0, x = i; x <= random_array.length - 1; j++, x++) {
                    int temp=rand.nextInt(1,2);
                    if(temp==1) {
                        random_array[x][j] =-1;
                    }
                    else random_array[x][j]=1;
            }
        }


    }
}
