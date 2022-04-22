package racingcar.model;

import racingcar.util.StringUtil;

public class Name {
    private final int MAX_SIZE = 5;

    private final String name;

    public Name(String name) {
        name = StringUtil.removeSpace(name);
        validateCheckName(name);

        this.name = name;
    }

    private void validateCheckName(String name) {
        if(StringUtil.isBlank(name)){
            throw new IllegalArgumentException("[ERROR] 이름을 입력해주세요");
        }

        if(name.length() > MAX_SIZE){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public String getName() {
        return this.name;
    }
}
