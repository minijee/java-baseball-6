package baseball.Umpire;

public class PlayerInputValidate {

    /**
     * 사용자가 입력한 3자리 숫자 조건 검증
     * @param inputCharArr 입력 받은 배열 
     * @return 통과 여부
     */
    public static boolean isInputRandomNumberValidate(char[] inputCharArr) {
        //입력 길이 확인
        if(inputCharArr.length != 3) return false;
        
        //숫자 여부 확인
        for(char input : inputCharArr) {
          if(input < '0' || input > '9') return false;
        }
        
        return true;
    }

    /**
     * 사용자가 입력한 계임 계속 진행 여부 검증
     * @param inputStr 입력 받은 값
     * @return 통과 여부
     */
    public static boolean isInputRegameValidate(String inputStr) {
        if(inputStr.equals("1") || inputStr.equals("2")) return true;

        return false;
    }
}
