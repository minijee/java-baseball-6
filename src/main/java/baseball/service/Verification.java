package baseball.service;

public class Verification {

    private static final int PROCESS_INPUT_LENGTH = 1;
    private static final char PROCESS_REGAME_YES = '1';
    private static final char PROCESS_REGAME_NO = '2';

    private static final int BASEBALL_INPUT_LENGTH = 3;
    private static final char BASEBALL_START_NUM = '1';
    private static final char BASEBALL_END_NUM = '9';

    //사용자가 입력한 값이 진행 번호 조건에 맞는지
    public boolean isValidProcessNum(String str) {
        return str.length() == PROCESS_INPUT_LENGTH && str.charAt(0) == PROCESS_REGAME_YES ||
                str.length() == PROCESS_INPUT_LENGTH && str.charAt(0) == PROCESS_REGAME_NO;
    }

    //사용자가 입력한 값이 숫자야구 조건에 맞는지
    public boolean isValidBaseballNum(char[] inputCharArr) {

        //3자리인지
        if(inputCharArr.length != BASEBALL_INPUT_LENGTH) {
            return false;
        }

        //범위의 숫자인지
        for(char ch : inputCharArr) {
            if(ch < BASEBALL_START_NUM || ch > BASEBALL_END_NUM) {
                return false;
            }
        }

        return true;
    }

}
