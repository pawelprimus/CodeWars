package primus.pawel;

import java.time.YearMonth;

//
//
//
//
class Exercise_227_todo {

    public static String[] solve(int a, int b) {

        YearMonth yearMonth = YearMonth.now();
        String firstYearMonth = "";
        String lastYearMonth = "";
        int monthWithExtendedWeekdays = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= 12; j++) {
                yearMonth = YearMonth.of(i, j);

                if (isMonthHasExtendedWeekends(yearMonth) || firstYearMonth.equals(null)) {
                    monthWithExtendedWeekdays++;

                    if(firstYearMonth.length() ==0){
                        firstYearMonth = yearMonth.getMonth().toString();
                    }

                    if(i == b || i == b - 1){
                        lastYearMonth = yearMonth.getMonth().toString();
                    }
                }
            }
        }

        System.out.println(firstYearMonth);
        System.out.println(lastYearMonth);
        System.out.println(monthWithExtendedWeekdays);

        return new String[]{firstYearMonth, lastYearMonth, String.valueOf(monthWithExtendedWeekdays)};
    }

    static boolean isMonthHasExtendedWeekends(YearMonth yearMonth) {

        int weekDays = 0;
        int currentDay;

        for (int i = 1; i <= yearMonth.lengthOfMonth(); i++) {
            currentDay = yearMonth.atDay(i).getDayOfWeek().getValue();
            if (currentDay == 5 || currentDay == 6 || currentDay == 7) {
                weekDays++;
            }
        }
        return weekDays > 14;
    }

    public static void main(String[] args) {


        System.out.println(solve(1900, 1950));
        /*YearMonth yearMonth = YearMonth.of(1950, 1);
        System.out.println(yearMonth.getMonth());
        int len = yearMonth.lengthOfMonth(); // 28-31, supporting leap year
        int dow = yearMonth.atDay(1).getDayOfWeek().getValue(); // 1=Mon, 7=Sun

        System.out.println(dow);
    */
    }

}
