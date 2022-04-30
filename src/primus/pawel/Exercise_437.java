package primus.pawel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//
//
//
//
class Exercise_437 {


    public  static Function<List<Integer>, Function<Integer, List<Integer>>> multiplyAll =
            integerList -> multiplyBy -> integerList.stream().map(i -> i * multiplyBy).collect(Collectors.toList());


    public static int[] multiplyAll(int[] array) {

        return null;

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(multiplyAll.apply(list).apply(3));

        multiplyAll(new int[]{1, 2, 3});
    }
    }

    /*  static IntFunction<int[]> multiplyAll(int[] array) {
    return n -> of(array).map(i -> n * i).toArray();
  }


    public static Function<Integer, int[]> multiplyAll(int[] array) {

    Function<int[], Function<Integer,int[]>>  creator = innerArray -> arg -> Arrays.stream(innerArray).map(operand -> operand * arg).toArray();
    Function<Integer, int[]> function = creator.apply(array);

    return function;
            }

  */
