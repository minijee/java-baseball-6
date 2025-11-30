package baseball.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNumber {

    private List<Integer> list;

    /**
     * 3자리 랜덤 숫자를 생성
     * @return 3자리 숫자로 구성된 문자열
     */
    public List<Integer> generate() {
        list = new ArrayList<>();
        int idx = 0;
        int number = 0;

        while(idx < 3) {
            if(idx == 0) {
                number = Randoms.pickNumberInRange(1, 9); //첫 번째 자리
            } else {
                number = Randoms.pickNumberInRange(0, 9);
            }

            if(!duplicate(number)) {
                list.add(number); //새로 생성된 숫자가 중복된 숫자가 아니라면
                idx++;
            }
        }

        return list;
    }

    /**
     * 생성된 랜덤 숫자가 중복되는지 확인
     * @param number 생성된 랜덤 숫자
     * @return 중복 여부
     */
    private boolean duplicate(int number) {

        return list.contains(number);
    }

}