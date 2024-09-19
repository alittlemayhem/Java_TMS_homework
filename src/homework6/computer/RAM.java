package homework6.computer;

public class RAM {
    public String name;
    public int capacity;

    public RAM() {}

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RAM: " + name + " with capacity: " + capacity;
    }
}