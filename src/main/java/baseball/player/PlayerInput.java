package baseball.player;

import baseball.Umpire.PlayerInputValidate;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class PlayerInput {
    private static List<Integer> inputNumberlist;

    /**
     * 사용자가 입력한 3자리 숫자 받기
     * @return 사용자가 입력한 숫자 리스트
     */
    public List<Integer> inputRandomNumber() {
        inputNumberlist = new ArrayList<>();
        char[] inputArr = Console.readLine().trim().toCharArray();

        PlayerInputValidate playerInputValidate = new PlayerInputValidate();
        if(!playerInputValidate.isInputRandomNumberValidate(inputArr)) { //입력값 검증
            throw new IllegalArgumentException();
        };

        for(char inputNum : inputArr) {
            inputNumberlist.add(inputNum - '0');
        }

        return inputNumberlist;
    }

    /**
     * 사용자가 입력한 게임 계속 진행 여부 받기
     * @return 사용자 입력 숫자
     */
    public int inputRegameNumber() {
        String inputStr = Console.readLine().trim();

        PlayerInputValidate playerInputValidate = new PlayerInputValidate();
        if(!playerInputValidate.isInputRegameValidate(inputStr)) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(inputStr);
    }
}
