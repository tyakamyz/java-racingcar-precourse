package racingcar.util;

public class StringUtil {

    public static boolean isBlank(String str) {
        return str == null || "".equals(str);
    }

    public static String removeSpace(String str) {
        return str.trim();
    }
}
