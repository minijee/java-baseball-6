package baseball;

import baseball.computer.CreateRandomNumber;
import baseball.computer.PrintMessage;

public class Game {

    /**
     * 게임 진행
     */
    public static void start() {
        //1. 시작 메시지 출력
        PrintMessage.printInfoMessage(ProcessMessage.START.getText());

//        while(true) {
            //2. 랜덤 3자리 숫자 생성
            CreateRandomNumber.generate();

            //3. 사용자 입력

            //4. 입력값 검증

            //5. 평가 진행

            //6. 결과 출력

            //7. 정답 시 계속 진행
//        }
    }

}
