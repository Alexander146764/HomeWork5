package HomeWork6;


public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) throws IllegalArgumentException {
        if (minFloor >= maxFloor) {
            throw new IllegalArgumentException("Нельзя соэдать такой диапозон этажей.");
        }

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
    }

    public Elevator(int maxFloor) {
        this(1, maxFloor);
    }

    public void move(int floor) throws IllegalArgumentException {
        if (floor >= minFloor && floor <= maxFloor) {

            System.out.println("Лифт поднялся на " + floor + " этаж.");
        } else {
            throw new IllegalArgumentException("Нельзя подняться на этот этаж.");
        }

        currentFloor = floor;
    }

    @Override
    public String toString() {
       return "[" + minFloor + ", " + maxFloor + "] -> " + currentFloor;
    }

    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(1, 7);
        System.out.println("Начальный этаж: " + elevator1);

        elevator1.move(4);

        Elevator elevator2 = new Elevator(10);
        System.out.println("Начальный этаж: " + elevator2);

        elevator2.move(12);

    }
}