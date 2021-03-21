package primus.pawel;
/*
01.03.2021

https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

        Examples
        "the-stealth-warrior" gets converted to "theStealthWarrior"
        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
*/


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

class Exercise_1 {

    static String toCamelCase(String s){

        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {

            if(sb.charAt(i) == '_' || sb.charAt(i) == '-'){
                sb.delete(i,i+1);
                sb.replace(i, i+1 , String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }


        //System.out.println(sb);
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String test = "the-stealth-warrior";
        System.out.println(toCamelCase(test));
    }
}


 /*   static String toCamelCase(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    static String toCamelCase(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
*/