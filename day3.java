import java.util.ArrayList;
import java.util.Arrays;

public class day3 {
        public static void main(String[] arg) {
            /*int num1 = 10;
            int num2 = 3;
            int answer = num1 % num2;

            System.out.println(answer);*/

            int[] array = {1, 2, 3, 5, 4, 6, 7};

            Arrays.sort(array);


            int answer = array.length;
            System.out.println(answer);

            int num = answer / 2;
            System.out.println(answer);
            System.out.println(array[num]);


            
        }

}
