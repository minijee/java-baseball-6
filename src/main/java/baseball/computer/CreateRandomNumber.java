package baseball.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNumber {

    private static List<Integer> list;

    /**
     * 3자리 랜덤 숫자를 생성
     * @return 3자리 숫자로 구성된 문자열
     */
    public static List<Integer> generate() {
        list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            int number = 0;

            if(i == 0) {
                number = Randoms.pickNumberInRange(1, 9);
            } else {
                number = Randoms.pickNumberInRange(0, 9);
            }

            list.add(number);
        }

        return list;
    }
}
