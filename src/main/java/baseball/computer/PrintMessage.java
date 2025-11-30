package baseball.computer;

import baseball.Umpire.BaseBallMessage;
import baseball.Umpire.JudgeResult;

public class PrintMessage {

    /**
     * 정보 메시지 출력
     * @param message 출력할 메시지
     */
    public void printInfoMessage(String message) {
        System.out.println(message);
    }

    /**
     * 입력 요청 메시지 출력
     * @param message 출력할 메시지
     */
    public void printInputMessage(String message) {
        System.out.print(message);
    }

    /**
     * 판정 결과 메시지 출력
     * @param judgeResult 판정 결과
     */
    public void printJudgeResultMessage(JudgeResult judgeResult) {
        int ballCount = judgeResult.getBallCount();
        int strikeCount = judgeResult.getStrikeCount();

        StringBuilder sb = new StringBuilder();
        //볼 or 스트라이크 개수가 있는 경우
        if(ballCount > 0) sb.append(ballCount).append(BaseBallMessage.BALL.getText()).append(" ");
        if(strikeCount > 0) sb.append(strikeCount).append(BaseBallMessage.STRIKE.getText()).append(" ");
        //아무것도 없는 경우
        if(ballCount == 0 && strikeCount == 0) sb.append(BaseBallMessage.NOTHING.getText());

        System.out.println(sb);
    }

    /**
     * 정답 메시지 출력
     */
    public void printCorrectAnswer() {
        System.out.println(ProcessMessage.END.getText());
        System.out.println(ProcessMessage.REGAME.getText());
    }
}
