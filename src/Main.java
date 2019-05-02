import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Mikhail Probochkin
 * @version 1.0
 * */


public class Main{

    /**
     * This method is here to greet you.
     */

    public static void main(String[] args){
        System.out.println("Starting project");
        byte v_byte=120;
        short v_short=129;
        char v_char='a'; //lacked quotation marks
        int v_int=65999;
        long v_long=429496729; //the number here was too big
        float v_float= 0.33333334f; //lacked f
        double v_double=0.3333333333333333;
        boolean v_boolean=true;
        System.out.println(v_byte+" "+v_short+" "+v_char+" "+v_int+" "+v_long+" "+v_float+" "+v_double+" "+v_boolean+"\n\nAlphabet: ");
        for(char letter = 'a'; letter <='z'; letter++ )
        {
            System.out.print(letter+" ");
        }

        long begin = new java.util.Date().getTime();
        for(int i = 0; i <= 100000000; i++) {
        }
        long end = new java.util.Date().getTime();
        System.out.println("\nExecuting the program with int i took "+(end-begin));

        begin = new java.util.Date().getTime();
        for(long i = 0; i <= 100000000; i++) {
        }
        end = new java.util.Date().getTime();
        System.out.print("Executing the program with long i took "+(end-begin)+"\n\nThe biggest number in the array ");

        int[] mas = {12,43,12,-65,778,123,32,76};

        System.out.print(Arrays.toString(mas) + " is ");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]>max){
                max=mas[i];
            }
        }

        System.out.println(max+"\n\nMatrix:");

        int[][] matrix= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j]=(int)Math.round(Math.random()*10);
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transposed matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
}