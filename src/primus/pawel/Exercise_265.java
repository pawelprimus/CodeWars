package primus.pawel;

import java.util.Collections;

// 254 shades of grey
// 7kyu
// https://www.codewars.com/kata/54d22119beeaaaf663000024/train/java
// 2021-10-31 T:11:49:35
class Exercise_265 {

    static String[] shadesOfGrey(int num) {

        if(num <1){
            return new String[0];
        }
        if(num > 254){
            num=254;
        }
        String[] result = new String[num];
        String shadeOfGray;
        String hexDec;
        for (int i = 1; i <= num; i++) {
            hexDec = Integer.toHexString(i);
            if(hexDec.length()==1){
                hexDec = "0" + hexDec;
            }
            shadeOfGray ="#" + String.join("", Collections.nCopies(3, hexDec));
            result[i - 1] = shadeOfGray;
        }

        return result;
    }

    public static void main(String[] args) {
        shadesOfGrey(1);
    }
}

/*static String[] shadesOfGrey(int num) {
        num = Math.max(0, Math.min(254, num));
        String[] result = new String[num];
        for (int i = 1; i <= num; ++i) {
            result[i - 1] = String.format("#%02x%02x%02x", i, i, i);
        }
        return result;
    }*/
