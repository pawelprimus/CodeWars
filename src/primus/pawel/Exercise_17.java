package primus.pawel;
//https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
class Exercise_17 {

    public static int getCount(String str) {
        return (int) (str).chars()
                .filter(c -> c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u')
                .count();
    }

    public static void main(String[] args) {

        System.out.println(getCount("abdfghaae"));

    }

}

/*for(char c : str.toCharArray())
      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
      */