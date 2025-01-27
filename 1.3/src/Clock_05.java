// 1.3 - Task 05

public class Clock_05 {
    private int timeIncrement;

    private static Clock_05 instance;
    private int time;

    private Clock_05() {
        time = 0;
    }

    public static Clock_05 getInstance() {
        if (instance == null) {
            instance = new Clock_05();
        }
        return instance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void incrementTime(int delta) {
        this.time += delta;
        timeIncrement = delta;
    }

    public int getTimeIncrement() {
        return timeIncrement;
    }

    public static void main(String[] args) {
        Clock_05 clock = Clock_05.getInstance();

        System.out.println("Initial time: " + clock.getTime());

        clock.setTime(1000);
        System.out.println("Setting time to: " + clock.getTime());

        clock.incrementTime(250);
        System.out.println("Time after incrementing by " + clock.getTimeIncrement() + ": " + clock.getTime());

        clock.incrementTime(750);
        System.out.println("Time after incrementing by " + clock.getTimeIncrement() + ": " + clock.getTime());

        Clock_05 anotherClockInstance = Clock_05.getInstance();
        System.out.println("Time from another instance: " + anotherClockInstance.getTime());

    }
}
