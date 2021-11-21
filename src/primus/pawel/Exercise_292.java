package primus.pawel;

import java.util.Arrays;
import java.util.List;
// Circular List
// 7kyu
// https://www.codewars.com/kata/5b2e60742ae7543f9d00005d/train/java
// 2021-11-21 T:17:17:14
class Exercise_292 {
    public static void main(String[] args) {
        final CircularList<String> xs = new CircularList<>("one", "two", "three");

        System.out.println(xs.next());
        System.out.println(xs.next());
        System.out.println(xs.next());
        System.out.println(xs.next());
        System.out.println(xs.prev());
        System.out.println(xs.prev());
        System.out.println(xs.prev());
        System.out.println(xs.prev());

    }
}

class CircularList<T> {
    List<T> list;
    int index;
    int MAX_INDEX;

    public CircularList(final T... elements)  {

        if(elements.length == 0){
            throw  new RuntimeException("${T}");
        }
        list = Arrays.asList(elements);
        MAX_INDEX = elements.length;
        index = -1;
    }

    T next() {
        if (index == MAX_INDEX - 1) {
            index = 0;
        } else {
            index++;
        }
        T t = list.get(index);
        return t;
    }

    T prev() {
        if (index <= 0) {
            index = MAX_INDEX - 1;
        } else {
            index--;
        }
        T t = list.get(index);
        return t;
    }
}