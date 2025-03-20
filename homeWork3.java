import java.lang.reflect.Array;
import java.util.Arrays;

public class homeWork3 {
    public static void main(String[] args) {
        float skredina = 0;
        float sum = 0;
        boolean flag = false;
        float[] element = {1,3 , 2,3 , -2,3 , - 3,2 , 0,2 , 0,4 , 4,4 , -4,2 , 4,2 , 5,4 , 9,5 , 1,0 , 43,4 , -34,4 , 3,9};
        for (float namber : element) {
            if (namber < 0) {
                flag = true;
            }
            if (namber > 0 && flag) {
                skredina++;
                sum += namber;

            }


        }
        System.out.println( "средняя арефметическая : " + sum / skredina);
    }
}

