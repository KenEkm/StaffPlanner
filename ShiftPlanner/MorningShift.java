import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class MorningShift {
    private LocalDate date;
    private ArrayList<Worker> workersAss = new ArrayList<>();
    private ArrayList<Worker> workersRec = new ArrayList<>();
    private ArrayList<Worker> workersPZR = new ArrayList<>();
    private ArrayList<Worker> workersOrg = new ArrayList<>();

    public MorningShift(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public ArrayList<Worker> getWorkersPZR() {
        return workersPZR;
    }

    public void addWorkersPZR(Worker worker) {
        workersPZR.add(worker);
    }

    public ArrayList<Worker> getWorkersOrg() {
        return workersOrg;
    }

    public void addWorkersOrg(Worker worker) {
        workersOrg.add(worker);
    }

    public void printAllWorkersMorningShift(){
        System.out.println("ShiftPlan for: " + date);
        System.out.println("Morning Shift Assist:");
        for(Worker i : workersAss){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift Reception:");
        for(Worker i : workersRec){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift PZR:");
        for(Worker i : workersPZR){
            System.out.println(i.getName());
        }
        System.out.println("Morning Shift Orga:");
        for(Worker i : workersOrg){
            System.out.println(i.getName());
        }
    }
}
