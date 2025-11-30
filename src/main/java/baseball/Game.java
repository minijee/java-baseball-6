package baseball;

import baseball.Umpire.Judge;
import baseball.Umpire.JudgeResult;
import baseball.computer.CreateRandomNumber;
import baseball.computer.PrintMessage;
import baseball.computer.ProcessMessage;
import baseball.computer.Regame;
import baseball.player.PlayerInput;

import java.util.List;

public class Game {

    /**
     * 게임 진행
     */
    public static void start() {
        //1. 시작 메시지 출력
        PrintMessage printMessage = new PrintMessage();
        printMessage.printInfoMessage(ProcessMessage.START.getText());

        //2. 랜덤 3자리 숫자 생성
        CreateRandomNumber createRandomNumber = new CreateRandomNumber();
        List<Integer> randomNumberList = createRandomNumber.generate();
        System.out.println(randomNumberList);

        while(true) {
            //3. 사용자 입력
            printMessage.printInputMessage(ProcessMessage.INPUT.getText());
            PlayerInput playerInput = new PlayerInput();
            List<Integer> inputNumberList = playerInput.inputRandomNumber();

            //4. 평가 진행
            JudgeResult judgeResult = Judge.evaluate(randomNumberList, inputNumberList);

            //5. 평가 결과
            printMessage.printJudgeResultMessage(judgeResult);

            //6. 정답 시 계속 진행 여부
            if(Judge.isCorrectAnswer(judgeResult)) {
                printMessage.printCorrectAnswer();

                if(Regame.doRegame()) { //재시작 시
                    randomNumberList = createRandomNumber.generate();
                    System.out.println(randomNumberList);
                } else { //종료 시
                    return;
                }//end if

            }//end if

        }//end while

    }//end start

}//class
