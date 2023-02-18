/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



// 기능이 너무 많아짐
// 각 기능별로 함수 만들어서 관리 핋요

public class homework5 {

    public static void main (String[] arg) {
        String year;
        int month;
        int day = 1; // 년도, 달은 입력 받고 날짜는 무조건 1로 시작
        Scanner scan = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        year = scan.next();
        scan.nextLine();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        month = scan.nextInt();

        // 한자리 숫자를 입력 받을 경우가 있기 때문에 0을 앞에 붙여 포맷팅할 필요가 있음
        String convertedMonth = String.format("%02d", month);
        String convertedDay = String.format("%02d", day);

        // LocalDate에 전달할 형식으로 가공
        String today = year + "-" + convertedMonth + "-" + convertedDay ;
        /**
         * 필수 준수사항 3. LocalDate클래스 이용
         */
        LocalDate inputDate = LocalDate.parse(today);

        //System.out.println(inputDate); // input 값 잘 나오는지 출력

        System.out.println();
        System.out.println();
        //달력 출력
        System.out.printf("[%s년 %s월]\n", year, convertedMonth);


        // 요일 출력
        String [] weeks = {"일","월","화","수","목","금","토"};
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weeks[i]);
        }
        System.out.println();

        /**
         * 해당 달의 마지막 날 구해서 lastMonthDay 값에 넣기
         * 첫 시작 요일 구해서 firstDayOfWeek에 넣기
         */

        LocalDate lastDate = inputDate.withDayOfMonth(inputDate.lengthOfMonth()); // 마지막 날 LocatDate형식으로 구하기 2023-02-28
        String convertedLastDate = lastDate.format(DateTimeFormatter.ofPattern("dd")); // 마지막 날짜 구하기 28
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek(); // 첫 날의 요일 구하기 3


        // 일 출력을 위한 데이터 가공
        int firstDayOfWeek = dayOfWeek.getValue(); // **첫 시작 요일 구하는 함수 찾아서 구현
        //int outputDay = 1;
        int lastMonthDay = Integer.parseInt(convertedLastDate); // String 형식으로 저장된 마지막 날짜 int형으로 변환
        // 아래 for문을 이용해서 1일 부터 찍기
        int[][] days = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = firstDayOfWeek ; j < 7; j++) {
                days[i][j] = day;
                day ++;
                if (day > lastMonthDay) {
                    break;
                }
            }
            firstDayOfWeek = 0;
        }

        // 일 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (days[i][j] == 00) {
                    System.out.printf("\t");
                } else {
                    System.out.printf("%02d\t", days[i][j]);
                }
            }
            System.out.println();
        }
    }
}
