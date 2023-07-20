import java.time.LocalDate;
import java.util.ArrayList;

public class GenerateShiftPlanDay {
    public ArrayList<String> workingDaysAll = new ArrayList<>();
    public ArrayList<String> workingDaysMoWeFr = new ArrayList<>();
    public ArrayList<String> workingDaysTuTh = new ArrayList<>();

    public ArrayList<String> prefPosAll = new ArrayList<>();
    public ArrayList<String> prefPosRecOrg = new ArrayList<>();
    public ArrayList<String> prefPosPzr = new ArrayList<>();
    public Worker helga;
    public Worker maxi;
    public Worker phoebe;
    public Worker rachel;
    public Worker monica;
    public Worker lilly;
    public Worker chandler;
    public Worker joey;
    public Worker ross;
    public Worker william;
    public Worker louis;
    public Worker peter;
    public LocalDate date;

    public void initializeMorningShift(MorningShift morningShift){
        initialize();

        String weekDay = String.valueOf(morningShift.getDate().getDayOfWeek());
        System.out.println(weekDay);

        addWorkerToMorningShift(morningShift, helga, weekDay);
        addWorkerToMorningShift(morningShift, maxi, weekDay);
        addWorkerToMorningShift(morningShift, phoebe, weekDay);
        addWorkerToMorningShift(morningShift, rachel, weekDay);
        addWorkerToMorningShift(morningShift, monica, weekDay);
        addWorkerToMorningShift(morningShift, lilly, weekDay);
        morningShift.printAllWorkersMorningShift();
    }

    public void initializeAfternoonShift(MorningShift morningShift, AfternoonShift afternoonShift){

        String weekDay = String.valueOf(afternoonShift.getDate().getDayOfWeek());
        System.out.println(weekDay);

        addWorkerToAfternoonShift(morningShift, afternoonShift, helga, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, maxi, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, phoebe, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, rachel, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, monica, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, lilly, weekDay);

        addWorkerToAfternoonShift(morningShift, afternoonShift, chandler, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, joey, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, ross, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, william, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, louis, weekDay);
        addWorkerToAfternoonShift(morningShift, afternoonShift, peter, weekDay);
        afternoonShift.printAllWorkersAfternoonShift();
    }

    public void addWorkerToMorningShift(MorningShift morningShift, Worker worker, String weekDay){

        if(worker.isMorningShift() && checkWorkingDay(worker,weekDay)){
            if(checkPrefPos(worker, "ass") && morningShift.getWorkersAss().size() < morningShift.getSpecReqStaffCount(0)) {
                morningShift.addWorkersAss(worker);
                morningShift.addAllWorkersMorningShift(worker);
            }
            else if(checkPrefPos(worker, "rec") && morningShift.getWorkersRec().size() < morningShift.getSpecReqStaffCount(1)){
                morningShift.addWorkersRec(worker);
                morningShift.addAllWorkersMorningShift(worker);
            }
            else if(checkPrefPos(worker, "pzr") && morningShift.getWorkersPzr().size() < morningShift.getSpecReqStaffCount(2)){
                morningShift.addWorkersPzr(worker);
                morningShift.addAllWorkersMorningShift(worker);
            }
            else if(checkPrefPos(worker, "org") && morningShift.getWorkersOrg().size() < morningShift.getSpecReqStaffCount(3)){
                morningShift.addWorkersOrg(worker);
                morningShift.addAllWorkersMorningShift(worker);
            }
        }
    }

    public void addWorkerToAfternoonShift(MorningShift morningShift, AfternoonShift afternoonShift, Worker worker, String weekDay){
        if(worker.isAfternoonShift() && checkWorkingDay(worker, weekDay)){
            ArrayList allWorkersMorn = morningShift.getAllWorkersMorningShift();
            for(int i = 0; i < allWorkersMorn.size(); i++){
                if(allWorkersMorn.get(i) == worker){
                    return;
                }
            }
            if(checkPrefPos(worker, "ass") && afternoonShift.getWorkersAss().size() < afternoonShift.getSpecReqStaffCount(0)){
                afternoonShift.addWorkersAss(worker);
                afternoonShift.addAllWorkersAfternoonShift(worker);
            }
            else if(checkPrefPos(worker, "rec") && afternoonShift.getWorkersRec().size() < afternoonShift.getSpecReqStaffCount(1)){
                afternoonShift.addWorkersRec(worker);
                afternoonShift.addAllWorkersAfternoonShift(worker);
            }
            else if(checkPrefPos(worker, "pzr") && afternoonShift.getWorkersPzr().size() < afternoonShift.getSpecReqStaffCount(2)){
                afternoonShift.addWorkersPzr(worker);
                afternoonShift.addAllWorkersAfternoonShift(worker);
            }
            else if(checkPrefPos(worker, "org") && afternoonShift.getWorkersOrg().size() < afternoonShift.getSpecReqStaffCount(3)){
                afternoonShift.addWorkersOrg(worker);
                afternoonShift.addAllWorkersAfternoonShift(worker);
            }
        }
    }

    public Boolean checkWorkingDay(Worker worker, String weekDay){
        ArrayList workingDays = worker.getWorkingDays();
        for(int i = 0; i < workingDays.size(); i++) {
            if (workingDays.get(i).equals(weekDay)){
                return true;
            }
        }
        return false;
    }

    public Boolean checkPrefPos(Worker worker, String pos){
        ArrayList prefPos = worker.getPreferredPosition();
        for(int i = 0; i < prefPos.size(); i++) {
            if (prefPos.get(i).equals(pos)){
                //System.out.println(worker.getName() + " preferred position is: " + pos);
                return true;
            }
        }
        return false;
    }

    //initializes environment for testing various scenarios
    private void initialize(){
        setWorkingDaysAll();
        setWorkingDaysMoWeFr();
        setWorkingDaysTuTh();
        setPrefPosAll();
        setPrefPosPzr();
        setPrefPosRecOrg();
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

    private void setPrefPosPzr(){
        prefPosPzr.add("pzr");
    }

    private void setPrefPosRecOrg(){
        prefPosRecOrg.add("rec");
        prefPosRecOrg.add("org");
    }

    private void setWorker(){
        helga = new Worker("helga", true, true,
                true, true, true, true, workingDaysAll, prefPosRecOrg);

        maxi = new Worker("maxi", true, true,
                true, true, true, true, workingDaysAll, prefPosPzr);

        phoebe = new Worker("phoebe", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        rachel = new Worker("rachel", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        monica = new Worker("monica", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        lilly = new Worker("lilly", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        chandler = new Worker("chandler", true, true,
                true, true, true, true, workingDaysAll, prefPosRecOrg);

        joey = new Worker("joey", true, true,
                true, true, true, true, workingDaysAll, prefPosPzr);

        ross = new Worker("ross", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        william = new Worker("william", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        louis = new Worker("louis", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);

        peter = new Worker("peter", true, true,
                true, true, true, true, workingDaysAll, prefPosAll);
    }

}
