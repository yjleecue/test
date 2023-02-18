/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */

import java.util.Random;
import java.util.Scanner;

public class homework7 {

    public static int random () {
        int randomNumber;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis()); // 현재시간을 시드값으로 설정
        randomNumber = random.nextInt(99);
        return randomNumber;
    }
    public static int[][] arrayLotto (int countLotto) {
        int[][] array = new int[countLotto][6];

        // 배열에 집어 넣기
        for (int i = 0; i <= countLotto-1; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random();
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int countLotto;
        int[][] myLotto;
        int[][] winningNumber;

        System.out.println("[로또 당첨 프로그램]");

        // 로또 개수 입력 받기
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("로또 개수를 입력해주세요.(숫자 1 ~ 10):");
        countLotto = scan.nextInt();
        scan.nextLine();

        // 로또 번호 자동 생성
        myLotto = arrayLotto(countLotto);

        // 자동 생성 된 로또 번호 목록 출력
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i <= countLotto-1; i++) {
            System.out.printf("%s\t", alphabet[i]);
            for (int j = 0; j < 6; j ++) {
                System.out.printf("%02d",myLotto[i][j]);
                if (j < 5) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 로또 발표 번호 생성
        winningNumber = arrayLotto(1);

        // 로또 발표 번호 출력
        System.out.println("[로또 발표]");
        System.out.print("\t");
        for (int i = 0; i < 6; i ++) {
            System.out.printf("%02d",winningNumber[0][i]);
            if (i < 5) {
                System.out.print(",");
            }
        }
        System.out.println();

        // 일치 여부 결과 비교
        int[] eq = new int[countLotto];
        for (int w = 0; w < 6; w++) {
            for (int i = 0; i < countLotto; i++) {
                for (int j = 0; j < 6; j++) {
                    if (myLotto[i][j] == winningNumber[0][w]) {
                        eq[i] ++;
                    }
                }
            }
        }

        // 일치 여부 결과 출력
        System.out.println();
        System.out.println("[내 로또 결과]");
        for (int i = 0; i <= countLotto-1; i++) {
            System.out.printf("%s\t", alphabet[i]);
            for (int j = 0; j < 6; j ++) {
                System.out.printf("%02d",myLotto[i][j]);
                if (j < 5) {
                    System.out.print(",");
                }
            }
            System.out.printf(" => %d개 일치", eq[i]);
            System.out.println();
        }



    }
}
