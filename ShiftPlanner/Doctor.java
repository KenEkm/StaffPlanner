import java.util.ArrayList;

public class Doctor {

    private String name;
    private boolean morningShift = false;
    private boolean afternoonShift = false;
    private ArrayList<String> workingDays = new ArrayList<>();

    private float monthlyWorkingHours;

    private int daysOfSickLeave;

    public Doctor(String name, boolean morningShift, boolean afternoonShift, ArrayList<String> workingDays) {
        this.name = name;
        this.morningShift = morningShift;
        this.afternoonShift = afternoonShift;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMorningShift() {
        return morningShift;
    }

    public void setMorningShift(boolean morningShift) {
        this.morningShift = morningShift;
    }

    public boolean isAfternoonShift() {
        return afternoonShift;
    }

    public void setAfternoonShift(boolean afternoonShift) {
        this.afternoonShift = afternoonShift;
    }

    public ArrayList<String> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(ArrayList<String> workingDays) {
        this.workingDays = workingDays;
    }

    public float getMonthlyWorkingHours() {
        return monthlyWorkingHours;
    }

    public void setMonthlyWorkingHours(float monthlyWorkingHours) {
        this.monthlyWorkingHours = monthlyWorkingHours;
    }

    public int getDaysOfSickLeave() {
        return daysOfSickLeave;
    }

    public void setDaysOfSickLeave(int daysOfSickLeave) {
        this.daysOfSickLeave = daysOfSickLeave;
    }
}
