import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    public static GenerateShiftPlanWeek generateShiftPlanWeek;
    public static GenerateShiftPlanDay generateShiftPlanDay = new GenerateShiftPlanDay();
    public static LocalDate date;
    public static int weekNumber;


    public static void main(String args[]){
        date = LocalDate.now();
        date = date.minusDays(3);
        System.out.println("--- Date: " + date + date.getDayOfWeek() + " ---");
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        weekNumber = date.get(weekFields.weekOfWeekBasedYear());


        System.out.println(" --- Week number: " + weekNumber + " ---");

        generateShiftPlanWeek = new GenerateShiftPlanWeek(date, weekNumber, new int[]{2, 1, 2, 1});
    }
}
