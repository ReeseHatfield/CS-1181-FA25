import java.util.*;

public class Driver
{
    static Random r = new Random();

    // throws Exception is really bad style
    // don't do this!
    public static void main(String[] args) throws Exception
    {
        Scanner scnr = new Scanner(System.in);

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
        System.out.println("Sorted by Height: \n" + garden);
        Collections.sort(garden, new PlantAgeComparator());
        System.out.println("Sorted by Age: \n" + garden);

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

        System.out.println("Enter hair:");
        String hair = scnr.next();
        System.out.println("Enter eye:");
        String eye = scnr.next();

        boolean badInput = true;

        while (badInput)
        {
            try
            {
                System.out.println("Enter height:");
                double height = scnr.nextDouble();
                System.out.println("Enter weight:");
                double weight = scnr.nextDouble();
                System.out.println("Enter id:");
                int id = scnr.nextInt();
                badInput = false;

                Human customHuman = new Human(hair, eye, height, weight, id);
                Human bob = new Human();
                Human tom = new Human();
                ArrayList<Human> people = new ArrayList<>();
                people.add(h);
                people.add(bob);
                people.add(tom);
                people.add(customHuman);

                System.out.println(people);
                Collections.sort(people);
                System.out.println(people);

                Collections.sort(people, new Human.WeightComparator());
                System.out.println(people);

                Collections.sort(people, Human.weightCompare);
                System.out.println(people);

                Collections.sort(people, new Comparator<Human>()
                {
                    @Override
                    public int compare(Human h1, Human h2)
                    {
                        return Integer.compare(h1.getNumFoodEaten(), h2.getNumFoodEaten());
                    }
                });
                System.out.println(people);

                Collections.sort(people, (h1, h2) -> Integer.compare(h1.getId(), h2.getId()));
                System.out.println(people);
            }
            // don't put a catch for Exception first, as it will make
            // the rest of your catch statements unreachable
//            catch (Exception ex)
//            {
//                System.out.println("OOPS");
//            }
            catch (InputMismatchException ime)
            {
                scnr.nextLine();
                badInput = true;
                System.out.println("You didn't input the right data type!");
            }
            catch (InvalidHumanIDException ihide)
            {
                badInput = true;
                System.out.println(ihide.getMessage());
                System.out.println("You can't use a negative value for the ID!!!");
            }
            catch (Exception ex)
            {
                System.out.println("Hmm wow that certainly is a problem!");
            }
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
