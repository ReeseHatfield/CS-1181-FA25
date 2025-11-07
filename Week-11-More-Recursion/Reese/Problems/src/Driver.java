import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {


        Consumer c = new Consumer() {

            @Override
            public String consume() {
                return "hello";
            }
            
        };
        

        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 11, 4, 11, 11, 1, 11));


        // System.out.println(RecursiveMethods.count11s(list));

        // System.out.println(list);


        // LinkedList list = new LinkedList();

        // System.out.println("list before");
        // list.add("Alice");
        // list.add("Bob");
        // list.add("Charlie");
        // list.print();
        // System.out.println();


        // System.out.println("List after:");

        // list.addAtIndex("Hello", 6);
        // list.print();


        ArrayList<String> list = new ArrayList<>(Arrays.asList("ab", "cd", "ef", "gh"));

        System.out.println(indexOfValue(list, "ef", 0));


    }


    // inclusive, exclusive


    public static int indexOfValue(List<String> searchMe, String target){

        //doing some piece of work
        // that is proportional to the searchMe

        // O(N) -> linear search
        for(int i = 0; i < searchMe.size(); i++){
            if(searchMe.get(i).equals(target)){
                return i;
            }
        }

        return -1;
    }


    public static int indexOfValue(List<String> searchMe, String target, int curIndex){

        System.out.println(searchMe);

        if(searchMe.isEmpty()){
            return -1;
        }

        if(target.equals(searchMe.get(0))){
            return curIndex;
        }


        return indexOfValue(searchMe.subList(1, searchMe.size()), target,  curIndex  + 1);

    }


}