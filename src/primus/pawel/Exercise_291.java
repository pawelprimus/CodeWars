package primus.pawel;
// Area of a Circle
// 7kyu
// https://www.codewars.com/kata/537baa6f8f4b300b5900106c/train/java
// 2021-11-21 T:17:21:43
class Exercise_291 {

    public static double area(double radius) {
        if(radius<=0){
            throw new IllegalArgumentException("Radius should be bigger than 0");
        }
        return radius*radius*Math.PI;
    }


}
//return Math.round(Math.PI*(radius*radius) * 100.0) / 100.0;
//return (new BigDecimal(Math.PI * radius * radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();