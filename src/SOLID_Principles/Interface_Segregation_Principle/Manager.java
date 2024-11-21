package SOLID_Principles.Interface_Segregation_Principle;

public class Manager implements Workable, Meetable, Reportable {
    @Override
    public void work() {
        System.out.println("Manager is managing teams.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a break.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is attending a meeting.");
    }

    @Override
    public void writeReport() {
        System.out.println("Manager is writing a report.");
    }
}
