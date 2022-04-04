package primus.pawel;

// How far will I go?
// 7kyu
// https://www.codewars.com/kata/56d46b8fda159582e100001b/train/java
// 2022-04-05 T:00:09:26
class Exercise_408 {

    public static int travel(int totalTime, int runTime, int restTime, int speed) {

        int runnedMeters = 0;
        int loopRuntime = runTime;

        while (totalTime > 0) {
            while (loopRuntime > 0) {
                loopRuntime--;
                totalTime--;
                runnedMeters += speed;
                if (totalTime <= 0) {
                    return runnedMeters;
                }
            }

            loopRuntime = runTime;
            totalTime -= restTime;
        }

        return runnedMeters;
    }
}
