package baseball.Umpire;

import java.util.List;

public class Judge {

    /**
     * 볼 개수를 확인
     * @param randomNumberList 랜덤 숫자 리스트
     * @param inputNumberList 입력 숫자 리스트
     * @return 볼 개수
     */
    private static int countBall(List<Integer> randomNumberList, List<Integer> inputNumberList) {
        int count = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i != j && randomNumberList.get(i).equals(inputNumberList.get(j))) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * 스트라이크 개수를 확인
     * @param randomNumberList 랜덤 숫자 리스트
     * @param inputNumberList 입력 숫자 리스트
     * @return 스트라이크 개수
     */
    private static int countStrike(List<Integer> randomNumberList, List<Integer> inputNumberList) {
        int count = 0;

        for(int i = 0; i < 3; i++) {
            if(randomNumberList.get(i).equals(inputNumberList.get(i))) {
                count++;
            }
        }

        return count;
    }

    /**
     * 볼 개수, 스트라이크 개수 결과 담아 반환
     * @param randomNumberList 랜덤 숫자 리스트
     * @param inputNumberList 입력 숫자 리스트
     * @return 볼 개수, 스트라이크 개수 결과
     */
    public static JudgeResult evaluate(List<Integer> randomNumberList, List<Integer> inputNumberList) {
        int ballCount = countBall(randomNumberList, inputNumberList);
        int strikeCount = countStrike(randomNumberList, inputNumberList);

        return new JudgeResult(ballCount, strikeCount);
    }
}
