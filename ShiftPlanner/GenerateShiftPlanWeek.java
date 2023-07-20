import java.time.LocalDate;
import java.util.HashMap;

public class GenerateShiftPlanWeek {

    private LocalDate date;
    private int weekNumber;
    public GenerateShiftPlanDay generateShiftPlanDay = new GenerateShiftPlanDay();
    private HashMap<String, MorningShift> morningShifts = new HashMap<>();
    private HashMap<String, AfternoonShift> afternoonShifts = new HashMap<>();
    private int daysToGenerate;

    public GenerateShiftPlanWeek(LocalDate date, int weekNumber, int[] positions) {
        this.date = date;
        this.weekNumber = weekNumber;

        calculateDaysToGenerate(date);


        if(daysToGenerate == 1){
            generateForSpecDays(date, positions);
        } else if(daysToGenerate > 1){
            for(int i = 0; i < daysToGenerate; i++){
                generateForSpecDays(date, positions);
                date = date.plusDays(1);
            }
        }

        for(String i: morningShifts.keySet()){
            System.out.println("### Morning shift generated for: " + i + " " + morningShifts.size() + " ###");
        }
        for(String i: afternoonShifts.keySet()){
            System.out.println("### Afternoon shift generated for: " + i + " " + afternoonShifts.size() + " ###");
        }
    }

    public void calculateDaysToGenerate(LocalDate date){
        if(String.valueOf(date.getDayOfWeek()).equals("MONDAY")){
            daysToGenerate = 5;
            System.out.println("### Set Days to generate to: 5 ###");
        } else if(String.valueOf(date.getDayOfWeek()).equals("TUESDAY")){
            daysToGenerate = 4;
            System.out.println("### Set Days to generate to: 4 ###");
        } else if(String.valueOf(date.getDayOfWeek()).equals("WEDNESDAY")){
            daysToGenerate = 3;
            System.out.println("### Set Days to generate to: 3 ###");
        } else if(String.valueOf(date.getDayOfWeek()).equals("THURSDAY")){
            daysToGenerate = 2;
            System.out.println("### Set Days to generate to: 2 ###");
        } else if(String.valueOf(date.getDayOfWeek()).equals("FRIDAY")){
            daysToGenerate = 1;
            System.out.println("### Set Days to generate to: 1 ###");
        }
    }

    public void generateForSpecDays(LocalDate date, int[] positions){
        MorningShift morningShift = generateMorningShift(date, positions);
        AfternoonShift afternoonShift = generateAfternoonShift(date, positions, morningShift);

        morningShifts.put(String.valueOf(date.getDayOfWeek()), morningShift);
        afternoonShifts.put(String.valueOf(date.getDayOfWeek()), afternoonShift);
    }

    public MorningShift generateMorningShift(LocalDate date, int[] positions){
        MorningShift morningShift = new MorningShift( date, positions);
        generateShiftPlanDay.initializeMorningShift(morningShift);
        return morningShift;
    }

    public AfternoonShift generateAfternoonShift(LocalDate date, int[] positions, MorningShift morningShift){
        AfternoonShift afternoonShift = new AfternoonShift( date, positions);
        generateShiftPlanDay.initializeAfternoonShift(morningShift, afternoonShift);
        return afternoonShift;
    }

    public HashMap<String, MorningShift> getMorningShifts() {
        return morningShifts;
    }

    public HashMap<String, AfternoonShift> getAfternoonShifts() {
        return afternoonShifts;
    }
}
