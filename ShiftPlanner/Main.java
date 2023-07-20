import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class Main {

    public static HashMap<Integer, GenerateShiftPlanWeek> shiftPlansWeek;
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

        shiftPlansWeek = new HashMap<>();
        shiftPlansWeek.put(weekNumber, new GenerateShiftPlanWeek(date, weekNumber, new int[]{2, 1, 2, 1}));

        //accessing infos of peviously generated shift plan for a week by week number as index
        ArrayList<Worker> workers = shiftPlansWeek.get(29).getMorningShifts().get("MONDAY").getWorkersAss();
        for(int i = 0; i < workers.size(); i++){
            System.out.println(workers.get(i).getName());
        }
    }
}
