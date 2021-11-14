package primus.pawel;
// Execute me nTimes
// 7kyu
// https://www.codewars.com/kata/5b2b4836b6989d207700005b/train/java
// 2021-11-14 T:23:42:52
class Exercise_285 {

    public void execute(Runnable action, int nTimes) {

        for (int i = 0; i<nTimes; i++){
            (new Thread(action)).start();
        }
        while(Thread.activeCount() > 1) {}
    }
}
