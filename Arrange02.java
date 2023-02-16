public class Arrange02 {
		public static void main(String[] args) {
			int[] guguClass = {1, 3, 5, 7,  9};
			for (int i : guguClass) {
							for (int j = 1; j <10; j++) {
									System.out.printf("%d * %d = %d\n", i, j, i*j);
							}
							System.out.println();
			}
		}
}

// 홀수 단만 출력하는 구구단 
// 배열을 이용함
