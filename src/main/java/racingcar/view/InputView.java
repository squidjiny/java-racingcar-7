package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.common.IOMessage;
import racingcar.common.Symbol;
import racingcar.common.Validator;

import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<String> readCars() {
        System.out.println(IOMessage.INPUT_CAR_NAMES.getText());
        List<String> carNames = tokenizeCarsName(Console.readLine());
        Validator.validateCarNames(carNames);
        return carNames;
    }

    private List<String> tokenizeCarsName(String carNamesString) {
        return Arrays.stream(carNamesString.split(Symbol.SEPARATE_MARKER.getSymbol()))
                .map(String::trim)
                .toList();
    }

    public int readRoundCount(){
        System.out.println(IOMessage.INPUT_ROUND_COUNT.getText());
        int num = Integer.parseInt(Console.readLine());
        Validator.validateRoundCount(num);
        return num;
    }

}
