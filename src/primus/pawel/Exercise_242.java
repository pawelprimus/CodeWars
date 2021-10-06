package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Sort the columns of a csv-file
// 6kyu
// https://www.codewars.com/kata/57f7f71a7b992e699400013f/train/java
// 2021-10-04 T:19:20:56
class Exercise_242 {
    public static String sortCsvColumns(String csvFileContent) {
        String[] rows = csvFileContent.split("\n");
        List<Column> columnList = new ArrayList<>();
        String[] firstRow = rows[0].split(";");
        for (String columnName : firstRow) {
            Column column = new Column(columnName);
            columnList.add(column);
        }

        for (int i = 1; i < rows.length; i++) {
            String[] row = rows[i].split(";");
            for (int j = 0; j < row.length; j++) {
                columnList.get(j).addValueToList(row[j]);
            }
        }

        Collections.sort(columnList);
        StringBuilder result = new StringBuilder();
        for (Column column : columnList) {
            result.append(column.getColumnName()).append(";");
        }
        result.deleteCharAt(result.length() - 1);

        result.append("\n");

        for (int i = 0; i < columnList.get(0).getValues().size(); i++) {
            for (int j = 0; j < columnList.size(); j++) {
                result.append(columnList.get(j).getValues().get(i)).append(";");
            }
            result.deleteCharAt(result.length() - 1);
            result.append("\n");
        }

        return result.toString().trim();
    }

    public static class Column implements Comparable<Column> {
        String columnName;
        List<String> values;

        Column(String columnName) {
            this.columnName = columnName;
            this.values = new ArrayList<>();
        }

        String getColumnName() {
            return columnName;
        }

        List<String> getValues() {
            return values;
        }

        void addValueToList(String value) {
            this.values.add(value);
        }

        @Override
        public String toString() {
            return "Column{" +
                    "columnName='" + columnName + '\'' +
                    ", values=" + values.toString() +
                    '}';
        }

        @Override
        public int compareTo(Column o) {
            return this.getColumnName().toUpperCase().compareTo(o.getColumnName().toUpperCase());
        }
    }

    public static void main(String[] args) {

        String preSorting = "myjinxin2015;raulbc777;smile67;Dentzil;SteffenVogel_79\n"
                + "17945;10091;10088;3907;10132\n"
                + "2;12;13;48;11";
        System.out.println(sortCsvColumns(preSorting));
    }

}


