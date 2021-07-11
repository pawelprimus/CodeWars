package primus.pawel;

// Word values
// 7kyu
// https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java
// 2021-07-09 T:19:58:21
class Exercise_174 {

    public static int[] nameValue(String[] arr) {
        int[] result = new int[arr.length];
        int valueOfCurrentLoop = 0;
        char currentChar;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                currentChar = arr[i].charAt(j);
                if (currentChar != ' ') {
                    valueOfCurrentLoop += (currentChar - 96);
                }

            }
            result[i] = valueOfCurrentLoop*(i+1);
            valueOfCurrentLoop = 0;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(nameValue(new String[]{"codewars", "abc", "xyz"}));
    }
}

/*   public static int [] nameValue(String [] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i].chars().filter(e -> e != ' ').map(e -> e - 96).sum() * (i+1);
        }
        return result;
    }
    */
