package src.primus.pawel;

// You are a Robot: Translating a Path
// 6kyu
// https://www.codewars.com/kata/636173d79cf0de003d6834e4/train/java
// 2023-01-21 T:13:05:22

public class Exercise_495_todo {

    private static final String STEP = "step ";
    private static final String STEPS = "steps ";

    public static String walk(String path) {
        if(path == null || path.length() == 0){
            return "Paused";
        }

        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char startedChar = path.charAt(0);
        for (int i = 1; i < path.length(); i++) {
            if (startedChar != path.charAt(i)) {
                String step = counter > 1 ? STEPS : STEP;
                sb.append("Take ").append(counter).append(" ").append(step).append(translateMove(startedChar)).append("\n");
                startedChar = path.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        String step = counter > 1 ? STEPS : STEP;
        sb.append("Take ").append(counter).append(" ").append(step).append(translateMove(startedChar));

        return sb.toString();
    }

    private static String translateMove(char move) {
        return switch (move) {
            case '<' -> "left";
            case '>' -> "right";
            case '^' -> "up";
            case 'v' -> "down";
            default -> "";
        };
    }

    public static void main(String[] args) {
        System.out.println(walk("^^vv>><<^v>"));
    }

}
