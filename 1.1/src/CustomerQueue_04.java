// 1.1 - Task 04
import java.util.Scanner;
import java.util.LinkedList;

public class CustomerQueue_04 {
    private int id;
    private long startTime;
    private long endTime;
    private static int idCount = 1;

    public CustomerQueue_04() {
        setId(idCount);
        idCount++;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Id must be greater than 0");
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long start) {
        startTime = start;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long end) {
        endTime = end;
    }

    public long calculateTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<CustomerQueue_04> queue = new LinkedList<>();

        while (true) {
            System.out.print("Enter (queue/dequeue/exit): ");
            String user_input = scanner.next();

            if (user_input.equals("queue")) {
                CustomerQueue_04 customer = new CustomerQueue_04();
                customer.setStartTime(System.nanoTime());
                queue.addFirst(customer);
                System.out.println("Customer " + customer.getId() + " added to the queue.");
            } else if (user_input.equals("dequeue")) {
                if (!queue.isEmpty()) {
                    CustomerQueue_04 customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());
                    System.out.println("Customer " + customer.getId() + " served. Time spent in queue: " + customer.calculateTime() + " nanoseconds.");
                } else {
                    System.out.println("No customers in the queue.");
                }
            } else if (user_input.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
    }
}
