import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad1 {
    public static double Srednia_elementow(int[][] arr, int p ){
        String p1 =String.valueOf(p);
        char[]p1_cyfry=p1.toCharArray();
        Integer[]p1_cyfry_int=new Integer[p1_cyfry.length];
        for(int z=0;z<p1_cyfry.length;z++){
            p1_cyfry_int[z]=Character.getNumericValue(p1_cyfry[z]);
        }
        List<Integer> list= Arrays.asList(p1_cyfry_int);
        Set<Integer> p2=new HashSet<>(list);
        double sum=0;
        int counter=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j%2==0 && p2.contains(i) ){
                    sum=sum+arr[i][j];
                    counter++;
                }
            }
        }

        return sum/counter;
    }

}
