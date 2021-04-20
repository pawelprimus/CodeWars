package primus.pawel;

// Count the divisors of a number
// 7kyu
// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
// 2021-04-20 T:23:31:47
class Exercise_087 {

    public long numberOfDivisors(int n) {
        if(n==0) return 0;
        int result = 1;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) result++;
        }
        return result;
    }

}

/* public long numberOfDivisors(int n) {
    return IntStream.range(1, n+1).filter(i -> n%i==0).count();
  }
  */
