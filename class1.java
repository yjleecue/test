public class class1 { //과제 제출 시 클래스 이름 변경
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d x %02d = %02d   ", j, i, j*i );
            }
            System.out.println();
        }
    }
}
