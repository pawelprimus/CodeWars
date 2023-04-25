package src.primus.pawel;
// Find your caterer
// 7kyu
// https://www.codewars.com/kata/6402205dca1e64004b22b8de/train/java
// 2023-04-25 T:21:12:25
public class Exercise_514 {

    private static final int CATERER_ONE = 15;
    private static final int CATERER_TWO = 20;
    private static final int CATERER_THREE = 30;

    public static int find_caterer(int budget, int people) {
        if(people <=0){
            return -1;
        }
        double thirdCatererAmount = people > 60 ? people * CATERER_THREE * 0.8 : people * CATERER_THREE;
        if(thirdCatererAmount <= budget){
            return 3;
        }
        if(people * CATERER_TWO <= budget){
            return 2;
        }
        if(people * CATERER_ONE <= budget){
            return 1;
        }
        return -1;
    }

}
