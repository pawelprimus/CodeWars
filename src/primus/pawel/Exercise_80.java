package primus.pawel;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Interactive Dictionary
// 7 kyu
// https://www.codewars.com/kata/57a93f93bb9944516d0000c1/train/java
// 2021-04-16 T:17:55:28
class Exercise_80 {

    public  class Dictionary {

        public Map<String, String> dictionaryMap;

        public Dictionary(){
            dictionaryMap = new HashMap<>();
        }

        public void newEntry(String key, String value){
            dictionaryMap.put(key,value);
        }

        public String look(String key){
            // return getOrDefault(key, "Cant find entry for " + key);
            if(dictionaryMap.containsKey(key)){
                return dictionaryMap.get(key);
            } else {
                return "Cant find entry for " + key;
            }
        }
    }

    public static void main(String[] args) {

    }

}
