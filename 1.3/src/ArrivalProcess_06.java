// 1.3 - Task 06
import java.util.Random;

public class ArrivalProcess_06 {
    private int time;
    private String eventType;

    public ArrivalProcess_06() {
        time = 0;
        eventType = "Customer Arrival";
    }

    public void generatedTime() {
        time += (int)(Math.random() * 100);
    }

    public int getTime() {
        return time;
    }

    public String getEventType() {
        return eventType;
    }


    public static void main(String[] args) {
        ArrivalProcess_06 clock = new ArrivalProcess_06();

        System.out.println("Initial time: " + clock.getTime() + "\n");

    }
}

