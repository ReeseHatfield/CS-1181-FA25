public class Driver {

    public static void main(String[] args) {
        
        System.out.println(countOccurrences('l', "hello"));
        System.out.println(countOccurrences('o', "potatooo"));





        // System.out.println(fibbonacci(0));
        // System.out.println(fibbonacci(1));
        // System.out.println(fibbonacci(6));


        // System.out.println(fibbonacci());

        // doThing(4);
    }

    // fibbonacci
    // 0 1 2 3 4 5 6 ...
    // 1 1 2 3 5 8 13 ... 

    // f(n) = f(n-1) + f(n-2)

    public static int fibbonacci(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return fibbonacci(n-1) + fibbonacci(n-2);
    }



    public static int countOccurrences(char target, String searchMe){
        return countOccurrencesHelper(target, searchMe, 0);
    }


    public static int countOccurrencesHelper(char target, String searchMe, int found){
        // "o" "potato" -> 2
        // "o" "" -> 

        if(searchMe.length() == 0){
            return found;
        }

        char firstLetter = searchMe.charAt(0);

        if(firstLetter == target) {
            found += 1;
        }

        return countOccurrencesHelper(target, searchMe.substring(1), found);
        // 2
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