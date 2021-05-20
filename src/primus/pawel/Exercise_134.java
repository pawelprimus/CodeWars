package primus.pawel;
// Invisible cubes
// 7kyu
// https://www.codewars.com/kata/560d6ebe7a8c737c52000084/train/java
// 2021-05-20 T:19:10:07
class Exercise_134 {

    public Long notVisibleCubes(Long n) {
        return (n<3) ?  0 :  (n-2)*(n-2)*(n-2);
    }


}
