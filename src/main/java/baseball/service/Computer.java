package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    //3자리 랜덤 숫자 생성
    public List<Integer> generateRandomNum() {
        List<Integer> randomNumList = new ArrayList<>();

        while(randomNumList.size() < 3) {
            int randomNum = Randoms.pickNumberInRange(1, 9);

            //중복 제거
            if(!randomNumList.contains(randomNum)) {
                randomNumList.add(randomNum);
            }
        }

        return randomNumList;
    }
}
