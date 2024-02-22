import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //zad1
        int arr1[][] = new int[100][10];
        for (int i=0;i<100;i++){
            for (int j=0;j<10;j++){
                arr1[i][j]= rand.nextInt(10,20);
            }
        }
        System.out.println("Zad1: "+Zad1.Average_of_elements(arr1,8080));
        //zad2
        Zad2.Random_array();

    }


    }
