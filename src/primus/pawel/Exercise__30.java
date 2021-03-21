package primus.pawel;
// Exes and Ohs
// 7kyu
// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
// 2021-03-21 T:12:39:45
class Exercise__30 {

    public static boolean getXO (String str) {
        int xNum = 0;
        int oNum = 0;

           // str.toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.toUpperCase().charAt(i) == 'X') xNum++;
                if (str.toUpperCase().charAt(i) == 'O') oNum++;
            }
       return xNum == oNum;
    }

    public static void main(String[] args) {

        System.out.println(getXO(null));
    }
}

/*
public static boolean getXO (String str) {
    str = str.toLowerCase();
    return str.replace("o","").length() == str.replace("x","").length();


public static boolean getXO(String str) {
    int x = 0, o = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.toUpperCase().charAt(i) == 'O') o++;
      if(str.toUpperCase().charAt(i) == 'X') x++;
    }
    return x == o;
  }
  */