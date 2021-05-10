package primus.pawel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.stream.Collectors;

// Statistics for an Athletic Association
// 6kyu
// https://www.codewars.com/kata/55b3425df71c1201a800009c/train/java
// 2021-05-10 T:19:16:23
class Exercise_115 {


    public static String stat(String strg) {


        LinkedList<Integer> allTimesLinkedList = new LinkedList<>();
        String[] times = strg.split("[,]");
        String[] oneTime;
        final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("HH|mm|ss");
        for (int i = 0; i < times.length; i++) {
            oneTime = times[i].trim().split("[|]");
            allTimesLinkedList.add(LocalTime.of(Integer.parseInt(oneTime[0]), Integer.parseInt(oneTime[1]), Integer.parseInt(oneTime[2])).toSecondOfDay());
        }
        LinkedList<Integer> sortedAllTimesLL = new LinkedList<>(allTimesLinkedList.stream().sorted().collect(Collectors.toList()));

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int sum = 0;

        for (Integer time : sortedAllTimesLL) {
            if (time > maxNum) {
                maxNum = time;
            }
            if (time < minNum) {
                minNum = time;
            }
            sum += time;
        }

        final Integer SAT_LL_SIZE = sortedAllTimesLL.size();

        int average = sum / Integer.parseInt(String.valueOf(SAT_LL_SIZE));
        int range = maxNum - minNum;
        int median;

        if (SAT_LL_SIZE % 2 == 1) {
            median = sortedAllTimesLL.get((SAT_LL_SIZE + 1) / 2 - 1);
        } else {
            median = (sortedAllTimesLL.get((SAT_LL_SIZE / 2 - 1)) + sortedAllTimesLL.get(SAT_LL_SIZE / 2)) / 2;
        }


        StringBuilder sbResult = new StringBuilder();
        sbResult.append("Range: ")
                .append(LocalTime.ofSecondOfDay(range).format(DTF).replace("-", "|"))
                .append(" Average: ")
                .append(LocalTime.ofSecondOfDay(average).format(DTF).replace("-", "|"))
                .append(" Median: ")
                .append(LocalTime.ofSecondOfDay(median).format(DTF).replace("-", "|"));

        return sbResult.toString();
    }

    public static void main(String[] args) {
        System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41"));
    }
}
