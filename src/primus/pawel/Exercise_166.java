package primus.pawel;

import java.util.LinkedList;

// Make the Deadfish swim
// 6kyu
// https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
// 2021-06-30 T:23:13:00
class Exercise_166 {
    public static int[] parse(String data) {
        LinkedList<Integer> resultsLL = new LinkedList<>();
        int fish = 0;
        for (int i = 0; i < data.length(); i++) {
            switch (data.charAt(i)) {
                case 'i':
                    fish++;
                    break;
                case 'd':
                    fish--;
                    break;
                case 's':
                    fish = fish * fish;
                    break;
                case 'o':
                    resultsLL.add(fish);
                    break;
            }
        }

        int[] result = new int[resultsLL.size()];
        int i = 0;

        for (Integer number : resultsLL) {
            result[i] = number;
            i++;
        }
        return result;
    }
}

/* public static int[] parse(String data) {
    int value = 0;
    List<Integer> result = new ArrayList<>();
    for(char letter : data.toCharArray()) {
      switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result.add(value); break;
        default: throw new IllegalArgumentException("Not valid code letter");
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }*/
