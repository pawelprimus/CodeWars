package primus.pawel;

import java.util.LinkedList;

// Josephus Survivor
// 5kyu
// https://www.codewars.com/kata/555624b601231dc7a400017a/train/java
// 2021-05-18 T:19:18:55
class Exercise_129 {
    public static int josephusSurvivor(final int n, final int k) {
        LinkedList<Integer> peopleList = new LinkedList<>();
        int currentQueIndex = -1;
        for (int i = 1; i <= n; i++) {
            peopleList.add(i);
        }

        while (peopleList.size() > 1) {
            for (int i = 0; i < k; i++) {
                if (currentQueIndex == peopleList.size() - 1) {
                    currentQueIndex = 0;
                } else {
                    currentQueIndex++;
                }
            }
            peopleList.remove(currentQueIndex);
            currentQueIndex--;
        }
        return peopleList.get(0);
    }

    public static void main(String[] args) {
        josephusSurvivor(11, 9);
    }
}
