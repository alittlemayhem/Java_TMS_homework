package homework6.computer;

public class HDD {

    public String name;
    public int capacity;
    public String type;

    public HDD() {}

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HDD: " + name + " with capacity: " + capacity + " and of type: " + type;
    }
}
