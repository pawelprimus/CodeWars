package primus.pawel;

//Take a Ten Minute Walk
//6kyu
//https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
//2021-03-22 T:18:52:17
class Exercise_032 {

    public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        if (walk.length == 10) {
            for (char c : walk) {
                switch (c) {
                    case 'n':
                        n++;
                        break;
                    case 's':
                        s++;
                        break;
                    case 'w':
                        w++;
                        break;
                    case 'e':
                        e++;
                        break;
                }
            }
        } else return false;

        return (w == e && s == n);
    }

    public static void main(String[] args) {
        isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'});
    }


}
