import java.time.LocalDate;
import java.util.ArrayList;

public class GenerateShiftPlanManually {
    public ArrayList<String> workingDaysAll = new ArrayList<>();
    public ArrayList<String> workingDaysMoWeFr = new ArrayList<>();
    public ArrayList<String> workingDaysTuTh = new ArrayList<>();

    public ArrayList<String> prefPosAll = new ArrayList<>();
    public Worker helga;
    public Worker maxi;
    public Worker phoebe;
    public Worker rachel;
    public Worker monica;
    public LocalDate date;

    public void initializeMorningShift(){
        initialize();

        MorningShift morningShift = new MorningShift(date = LocalDate.now());
        String weekDay = String.valueOf(morningShift.getDate().getDayOfWeek());
        System.out.println(weekDay);

        addWorkerToMorningShift(morningShift, helga, weekDay);
        addWorkerToMorningShift(morningShift, maxi, weekDay);
        addWorkerToMorningShift(morningShift, phoebe, weekDay);
        addWorkerToMorningShift(morningShift, rachel, weekDay);
        addWorkerToMorningShift(morningShift, monica, weekDay);
        morningShift.printAllWorkersMorningShift();
    }

    public void addWorkerToMorningShift(MorningShift morningShift, Worker worker, String weekDay){

        if(checkWorkingDay(worker,weekDay)){
            if(checkPrefPos(worker, "ass")) {
                if(morningShift.getWorkersAss().size() < 2){
                    morningShift.addWorkersAss(worker);
                }
            }
            else if(checkPrefPos(worker, "rec")){
                if(morningShift.getWorkersRec().size() < 1) {
                    morningShift.addWorkersRec(worker);
                }
            }
            else if(checkPrefPos(worker, "pzr")){
                if(morningShift.getWorkersPZR().size() < 1) {
                    morningShift.addWorkersPZR(worker);
                }
            }
            else if(checkPrefPos(worker, "org")){
                if(morningShift.getWorkersOrg().size() < 1) {
                    morningShift.addWorkersOrg(worker);
                }
            }
        }
    }

    public Boolean checkWorkingDay(Worker worker, String weekDay){
        ArrayList workingDays = worker.getWorkingDays();
        for(int i = 0; i < workingDays.size(); i++) {
            if (workingDays.get(i) == weekDay){
                return true;
            }
        }
        return false;
    }

    public Boolean checkPrefPos(Worker worker, String pos){
        ArrayList prefPos = worker.getPreferredPosition();
        for(int i = 0; i < prefPos.size(); i++) {
            if (prefPos.get(i) == pos){
                return true;
            }
        }
        return false;
    }


    private void initialize(){
        setWorkingDaysAll();
        setWorkingDaysMoWeFr();
        setWorkingDaysTuTh();
        setPrefPosAll();
        setWorker();
    }

    private void setWorkingDaysAll(){
        workingDaysAll.add("MONDAY");
        workingDaysAll.add("TUESDAY");
        workingDaysAll.add("WEDNESDAY");
        workingDaysAll.add("THURSDAY");
        workingDaysAll.add("FRIDAY");
    }

    private void setWorkingDaysMoWeFr(){
        workingDaysMoWeFr.add("MONDAY");
        workingDaysMoWeFr.add("WEDNESDAY");
        workingDaysMoWeFr.add("FRIDAY");
    }

    private void setWorkingDaysTuTh(){
        workingDaysTuTh.add("TUESDAY");
        workingDaysTuTh.add("THURSDAY");
    }

    private void setPrefPosAll(){
        prefPosAll.add("ass");
        prefPosAll.add("rec");
        prefPosAll.add("pzr");
        prefPosAll.add("org");
    }

    private void setWorker(){
        helga = new Worker("helga", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        maxi = new Worker("maxi", true, true,
                true, true, true, true, workingDaysMoWeFr, prefPosAll);

        phoebe = new Worker("phoebe", true, true,
                true, true, true, true, workingDaysMoWeFr, prefPosAll);

        rachel = new Worker("rachel", true, true,
                true, true, true, true, workingDaysMoWeFr, prefPosAll);

        monica = new Worker("monica", true, true,
                true, true, true, true, workingDaysMoWeFr, prefPosAll);
    }

}
