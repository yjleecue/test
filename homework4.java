/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
import java.util.Scanner;
import java.util.Random;

public class homework4 {

    public static void cal (String y, int m, int d, String g) {
        // 8 ~ 13 자리 숫자 생성
        /**
         * 2000년 이후 출생자만 입력 가능합니다.
         * 위 문구를 띄우는 얘외 처리
         */
        long randomNumber;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis()); // 현재시간을 시드값으로 설정
        /**
         * 필수 준수사항 3. nextInt()사용
         */
        randomNumber = random.nextInt(999999);

        y = y.substring(2);
        if (g.equals("m")) {
            g = String.valueOf(3);
        } else {
            g = String.valueOf(4);
        }
        System.out.printf("%s%02d%02d-%s%s", y, m, d, g, randomNumber);
        // ?? 예시에는 20210303-...이런 식으로 젹혀있다... 그래도 주민번호는 뒷자리 2개가 국룰이지...
    }

    public static void main (String[] arg) {
        /**
         * 에러 처리 됐을 경우 고민해보기
         * 출생년도, 출생월, 출생일, 성별 별로 클래스 만들고 예외처리 -> MenuYear ...
         */
        String number;

        Scanner scan = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = scan.next(); //
        scan.nextLine();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = scan.nextInt(); //
        scan.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = scan.nextInt(); //
        scan.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scan.next(); //
        scan.nextLine();

        cal(year, month, day, gender); //

    }
}
