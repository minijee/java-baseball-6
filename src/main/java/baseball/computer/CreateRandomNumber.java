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

        do {
            list = Randoms.pickUniqueNumbersInRange(0, 9, 3);
        } while (list.get(0) == 0);

        return list;
    }
}
