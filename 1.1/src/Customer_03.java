// 1.1 - Task 03

public class Customer_03 {
    private int id;
    private long startTime;
    private long endTime;
    private static int idCount = 1;

    public Customer_03() {
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
            System.out.println("Id:n pitää olla suurempi kuin 0");
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
        Customer_03 customer = new Customer_03();
        customer.setStartTime(System.currentTimeMillis());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customer.setEndTime(System.currentTimeMillis());

        System.out.println("Asiakkaalla (" + customer.getId() + ") meni " + customer.calculateTime() + " millisekuntia palvelussa.");

    }
}
