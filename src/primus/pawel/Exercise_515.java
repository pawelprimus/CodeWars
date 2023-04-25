package src.primus.pawel;

// Running out of space
// 7kyu
// https://www.codewars.com/kata/56576f82ab83ee8268000059/train/java
// 2023-04-25 T:21:22:36
public class Exercise_515 {

    public static String[] spacey(String[] array) {
        String[] result = new String[array.length];
        for(String str : array){
            System.out.println(str);
        }
        result[0] = array[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = array[i].startsWith(result[i-1]) ?  array[i] : result[i-1] + array[i];
        }

        return result;
    }
}
