package baseball.service;

import baseball.dto.Result;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class Game {

    private static final int CORRECT_STRIKE_COUNT = 3;

    public void start() {
        OutputView outputView = new OutputView();
        outputView.printStart();

        //랜덤 세자리 숫자 생성
        Computer computer = new Computer();
        List<Integer> randomNumList = computer.generateRandomNum();

        //맞출때까지 반복
        while (true) {
            //사용자 입력 받기
            outputView.printInput();
            InputView inputView = new InputView();
            List<Integer> inputNumList = inputView.inputNum();

            //판정하기
            Judge judge = new Judge();
            Result result = judge.resultCnt(inputNumList, randomNumList);
            outputView.printResult(result);

            if(result.getStrikeCount() == CORRECT_STRIKE_COUNT) {
                break;
            }
        }//end while


    }
}
