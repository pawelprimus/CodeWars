package primus.pawel;
// Coloured Triangles
// 7kyu
// https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/train/java
// 2021-10-09 T:13:32:31
class Exercise_246 {

    public static char triangle(final String row) {
        if(row.length() == 1 ){
            return row.charAt(0);
        }
        if(row == null){
            return 0;
        }

        StringBuilder oldRow = new StringBuilder(row);
        StringBuilder newRow = new StringBuilder();
        for (int i = 0; i < row.length() - 1; i++) {
            newRow = new StringBuilder();
            for (int j = 0; j < row.length() - i - 1; j++) {
                newRow.append(sumColours(oldRow.charAt(j), oldRow.charAt(j+1)));
            }
            oldRow = new StringBuilder(newRow);
        }
        return newRow.charAt(0);
    }
    
    public static Character sumColours(char col_1, char col_2){
        String color = String.valueOf(col_1) + String.valueOf(col_2);
        if (col_1 == col_2){
            return col_1;
        }
        if(color.contains("B") && color.contains("G")){
            return 'R';
        }
        if(color.contains("R") && color.contains("G")){
            return 'B';
        }
        if(color.contains("B") && color.contains("R")){
            return 'G';
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println( triangle("RRGBRGBB"));
    }
}
