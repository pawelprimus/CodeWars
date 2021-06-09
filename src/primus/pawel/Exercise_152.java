package primus.pawel;

import java.util.HashMap;

// Fruit Machine
// 6kyu
// https://www.codewars.com/kata/590adadea658017d90000039/train/java
// 2021-06-09 T:19:40:18
class Exercise_152 {

    public static int fruit(final String[][] reels, final int[] spins) {

        HashMap<String, Integer> itemsValue = generateItemsValue();

        String firstReelItem = reels[0][spins[0]];
        String secondReelItem = reels[1][spins[1]];
        String thirdReelItem = reels[2][spins[2]];

        if (!firstReelItem.equals(secondReelItem) && !secondReelItem.equals(thirdReelItem) && !firstReelItem.equals(thirdReelItem)) {
            return 0;
        } else if (firstReelItem.equals(secondReelItem) && firstReelItem.equals(thirdReelItem)) {
            return itemsValue.get(firstReelItem) * 10;
        } else {
            if(firstReelItem.equals(secondReelItem)) {
                return thirdReelItem.equals("Wild") ? itemsValue.get(firstReelItem)*2 :  itemsValue.get(firstReelItem);
            }
            if(firstReelItem.equals(thirdReelItem)) {
                return secondReelItem.equals("Wild") ? itemsValue.get(firstReelItem)*2 :  itemsValue.get(firstReelItem);
            }
            if(secondReelItem.equals(thirdReelItem)) {
                return firstReelItem.equals("Wild") ? itemsValue.get(secondReelItem)*2 :  itemsValue.get(secondReelItem);
            }
        }

        return -1;
    }

    private static HashMap<String, Integer> generateItemsValue() {
        HashMap<String, Integer> itemsValue = new HashMap<>();
        itemsValue.put("Wild", 10);
        itemsValue.put("Star", 9);
        itemsValue.put("Bell", 8);
        itemsValue.put("Shell", 7);
        itemsValue.put("Seven", 6);
        itemsValue.put("Cherry", 5);
        itemsValue.put("Bar", 4);
        itemsValue.put("King", 3);
        itemsValue.put("Queen", 2);
        itemsValue.put("Jack", 1);
        return itemsValue;

    }

    public static void main(String[] args) {
        System.out.println(fruit(new String[][]{new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                        "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                                "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                                "Cherry", "Bar", "King", "Queen", "Jack"}},
                new int[]{0, 1, 2}));
    }


}
