package SOLID_Principles.Interface_Segregation_Principle;

public class Programmer implements Workable, Reportable {
    @Override
    public void work() {
        System.out.println("Programmer is writing code.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Programmer is taking a break.");
    }

    @Override
    public void writeReport() {
        System.out.println("Programmer is writing a report.");
    }
}
