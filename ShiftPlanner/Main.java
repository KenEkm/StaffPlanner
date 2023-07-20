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
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        weekNumber = date.get(weekFields.weekOfWeekBasedYear());

        
        System.out.println("Kalenderwoche: " + weekNumber);

        MorningShift morningShift = new MorningShift( date, new int[]{2, 1, 2, 1});
        generateShiftPlanDay.initializeMorningShift(morningShift);


        AfternoonShift afternoonShift = new AfternoonShift( date, new int[]{2, 1, 2, 1});
        generateShiftPlanDay.initializeAfternoonShift(morningShift, afternoonShift);


        generateShiftPlanWeek = new GenerateShiftPlanWeek(date, weekNumber, morningShift, afternoonShift);
    }
}
