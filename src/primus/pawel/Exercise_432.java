package primus.pawel;

import java.util.*;
import java.util.stream.Collectors;

// Santa's Naughty List
// 7kyu
// https://www.codewars.com/kata/5a0b4dc2ffe75f72f70000ef/train/java
// 2022-04-24 T:14:25:00
class Exercise_432 {

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        Set<String> goodChildren = new HashSet<>();

        for (String kid : children) {
            if (santasList.contains(kid)) {
                goodChildren.add(kid);
            }
        }
        return new ArrayList<>(goodChildren).stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

}

/*  public static List<String> findChildren(List<String> santasList, List<String> children) {

        final Set<String> santa = new HashSet<String>(santasList);
        return children.stream().filter( s -> santa.contains(s) ).distinct().sorted().collect(Collectors.toList());
    }

 public static List<String> findChildren(List<String> santasList, List<String> children) {
      return children.stream()
               .filter(child -> santasList.contains(child))
               .distinct()
               .sorted()
               .collect(Collectors.toList());
    }


    */
