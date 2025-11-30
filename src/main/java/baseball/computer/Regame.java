package baseball.computer;

import camp.nextstep.edu.missionutils.Console;

public class Regame {

    /**
     * 사용자의 계속 진행 여부를 받아 게임을 재시작 여부 반환
     * @return 재시작 여부
     */
    public boolean doRegame() {
        String inputStr = Console.readLine();
        if(inputStr.equals("1")) {
            return true;
        } else if(inputStr.equals("2")) {
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
