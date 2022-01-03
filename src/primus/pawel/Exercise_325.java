package primus.pawel;

// Checking Groups
// 6kyu
// https://www.codewars.com/kata/54b80308488cb6cd31000161
// 2022-01-03 T:18:06:49
class Exercise_325 {

    private static final char FIRST_BRACKET_OPEN = '(';
    private static final char FIRST_BRACKET_CLOSE = ')';

    private static final char SECOND_BRACKET_OPEN = '{';
    private static final char SECOND_BRACKET_CLOSE = '}';

    private static final char THIRD_BRACKET_OPEN = '[';
    private static final char THIRD_BRACKET_CLOSE = ']';

    private static final String OPENING = "({[";

    public static boolean groupCheck(String s) {
        if (s.equals(null) || s.length() == 0) {
            return true;
        }
        char loopChar;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            loopChar = s.charAt(i);

            if (OPENING.contains(String.valueOf(loopChar))) {
                sb.append(loopChar);
            } else {

                if (sb.length() == 0) {
                    System.out.println(s + " == false");

                    return false;
                }

                switch (loopChar) {
                    case FIRST_BRACKET_CLOSE:
                        if (sb.charAt(sb.length() - 1) == FIRST_BRACKET_OPEN) {
                            sb.deleteCharAt(sb.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    case SECOND_BRACKET_CLOSE:
                        if (sb.charAt(sb.length() - 1) == SECOND_BRACKET_OPEN) {
                            sb.deleteCharAt(sb.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    case THIRD_BRACKET_CLOSE:
                        if (sb.charAt(sb.length() - 1) == THIRD_BRACKET_OPEN) {
                            sb.deleteCharAt(sb.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return sb.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(groupCheck("{[{}[]()[]{}{}{}{}{}{}()()()()()()()()]{{{[[[((()))]]]}}}}(())[[]]{{}}[][][][][][][]({[]})"));
    }
}

