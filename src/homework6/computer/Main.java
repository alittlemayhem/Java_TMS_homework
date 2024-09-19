package homework6.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1600, "Gaming");
        computer1.displayInfo();

        Computer computer2 = new Computer(3700, "Makbook", new RAM("ram1", 64), new HDD("hdd1", 128, "usual"));
        computer2.displayInfo();
    }
}