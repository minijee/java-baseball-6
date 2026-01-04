package baseball.view;

import baseball.dto.BaseBall;
import baseball.dto.Result;

public class OutputView {
    private static final String START = "숫자 야구 게임을 시작합니다.";
    private static final String END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String INPUT = "숫자를 입력해주세요 : ";
    private static final String REGAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    //게임 시작
    public void printStart() {
        System.out.println(START);
    }

    //숫자 입력 받기
    public void printInput() {
        System.out.print(INPUT);
    }

    //결과 출력
    public void printResult(Result result) {
        int ballCount = result.getBallCount();
        int strikeCount = result.getStrikeCount();

        StringBuilder sb = new StringBuilder();
        //볼 or 스트라이크 개수가 있는 경우
        if (ballCount > 0) sb.append(ballCount).append(BaseBall.BALL.getText()).append(" ");
        if (strikeCount > 0) sb.append(strikeCount).append(BaseBall.STRIKE.getText()).append(" ");
        //아무것도 없는 경우
        if (ballCount == 0 && strikeCount == 0) sb.append(BaseBall.NOTHING.getText());

        System.out.println(sb.toString().trim());
    }

    //정답 메시지 출력
    public void printCorrectAnswer() {
        System.out.println(END);
        System.out.println(REGAME);
    }

}
