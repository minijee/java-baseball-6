package baseball.service;

import baseball.dto.Result;

import java.util.List;

public class Judge {

    private static final int ANSWER_LENGTH = 3;
    private int strikeCnt;

    //볼, 스트라이크 개수 반환
    public Result resultCnt(List<Integer> randomNumList, List<Integer> inputNumList) {
        int strikeCount = countStrike(randomNumList, inputNumList);
        int ballCount = countBall(randomNumList, inputNumList);

        return new Result(ballCount, strikeCount);
    }

    //스트라이크 개수
    private int countStrike(List<Integer> randomNumList, List<Integer> inputNumList) {
        strikeCnt = 0;

        for(int i = 0; i < ANSWER_LENGTH; i++) {
            if(randomNumList.get(i) == inputNumList.get(i)) {
                strikeCnt++;
            }
        }

        return strikeCnt;
    }
    
    //볼 개수
    private int countBall(List<Integer> randomNumList, List<Integer> inputNumList) {
        int ballCnt = 0;

        for(int i = 0; i < ANSWER_LENGTH; i++) {
            if(randomNumList.contains(inputNumList.get(i))) {
                ballCnt++;
            }
        }

        return ballCnt - strikeCnt;
    }
}
