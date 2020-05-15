public class Laptop {
    private int MonitorSize;
    private String Color;
    private String processor;
    private int ram;
    private int HardDisk;

    public void turnOn() {
        System.out.println("Laptop switched on now…");
    }

    public void TurnOff() {
        System.out.println("Laptop is off now...");
    }

    public void idle() {
        System.out.println("Laptop is in idle mode now…");
    }

    public void running() {
        System.out.println("Laptop is currently running …");
    }

}