public class Driver {

    public static void main(String[] args) {
        
        doThing(4);
    }



    public static void doThing(int timesToPrint){


        // control block that exits early
        // base case
        if(timesToPrint == 0) {
            return;
        }


        // work
        System.out.println(timesToPrint);


        // recursive call
        doThing(timesToPrint - 1);
    }
}