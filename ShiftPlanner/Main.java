import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static GenerateShiftPlanManually generateShiftPlanManually = new GenerateShiftPlanManually();
    public static LocalDate date;

    public static void main(String args[]){
    MorningShift morningShift = new MorningShift(date = LocalDate.now(), new int[]{2, 1, 2, 1});
    generateShiftPlanManually.initializeMorningShift(morningShift);
    AfternoonShift afternoonShift = new AfternoonShift(date = LocalDate.now(), new int[]{2, 1, 2, 1});
    generateShiftPlanManually.initializeAfternoonShift(morningShift, afternoonShift);
    }
}
