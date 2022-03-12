package primus.pawel;

// Simple eviternity numbers
// 7kyu
// https://www.codewars.com/kata/5b93f268563417c7ed0001bd/train/java
// 2022-03-12 T:12:31:17
class Exercise_396 {

    public static int solve(int a, int b) {

        int result = 0;

        for (int i = a; i <= b; i++) {
            if (isEviternity(i))
                result++;
        }
        return result;
    }

    public static boolean isEviternity(int num) {

        String strNum = String.valueOf(num);

        if (strNum.matches("[358]*")) {

            long eight = strNum.chars().filter(ch -> ch == '8').count();
            long five = strNum.chars().filter(ch -> ch == '5').count();
            long three = strNum.chars().filter(ch -> ch == '3').count();

            return eight >= five && five >= three;
        } else return false;
    }

    public static void main(String[] args) {

        System.out.println(solve(1, 100));
    }
}
//Predicate<String> checkN = s -> s.matches("[358]+") && countMatches(s, "8") >= countMatches(s, "5") && countMatches(s, "5") >= countMatches(s, "3");