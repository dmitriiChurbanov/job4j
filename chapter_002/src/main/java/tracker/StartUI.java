package tracker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("first");
        tracker.add(item);
        System.out.println(tracker.findById(1));
    }
}