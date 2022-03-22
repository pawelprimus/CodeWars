package primus.pawel;

// Simple Fun #74: Growing Plant
// 7kyu
// https://www.codewars.com/kata/58941fec8afa3618c9000184/train/java
// 2022-03-22 T:23:47:42
class Exercise_402 {

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int count = 0;
        int height = 0;
        height += upSpeed;
        while (height <= desiredHeight) {
            height += upSpeed;
            height -= downSpeed;
            count++;
        }

        return count;
    }

}
