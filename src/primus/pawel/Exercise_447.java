package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort an array by value and index
// 7kyu
// https://www.codewars.com/kata/58e0cb3634a3027180000040/train/java
// 2022-05-09 T:19:56:31
class Exercise_447 {

    public static int[] sortByValueAndIndex(int[] array) {
        List<KeyValue> keyValueList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            KeyValue keyValue = new KeyValue(array[i], array[i] * (i + 1));
            keyValueList.add(keyValue);
        }
        keyValueList.sort(Comparator.comparing(KeyValue::getValue));
        return keyValueList.stream().map(KeyValue::getKey).mapToInt(x ->x).toArray();
    }

    public static void main(String[] args) {

        Arrays.stream(sortByValueAndIndex(new int[]{23, 2, 3, 4, 5})).forEach(System.out::println);
    }

}

class  KeyValue {
    Integer key;
    Integer value;

    KeyValue(final Integer key, final Integer value) {
        this.key = key;
        this.value = value;
    }

    Integer getKey() {
        return key;
    }

    Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
