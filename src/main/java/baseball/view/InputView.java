package baseball.view;

import baseball.service.Verification;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    private static final char BASEBALL_GENERATE_NUM = '0';
    private static List<Integer> inputList;

    //사용자가 입력한 진행여부 숫자 받기
    public int inputProcessNum() {
        String inputStr = Console.readLine().trim();

        //검증
        Verification verification = new Verification();
        if(!verification.isValidProcessNum(inputStr)) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(inputStr);
    }

    //사용자가 입력한 숫자야구 숫자 받기
    public List<Integer> inputNum() {
        inputList = new ArrayList<>();
        char[] inputCharArr = Console.readLine().trim().toCharArray();

        //검증
        Verification verification = new Verification();
        if(!verification.isValidBaseballNum(inputCharArr)) {
            throw new IllegalArgumentException();
        }

        //리스트에 넣기
        for(char ch : inputCharArr) {
            inputList.add(ch - BASEBALL_GENERATE_NUM);
        }

        return inputList;
    }


}
