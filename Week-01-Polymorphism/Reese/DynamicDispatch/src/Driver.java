public class Driver {

    public static void main(String[] args) {
        
        LogList ll = new LogList();

        ll.addLog("Event 1 has occured");
        ll.addLog("Event 2 has occured");
        ll.addLog("Event 3 has occured");
        ll.addLog("Event 4 has occured");
        ll.addLog("Event 5 has occured");
        ll.addLog("Event 6 has occured");

        ll.printEveryOther();

        // ll.
    }
}