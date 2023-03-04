import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baekjoon {
    public static void main(String[] args) {
        String S = "baekjoon";
        String s = S;
        String[] array = new String[S.length()];

        for (int i = 0; i < S.length(); i++) {
            //System.out.println(s.substring(1));
            array[i] = s.substring(1);
            System.out.println(array[i]);
            s = array[i];
        }


        // List<String> list = new ArrayList<>(Arrays.asList(s));
        // 언제하지....
    }
}
