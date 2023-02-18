/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
import java.util.Scanner;

public class homework3 {

    public static int cal (int age, int time, String state1, String state2) {
        var fare = 10000; // 기본 입장료 10000원
        if (age < 3) { // 3세 미만이면 무료 입장
            fare = 0;
        } else if (age < 13 || time >= 17) { // 13세 미만이거나 17시 이후 입장하면 특별 할인 적용
            fare = 4000;
        } else if (state1.equals("y") || state2.equals("y")) { // 복지카드와 국가유공자의 경우 일반 할인 적용
            fare = 8000;
        }
        return fare;
    }
    public static void main (String[] arg) {
        // 시간 남으면 예외처리 하기 , 경고문구 출력 후 다시 입력 받기
        // 나이 - 숫자 아닌 값 입력할 경우 "숫자만 입력해주세요"
        // 입장 시간 - 입력 받은 숫자가 1~24 가 아니라면 "24시간 형식으로 숫자만 입력해주세요"
        // 상태 확인 - 대소문자 구분 없이 입력 받도록 처리, y,n 외 다른 문자 입력 시 "y/n 중에서 선택하여 입력해주세요"
        Scanner scan = new Scanner(System.in);

        var fare = 10000; // 기본 입장료 10000원

        /**
         * 필수 준수사항 2. 나이, 입장시간, 국가유공자여 여부, 복지카드 여부 순으로 입력
         */
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자입력):");
        int age = scan.nextInt(); // 나이값 입력 받아서 age 변수에 저장
        scan.nextLine();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = scan.nextInt(); // 입장시간 입력 받아서 time 변수에 저장
        scan.nextLine();

        System.out.print("국가유공자 여부를 입력해주세요.(y/n):");
        String state1 = scan.next(); // 국가유공자 상태여부를 입력받아 state1 변수에 저장
        scan.nextLine();

        System.out.print("복지카드 여부를 입력해주세요.(y/n):");
        String state2 = scan.next(); // 복지카드 소지 상태 여부를 입력 받아 state2 변수에 저장
        scan.nextLine();

        // 조건에 맞는 입장료 계산을 위해 cal 함수에 입력받은 값 전달
        fare = cal(age, time, state1, state2);
        System.out.printf("입장료 : %d", fare);

    }
}
