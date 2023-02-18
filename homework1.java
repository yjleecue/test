/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
public class homework1 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        /**
         * 필수 준수사항 1. 다중반복
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                /**
                 * 필수 준수사항 2. format함수 사용
                 */
                System.out.format("%02d x %02d = %02d   ", j, i, j*i );
            }
            System.out.println();
        }
    }
}
