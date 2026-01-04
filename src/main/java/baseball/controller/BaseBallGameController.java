package baseball.controller;

import baseball.service.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallGameController {

    private static final int REGAME_NO_NUM = 2;

    public void run() {
        int inputRestartNum;

        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        do {
            Game game = new Game();
            game.start();

            //게임 정답 시 재시작 여부
            outputView.printCorrectAnswer();
            inputRestartNum = inputView.inputProcessNum();

        } while (inputRestartNum != REGAME_NO_NUM);
    }
}
