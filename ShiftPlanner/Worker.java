import java.util.ArrayList;
import java.util.HashMap;

public class Worker {
    private String name;
    private boolean positionAss = false;
    private boolean positionRec = false;
    private boolean positionPzr = false;
    private boolean positionOrg = false;
    private boolean morningShift = false;
    private boolean afternoonShift = false;

    private HashMap<Integer, Float> workingHours = new HashMap<Integer, Float>();
    private ArrayList<String> workingDays = new ArrayList<String>();
    private ArrayList<String> preferredPosition = new ArrayList<String>();

    private int daysOfSickLeave;
    private int daysOfHoliday;

    public Worker(String name, boolean positionAss, boolean positionRec, boolean positionPzr,
                  boolean positionOrg, boolean morningShift, boolean afternoonShift,
                  ArrayList<String> workingDays, ArrayList<String> preferredPosition) {
        this.name = name;
        this.positionAss = positionAss;
        this.positionRec = positionRec;
        this.positionPzr = positionPzr;
        this.positionOrg = positionOrg;
        this.morningShift = morningShift;
        this.afternoonShift = afternoonShift;
        this.workingDays = workingDays;
        this.preferredPosition = preferredPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPositionAss() {
        return positionAss;
    }

    public void setPositionAss(boolean positionAss) {
        this.positionAss = positionAss;
    }

    public boolean isPositionRec() {
        return positionRec;
    }

    public void setPositionRec(boolean positionRec) {
        this.positionRec = positionRec;
    }

    public boolean isPositionPzr() {
        return positionPzr;
    }

    public void setPositionPzr(boolean positionPzr) {
        this.positionPzr = positionPzr;
    }

    public boolean isPositionOrg() {
        return positionOrg;
    }

    public void setPositionOrg(boolean positionOrg) {
        this.positionOrg = positionOrg;
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

    public ArrayList<String> getPreferredPosition() {
        return preferredPosition;
    }

    public void setPreferredPosition(ArrayList<String> preferredPosition) {
        this.preferredPosition = preferredPosition;
    }

    public HashMap<Integer, Float> getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(HashMap<Integer, Float> workingHours) {
        this.workingHours = workingHours;
    }

    public int getDaysOfSickLeave() {
        return daysOfSickLeave;
    }

    public void setDaysOfSickLeave(int daysOfSickLeave) {
        this.daysOfSickLeave = daysOfSickLeave;
    }

    public int getDaysOfHoliday() {
        return daysOfHoliday;
    }

    public void setDaysOfHoliday(int daysOfHoliday) {
        this.daysOfHoliday = daysOfHoliday;
    }
}
