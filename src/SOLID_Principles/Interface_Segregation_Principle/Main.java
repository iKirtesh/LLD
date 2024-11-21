package SOLID_Principles.Interface_Segregation_Principle;

public class Main {
    public static void main(String[] args) {
        Workable programmer = new Programmer();
        programmer.work();
        programmer.takeBreak();
        ((Reportable) programmer).writeReport();

        Workable manager = new Manager();
        manager.work();
        manager.takeBreak();
        ((Meetable) manager).attendMeeting(); // Works fine
        ((Reportable) manager).writeReport(); // Works fine

    }
}
