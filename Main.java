import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        // 무한루프 구현
        // 메뉴 화면 출력

        while(true) {
            System.out.println("<<<<[메뉴선택]>>>>");
            System.out.println("1. 회원 관리");
            System.out.println("2. 과목 관리");
            System.out.println("3. 수강 관리");
            System.out.println("4. 결제 관리");
            System.out.println("5. 종료");

            // 값 입력 받기
            Scanner scan = new Scanner(System.in);
            //System.out.print("입력 :");
            num = scan.nextInt();
            //System.out.println(scan.nextInt());
            scan.nextLine();

            // 만약 입력값이 1이라면
            if (num == 1) {
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                continue;
            } // 회원 관리 메뉴를 선택했습니다.

            // 만약 입력값이 2라면
            if (num == 2) {
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                continue;
            } // 과목 관리 메뉴를 선택했습니다.

            // 만약 입력값이 3이라면
            if (num == 3) {
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                continue;
            } // 수강 관리 메뉴를 선택했습니다.

            // 만약 입력값이 4라면
            if (num == 4) {
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                continue;
            } // 결제 관리 메뉴를 선택했습니다.


            // 만약 입력값이 5라면
            if (num == 5) {
                System.out.println("5입력");
                break; // 프로그램 종료
            }

            if (num < 1 || num > 5) {
                System.out.println("1~5 사이의 값을 입력해주세요");
                continue;
            }

        }
    }
}