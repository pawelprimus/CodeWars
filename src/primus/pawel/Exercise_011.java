package primus.pawel;

class Exercise_011 {

    //https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java

    public static String even_or_odd(int number) {
        if(number%2 == 0){
            return "Even";
        }else return  "Odd";
    }


    public static void main(String[] args) {

        System.out.println(even_or_odd(5));

    }
}

//    public static String even_or_odd(int number) {
//        return (number%2 == 0) ? "Even" : "Odd";
//    }