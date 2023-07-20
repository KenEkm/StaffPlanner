import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class GenerateShiftPlanWeek {

    private LocalDate date;
    private int weekNumber;
    public GenerateShiftPlanDay generateShiftPlanDay = new GenerateShiftPlanDay();
    private HashMap<String, MorningShift> morningShifts = new HashMap<>();
    private HashMap<String, AfternoonShift> afternoonShits = new HashMap<>();

    public GenerateShiftPlanWeek(LocalDate date, int weekNumber, MorningShift morningShift, AfternoonShift afternoonShift) {
        this.date = date;
        this.weekNumber = weekNumber;

        morningShifts.put(String.valueOf(date.getDayOfWeek()), morningShift);
        afternoonShits.put(String.valueOf(date.getDayOfWeek()), afternoonShift);
    }


}
