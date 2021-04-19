package primus.pawel;
// Building blocks
// 7kyu
// https://www.codewars.com/kata/55b75fcf67e558d3750000a3/train/java
// 2021-04-19 T:22:47:42
class Exercise_084 {

    public class Block{
        private int[] dimenson = new int[3];

        Block(int[] dimenson) {
            this.dimenson = dimenson;
        }

        public int getWidth(){
            return dimenson[0];
        }

        public int getLength(){
            return dimenson[1];
        }
        public int getHeight(){
            return dimenson[2];
        }

        public int getVolume(){
            return getWidth()*getLength()*getHeight();
        }

        public int getSurfaceArea(){
            return 2*getWidth()*getLength() +  2*getLength()*getHeight() + 2*getWidth()*getHeight();
        }

    }

    public static void main(String[] args) {

    }


}
