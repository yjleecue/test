/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
import java.util.Scanner;

public class homework2 {

    public static int cal(int cash) { // 캐시백을 계산하는 함수, 입력 받은 cash값 호출
        double calCashBack = cash * 0.1;

        int cashBack = (int) calCashBack;

        if (cashBack > 300) {
            cashBack = 300;
        } else if (cashBack > 200) {
            cashBack = 200;
        } else if (cashBack > 100) {
            cashBack = 100;
        } else {
            cashBack = 0;
        }

        //System.out.println((int)calCashBack);
        return cashBack;
    }
    public static void main(String[] args) {
        int cash;
        int cashBack;

        Scanner scan = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액): ");
        cash = scan.nextInt();
        scan.nextLine();

        //System.out.println(cal(cash));
        cashBack = cal(cash);
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cash, cashBack);

    }
}
