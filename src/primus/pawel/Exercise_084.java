package primus.pawel;
// Building blocks
// 7kyu
// https://www.codewars.com/kata/55b75fcf67e558d3750000a3/train/java
// 2021-04-19 T:22:47:42
class Exercise_084 {

    public class Block{

        private final int width;
        private final int length;
        private final int height;

        Block(int... dimensions) {
            this.width = dimensions[0];
            this.length = dimensions[1];
            this.height = dimensions[2];
        }

        public int getWidth(){
            return width;
        }

        public int getLength(){
            return length;
        }
        public int getHeight(){
            return height;
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
