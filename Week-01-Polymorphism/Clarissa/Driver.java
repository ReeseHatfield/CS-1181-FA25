import java.util.*;

public class Driver
{
    static Random r = new Random();

    public static void main(String[] args)
    {
        // we can't call growAnEggplant() because at compile time
        // only the type on the left hand side is considered
//        Plant p1 = new Eggplant();
//        p1.growAnEggplant();

        // example of polymorphism
        ArrayList<Plant> garden = new ArrayList<>();

        garden.add(new Eggplant());
        garden.add(new Eggplant());
        garden.add(new VenusFlyTrap());


        // cannot do this because at compile time the compiler only looks
        // at the type on the left, so we don't know for sure if it is an
        // Eggplant object
        // garden.get(1).growAnEggplant();

        // i can force a cast but i have to accept the risk
        // i.e. I need to know the actual type of the object
        // otherwise a ClassCastException can be thrown
        Eggplant e = (Eggplant) garden.get(1);
        e.growAnEggplant();

        // if i want to verify the actual type of object
        // i can use the instanceof keyword
        if (garden.get(0) instanceof Eggplant)
        {
            ((Eggplant) garden.get(0)).growAnEggplant();
        }

        for (int i = 0; i < 32; i++)
        {
            for (Plant p : garden)
            {
                //p.grow(r.nextInt(31));
                water(p);
                p.photosynthesis(r.nextInt(31));
            }
        }

        garden.get(0).setHeight(garden.get(2).getHeight());
        System.out.println("Unsorted: \n" + garden);
        Collections.sort(garden);
        System.out.println("Sorted: \n" + garden);

//        for (Plant p : garden)
//        {
//            System.out.println(p);
//        }

        Human h = new Human();
        eatDinner(h);
        if (garden.get(0) instanceof VenusFlyTrap)
        {
            eatDinner((VenusFlyTrap) garden.get(0));
        }
    }

    // example of polymorphism
    public static void water(Plant p)
    {
        p.grow(r.nextInt(3));

        // can only call methods of the Plant class
        // unless I cast
        // p.growAnEggplant();
    }

    // dynamic dispatch example
    // we can't create a Consumer object
    // BUT we can use it as a parameter type
    // that then requires that the parameter we pass in
    // implements consumer
    public static void eatDinner(Consumer c)
    {
        c.eat();
        System.out.println("Yum yum");
    }
}
