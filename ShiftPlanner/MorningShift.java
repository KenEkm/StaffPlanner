import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class MorningShift {
    private LocalDate date;
    private int[] reqStaffCount = {0,0,0,0};
    private ArrayList<Worker> workersAss = new ArrayList<>();
    private ArrayList<Worker> workersRec = new ArrayList<>();
    private ArrayList<Worker> workersPzr = new ArrayList<>();
    private ArrayList<Worker> workersOrg = new ArrayList<>();
    private ArrayList<Worker> allWorkersMorningShift = new ArrayList<>();

    public MorningShift(LocalDate date, int[] reqStaffCount) {
        this.date = date;
        this.reqStaffCount = reqStaffCount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int[] getReqStaffCount() {
        return reqStaffCount;
    }

    public int getSpecReqStaffCount(int i){
        return reqStaffCount[i];
    }

    public void setReqStaffCount(int[] reqStaffCount) {
        this.reqStaffCount = reqStaffCount;
    }

    public ArrayList<Worker> getWorkersAss() {
        return workersAss;
    }

    public void addWorkersAss(Worker worker) {
        workersAss.add(worker);
    }

    public ArrayList<Worker> getWorkersRec() {
        return workersRec;
    }

    public void addWorkersRec(Worker worker) {
        workersRec.add(worker);
    }

    public ArrayList<Worker> getWorkersPzr() {
        return workersPzr;
    }

    public void addWorkersPzr(Worker worker) {
        workersPzr.add(worker);
    }

    public ArrayList<Worker> getWorkersOrg() {
        return workersOrg;
    }

    public void addWorkersOrg(Worker worker) {
        workersOrg.add(worker);
    }

    public ArrayList<Worker> getAllWorkersMorningShift() {
        return allWorkersMorningShift;
    }

    public void addAllWorkersMorningShift(Worker worker) {
        allWorkersMorningShift.add(worker);
    }

    public void printAllWorkersMorningShift(){
        System.out.println("### ShiftPlan for: " + date + " ###");
        System.out.println("Morning Shift Assist:");
        for(Worker i : workersAss){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift Reception:");
        for(Worker i : workersRec){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift PZR:");
        for(Worker i : workersPzr){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift Orga:");
        for(Worker i : workersOrg){
            System.out.println(i.getName());
        }
    }
}
