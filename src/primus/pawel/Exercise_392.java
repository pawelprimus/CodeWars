package primus.pawel;

import java.util.Arrays;
import java.util.List;

// Conference Traveller
// 7kyu
// https://www.codewars.com/kata/56f5594a575d7d3c0e000ea0/train/java
// 2022-03-07 T:23:26:04
class Exercise_392 {

    private static final String NOT_FOUND = "No worthwhile conferences this year!";

    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {

        List<String> citiesVisitedList = Arrays.asList(citiesVisited);

        for (String city : citiesOffered) {
            if (!citiesVisitedList.contains(city)) {
                return city;
            }
        }
        return NOT_FOUND;
    }
}


// public static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
//    List<String> citiesVisitedList = Arrays.asList(citiesVisited);
//    return Arrays.stream(citiesOffered)
//                 .dropWhile(citiesVisitedList::contains)
//                 .findFirst()
//                 .orElse("No worthwhile conferences this year!");
//  }