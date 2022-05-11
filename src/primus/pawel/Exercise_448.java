package primus.pawel;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Columnize
// 6kyu
// https://www.codewars.com/kata/6087bb6050a6230049a068f1/train/java
// 2022-05-11 T:20:20:42
class Exercise_448 {

    private static final String SEPARATE = " | ";
    private static final String NEW_LINE = "\n";

    public static String columnize(String[] input, int numberOfColumns) {
        StringBuilder result = new StringBuilder();

        if (numberOfColumns > input.length) {
            numberOfColumns = input.length;
        }

        int columnIndex = 1;
        int[] maxLengthInColumns = new int[numberOfColumns];

        ArrayList<Cell> cells = new ArrayList<>();

        for (String text : input) {
            Cell cell = new Cell(text, columnIndex);
            cells.add(cell);
            columnIndex++;
            if (columnIndex > numberOfColumns) {
                columnIndex = 1;
            }
        }

        for (int i = 0; i < numberOfColumns; i++) {
            AtomicInteger ordinal = new AtomicInteger(i + 1);
            maxLengthInColumns[i] = cells.stream().filter(b -> b.getColumn() == ordinal.get()).mapToInt(c -> c.getText().length()).max().orElse(0);
        }

        cells.stream().forEach(i -> i.adjustToLength(maxLengthInColumns[i.getColumn() - 1]));

        columnIndex = 1;

        for (int i = 0; i < cells.size() - 1; i++) {
            columnIndex++;
            if (columnIndex <= numberOfColumns) {
                result.append(cells.get(i).getText()).append(SEPARATE);
            } else {
                result.append(cells.get(i).getText()).append(NEW_LINE);
                columnIndex = 1;
            }
        }

        result.append(cells.get(cells.size() - 1).getText());

        return result.toString();
    }

    public static void main(String[] args) {
        String[] input = {"1", "12", "123", "1234", "12345", "123456"};
        String[] input2 = { "", "12", "123", "", "12345", "" };
        var expected = "      | 12\n"
                + "123   |   \n"
                + "12345 |   ";
        System.out.println(columnize(input2, 2));
        System.out.println(expected);
    }
}

class Cell {

    private static final String SPACE = " ";

    public String text;
    public int column;

    Cell(final String text, final int column) {
        this.text = text;
        this.column = column;
    }

    String getText() {
        return text;
    }

    int getColumn() {
        return column;
    }

    public void adjustToLength(int length) {
        if ((length - text.length()) > 0) {
            text = text + SPACE.repeat(length - text.length());
        }
    }


    @Override
    public String toString() {
        return "Cell{" +
                "text='" + text + '\'' +
                ", column=" + column +
                '}';
    }
}
