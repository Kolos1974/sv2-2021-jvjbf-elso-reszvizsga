package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                result += chars[i];
            }
        }
        return result;
    }
}
