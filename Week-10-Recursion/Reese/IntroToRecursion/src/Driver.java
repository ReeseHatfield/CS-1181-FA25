public class Driver {

    public static void main(String[] args) {


        printTriangle(15);
        
        // System.out.println(countOccurrences('l', "hello"));
        // System.out.println(countOccurrences('o', "potatooo"));


        // System.out.println(endX("xx_hello_xx"));
        // System.out.println(endX("xx"));
        // System.out.println(endX(""));


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


    public static String endX(String input){
        if (input.isEmpty()){
            return input; // return ""
        }

        char first = input.charAt(0);

        if(first == 'x'){


            return endX(input.substring(1)) + first;
        } else {

            // endX(input.sub)
            // recursion call endX

            return first + endX(input.substring(1));
        }
    }


    public static void printTriangle(int targetHeight){
        printTriangleHelper(1, targetHeight);
    }

    public static void printTriangleHelper(int currentHeight, int targetHeight) {
        if(currentHeight == targetHeight){
            return;
        }

        // goal: kill this loop
        printAsterix(currentHeight);
        System.out.println();

        printTriangleHelper(currentHeight + 1, targetHeight);
    }

    public static void printAsterix(int timesToPrint){
        // System.out.print();

        if(timesToPrint == 0){
            return;
        }

        System.out.print("* ");
        printAsterix(timesToPrint - 1);
    }
}