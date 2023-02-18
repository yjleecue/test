/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */

import java.util.Scanner;

public class homework8 {

    public static long cal(long taxableBase, int tariff) { // 전달 받은 과세표준과 세율로 세금 계산 표 출력
        System.out.printf("%10d *%3d%% = \t%10d\n",taxableBase, tariff, (int)(taxableBase * tariff * 0.01));
        return (int)(taxableBase * tariff * 0.01);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long annualIncome; // 연소득
        int[] tariff = {6, 15, 24, 35, 38, 40, 42, 45}; // 세율
        long[] taxableBase = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000, 1000000000}; // 과세 표준
        long[] progressiveDeduction = {0 ,1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000}; // 누진공제값
        double taxCase1 = 0; // 세율에 의한 세금
        double taxCase2 = 0; // 누진공제 계산에 의한 세금

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        annualIncome = scan.nextLong(); // 연소득 입력 받기
        scan.nextLine();

        long taxAnnualIncome = annualIncome; // 세율 계산을 위한 변수
        long proAnnualIncome = annualIncome; // 누진공제 계산을 위한 변수

        int j = 0;
        // 세금 계산 함수 구현
        for(int i = 0; i < 8; i ++) {
            if (taxAnnualIncome <= taxableBase[i]) { // 남은 금액이 직전 과세표준 금액 보다 작게 남은 경우 해당 금액과 퍼센트 값 출력
                taxCase1 = taxCase1 + cal(taxAnnualIncome, tariff[i]);
                 //System.out.println((int)taxCase1); // 잘 계산되는 지 확인용
                break;
            } else {
                taxCase1 = taxCase1 + cal(taxableBase[i], tariff[i]);
                taxAnnualIncome = taxAnnualIncome - taxableBase[i];
                 //System.out.println((int)taxCase1); // 잘 계산되는 지 확인용
                j = i + 1;
            }
        }

        // 누진공제 계산 함수 구현
        if (progressiveDeduction[j] == 0) { // 세율이 6%, 연소득이 1200만원 이하의 경우
                // 누적공제액이 없으므로 세율을 기준으로 구한 값과 동일
            taxCase2 = taxCase1;
        } else { // taxAnnualIncome 값으로 구한 세율과 누진공제액을 적용하여 세금 계산
            taxCase2 = proAnnualIncome * tariff[j] * 0.01 - progressiveDeduction[j];
        }


        System.out.println();
        // 세율에 의한 세금 출력
        System.out.printf("[세율에 의한 세금]:\t\t%10d\n", (int)taxCase1);

        // 누진공제 계산에 의한 세금 출력
        System.out.printf("[누진공제에 의한 세금]:\t%10d\n", (int)taxCase2);
    }
}
