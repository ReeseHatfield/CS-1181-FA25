import java.util.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        String name = "Clarissa";
        Scanner scnr = new Scanner(System.in);
        Double decimal = 8.8;

        ArrayList stuff = new ArrayList();
        stuff.add(name);
        stuff.add(scnr);
        stuff.add(decimal);

        System.out.println(stuff);

        //stuff.get(0).toLowerCase();

        ArrayList names = new ArrayList<>();
        names.add(name);
        names.add("Fred");
        names.add("Bob");

        for (Object n : names)
        {
            System.out.println(((String) n).toUpperCase());
        }

        ArrayList<String> betterNames = new ArrayList<>();
        betterNames.addAll(names);

        for (String n : betterNames)
        {
            System.out.println(n.toUpperCase());
        }

        ArrayList<Blah> fhu = new ArrayList<>();
    }
}
