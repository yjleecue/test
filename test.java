import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    // 4층에는 1개
    // 3층에는 2개
    // ...

    // 5 - 1
    // 4 - 2
    // 3 - 3
    // 4 - 4
    // 3 - 5
    // 1부터 5까지 더하는 함수
    // 출력

    public static void main(String[] arg) {
        // 1-1
        /*int n = 4;
        int floor = n; // 층 수를 출력하기 위한 변수
        int allStar = 0; // 층에 있는 모든 블록의 합을 저장하는 변수

        // 층 마다의 블록의 수 저장할 배열을 선언
        int[] array = new int[n];
        int j = 1; // 가장 윗층 부터 저장될 블록의 개수

        // n층에 저장될 블록의 수를 array[0] 에다가 저장하기
        for(int i = 0; i < n ; i ++) {
            array[i] = j;
            j ++;
        }


        // 각 층에 저장된 블록의 수 출력하기
        for(int i = 0; i < n ; i ++) {
            System.out.println(floor + "층에 사용되는 블록 수 " + array[i] + "개");
            floor--;
            allStar += array[i];
        }
        System.out.println("피라미드에 사용되는 블록의 총수는 " + allStar + "개입니다.");*/

        // 1-5
        /*String S = "1101";
        int answer = 0; // 연산 횟수를 저장하는 변수
        int number = Integer.parseInt(S, 2); // 이진수 문자열을 int 형식으로 변환

        while ( number != 0 ) { // number가 0이 될 때까지 수행
            if ( number % 2 == 0) { // 짝수라면
                number = number / 2;  // 2로 나누기
            } else { // 홀수라면
                number = number - 1; // 1을 빼기
            }
            answer ++; // 연산한 횟수 세기
        }
        System.out.println(answer);*/

        // 1-2
        /*boolean answer = true;
        int num = 5;
        int count = 0;
        System.out.println(num);




            while(true) {

                if (num - 3 == 1 ) {
                    num = num - 3;
                    System.out.println("num(3): " + num);
                    answer = !answer;
                } else if (num - 2 == 1 ) {
                    num = num - 2;
                    System.out.println("num(2): " + num);
                    answer = !answer;
                } else if (num - 1 == 1 ) {
                    num = num - 1;
                    System.out.println("num(1) : " + num);
                    answer = !answer;
                } else {
                    num = num - 1;
                    answer = !answer;
                    break;
                }

                count++;
            }



            System.out.println("*" + count);
        // System.out.println(num);
        System.out.println(answer);*/


        // 1-3
        /*int answer = 0;
        int[] A = {10000, 9000, 2000, 1000, 8000};

        for (int i = 0; i < A.length; i ++){
            int j = A.length;
            while (j > i) {
                if (A[i] < A[j-1]) { // 뒤에 숫자보다 작은게 있다면 answer에 저장
                    if (A[j-1] - A[i] > answer) { // answer에 저장된 값보다 현재 비교에서의 값이 더 크면
                        answer = A[j-1] - A[i]; // answer에 현재 비교값으로 저장
                    }
                }
                j --;
            }
        }
        System.out.println(answer);*/

        // 1-4
       /* int answer = 0;
        String s = "177829917";
        int number = Integer.parseInt(s);
        int[] sArray = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        int[] index = new int[sArray.length + 1]; // 값별 갯수(COUNT) 저장
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<sArray.length; i++) {
            index[sArray[i]]++; // 값별 인덱스에 COUNT 추가
        }


        for(int i = 0; i < index.length; i++) {
            if(index[i] > max) { // 최대값 구하기
                max = index[i];
                answer = i;
            }
        }

        System.out.println(answer);*/


        

        // 2-4
        /*int[] orders = {2, 4, 5, 7};
        int[] orderNumbers = new int[100];
        int n = 3;
        int answer = 0;

        int k = 0;
        for (int i = 0; i < 100; i++) {
            orderNumbers[i] = k + 1;
            k++;
        }

        int j = 0;
        int num = 0;
        int[] an = new int[100];
        try {
            for (int i = 0; i < 100; i++) {
                *//*System.out.println("oN : " + orderNumbers[i]);
                System.out.println("o : " + orders[j]);*//*

                if (orderNumbers[i] == orders[j]) {
                    j++;
                } else {
                    an[num] = orderNumbers[i];
                    num++;
                }
            }
        } catch (Exception e) {
            *//*System.out.println(an[0]);
            System.out.println(an[1]);*//*
            System.out.println(an[n-1]);
        }*/

        // 2-5
        /*int [] arr = {5,2,1,3};
        int answer = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (answer > arr[i]) {
                answer = arr[i];
            }
        }*/


        // 3-4 계산기
        /*String S = "3+26-7";
        int answer;
        int output = cal(S);
        System.out.println("사칙연산 결과 : " + output);*/

        // 3-5 bj
        // 한 그릇 당 150만원
        String answer = "";
        String [] BJ = {"혁준", "하밥", "양상", "심심이", "소스왕"};
        String [] one = {"혁준", "양상"};
        String [] two = {"심심이", "소스왕"};
        String [] arr = new String[one.length + two.length];
        int total = 0;
        String winner = "";
        final int jajang = 150;



        int n = 0;
        for (int i = 0; i < BJ.length; i++) {
            for (int j = 0; j < one.length; j++) { // 1그릇
                if (one[j] == BJ[i]) {
                    //System.out.println(one[j]);
                    total += jajang;
                    arr[n] = one[j];
                    n++;
                }
            }
            for (int j = 0; j < two.length; j++) {
                if (two[j] == BJ[i]) {
                    total += jajang * 2;
                    arr[n] = two[j];
                    n++;
                }
            }
        }

        List<String> arrlist = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arrlist.contains(BJ[i])) {
                continue;
            } else {
                winner = BJ[i];
            }
        }

        total += jajang*3;
        answer = total + "만원(" + winner + ")";
        System.out.println(answer);
    }
}

