package primus.pawel;

//
//
//
// 2021-09-23 T:23:49:34
class Exercise_233 {

    public static int getWeight(String name) {
        int result = 0;
        char currentChar;
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            currentChar = name.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    result += Character.toLowerCase(currentChar);
                } else {
                    result += Character.toUpperCase(currentChar);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        getWeight("Joe ");

    }
}
