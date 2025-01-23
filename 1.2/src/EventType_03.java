// 1.2 - Task 02
import java.util.PriorityQueue;

public class EventType_03 {
    enum eventType {
        Arrivals,
        Exit
    }

    static class Event implements Comparable<Event> {
        private final String name;
        private final int time;
        private final eventType type;

        public Event(String name, int time, eventType type) {
            this.name = name;
            this.time = time;
            this.type = type;
        }

        public int compareTo(Event other) {
            return Integer.compare(this.time, other.time);
        }

        public String toString() {
            return "Event=" + name + ", time=" + time + ", eventType=" + type;
        }
    }

    static class EventList {
        private final PriorityQueue<Event> events;

        public EventList() {
            events = new PriorityQueue<>();
        }

        public void addEvent(Event event) {
            events.add(event);
        }

        public Event getNextEvent() {
            return events.poll();
        }

        public void printEvents() {
            for (Event event: events) {
                System.out.println(event);
            }
        }
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event("b1", 10, eventType.Arrivals));
        eventList.addEvent(new Event("b2", 5, eventType.Exit));
        eventList.addEvent(new Event("b3", 15, eventType.Arrivals));


        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next event: " + nextEvent);

        System.out.println();

        System.out.println("Remaining events:");
        eventList.printEvents();
    }
}
