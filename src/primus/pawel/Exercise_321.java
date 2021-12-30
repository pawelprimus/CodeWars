package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// Resistor Color Codes
// 7kyu
// https://www.codewars.com/kata/57cf3dad05c186ba22000348/train/java
// 2021-12-30 T:19:42:33
class Exercise_321 {

    public static String decodeResistorColors(String bands) {
        System.out.println(bands);
        Map<String, String> ohmColorsMap = new HashMap<>();
        Map<String, String> toleranceMap = new HashMap<>();
        String resultText = "%s ohms, %s";
        ohmColorsMap.put("black", "0");
        ohmColorsMap.put("brown", "1");
        ohmColorsMap.put("red", "2");
        ohmColorsMap.put("orange", "3");
        ohmColorsMap.put("yellow", "4");
        ohmColorsMap.put("green", "5");
        ohmColorsMap.put("blue", "6");
        ohmColorsMap.put("violet", "7");
        ohmColorsMap.put("gray", "8");
        ohmColorsMap.put("white", "9");

        toleranceMap.put("gold", "5%");
        toleranceMap.put("silver", "10%");
        String tolerance = "20%";

        String[] transistorColors = bands.split(" ");
        if (transistorColors.length == 4) {
            tolerance = toleranceMap.get(transistorColors[3]);
        }

        int firstPart = Integer.parseInt(ohmColorsMap.get(transistorColors[0]) + ohmColorsMap.get(transistorColors[1]));
        double secondPart = Math.pow(10, Integer.parseInt(ohmColorsMap.get(transistorColors[2])));
         String bandOhms = String.valueOf((int) (firstPart * secondPart));


        String firstOhmPart = "";
        String secondOhmPart = "";

        if (bandOhms.length() >= 4 && bandOhms.length() < 7) {
            firstOhmPart = bandOhms.substring(0, bandOhms.length() - 3);
            secondOhmPart = bandOhms.substring(bandOhms.length() - 3);

            if (secondOhmPart.charAt(0) != '0') {
                secondOhmPart = "." + secondOhmPart.charAt(0) + "k";
                bandOhms = firstOhmPart + secondOhmPart;
            } else {
                bandOhms = firstOhmPart + "k";
            }

        } else if (bandOhms.length() >= 7) {

            firstOhmPart = bandOhms.substring(0, bandOhms.length() - 6);
            secondOhmPart = bandOhms.substring(bandOhms.length() - 6);

            if (secondOhmPart.charAt(0) != '0') {
                secondOhmPart = "." + secondOhmPart.charAt(0) + "M";
                bandOhms = firstOhmPart + secondOhmPart;
            } else {
                bandOhms = firstOhmPart + "M";
            }
        }
        return String.format(resultText, bandOhms, tolerance);
    }

    public static void main(String[] args) {
        System.out.println(decodeResistorColors("green yellow blue gold"));
    }
}
