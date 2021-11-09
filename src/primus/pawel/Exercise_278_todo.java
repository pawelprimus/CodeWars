package primus.pawel;

// Alternate case
// 7kyu
// https://www.codewars.com/kata/57a62154cf1fa5b25200031e/train/java
// 2021-11-10 T:00:21:31
class Exercise_278_todo {

    static String alternateCase(final String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);
            if (Character.isUpperCase(character)) {
                stringBuilder.append(Character.toLowerCase(character));
            } else {
                stringBuilder.append(Character.toUpperCase(character));
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(alternateCase("Hello World!"));
    }


}


/* static String alternateCase(final String string) {
        char[] strings = string.toCharArray();
        for (int i = 0; i < strings.length; i++) {
          char c = strings[i];
          if (Character.isUpperCase(c))
            strings[i] = Character.toLowerCase(c);
          else if (Character.isLowerCase(c))
            strings[i] = Character.toUpperCase(c);
        }
        return new String(strings);
    }
    */