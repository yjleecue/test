/**
 * 이윤지
 * 제로베이스 백엔드 스쿨 10기
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class homework6 {
    public static int random () {
        int randomNumber;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis()); // 현재시간을 시드값으로 설정
        /**
         * 필수 준수사항 4. nextInt()사용
         */
        randomNumber = random.nextInt(4); // 4명의 후보중 랜덤으로 택 1
        return randomNumber;
    }

    public static void main (String[] arg) {
        /**
         * 필수 준수사항 2. 총 투표수 10,000건 진행
         */
        double total = 10000; // 투표 인원 수
        double rate;  // 전체 투표율
        int count = 0; // 투표 할 수록 1씩 증가
        String name; // 실시간 투표된 후보 이름 출력을 위한 변수
        double[] lee = {0, 0}; // [0] 득표율 [1] 득표수
        double[] yoon = {0, 0};
        double[] shim = {0, 0};
        double[] ahn = {0, 0};

        while (count < total) {
            int vote = random(); // 1 ~ 4애서 랜덤하게 추출
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if(vote == 1) {
                name = "이재명";
                lee[1] = lee[1] + 1;
            } else if (vote == 2) {
                name = "윤석열";
                yoon[1] = yoon[1] + 1;
            } else if (vote == 3) {
                name = "심상정";
                shim[1] = shim[1] + 1;
            } else {
                name = "안철수";
                ahn[1] = ahn[1] + 1;
            }

            count++;
            rate = count / total * 100;
            lee[0] = lee[1] / total * 100;
            yoon[0] = yoon[1] / total * 100;
            shim[0] = shim[1] / total * 100;
            ahn[0] = ahn[1] / total * 100;

            System.out.println();
            System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", rate, (int) count, name);
            System.out.printf("[기호:1] 이재명: %.2f%%, (투표수: %d)\n", lee[0], (int)lee[1]);
            System.out.printf("[기호:2] 윤석열: %.2f%%, (투표수: %d)\n", yoon[0], (int)yoon[1]);
            System.out.printf("[기호:3] 심상정: %.2f%%, (투표수: %d)\n", shim[0], (int)shim[1]);
            System.out.printf("[기호:4] 안철수: %.2f%%, (투표수: %d)\n", ahn[0], (int)ahn[1]);
        }

        // 각자의 득표수 중에 max값을 구해서 변수에 저장
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add((int)lee[1]);
        list.add((int)yoon[1]);
        list.add((int)shim[1]);
        list.add((int)ahn[1]);

        Integer winnerVote = Collections.max(list);

        // 투표결과 출력
        // max값이 저장된 변수와 비교하여 같은 값을 가지고 있는 후보를 출력
        if (winnerVote == (int)lee[1]) {
            System.out.println("[투표결과] 당선인: 이재명");
        } else if(winnerVote == (int)yoon[1]) {
            System.out.println("[투표결과] 당선인: 윤석열");
        } else if(winnerVote == (int)shim[1]) {
            System.out.println("[투표결과] 당선인: 심상정");
        } else if(winnerVote == (int)ahn[1]) {
            System.out.println("[투표결과] 당선인: 안철수");
        }

    }
}
