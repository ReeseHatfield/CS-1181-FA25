import java.util.*;

public class Human implements Consumer, Comparable<Human>
{
    private String hairColor = "";
    private String eyeColor = "";
    private int numFoodEaten = 0;
    private boolean isFull = false;
    private double height = 0.0;
    private double weight = 0.0;
    private int id = 0;
    private Random rng = new Random();

    public static Comparator<Human> weightCompare = new Comparator<Human>()
    {
        @Override
        public int compare(Human h1, Human h2)
        {
            return Double.compare(h1.getWeight(), h2.getWeight());
        }
    };

    static class WeightComparator implements Comparator<Human>
    {
        @Override
        public int compare(Human h1, Human h2)
        {
            return Double.compare(h1.getWeight(), h2.getWeight());
        }
    }

    public Human() throws InvalidHumanIDException
    {
        this.setHeight(rng.nextDouble(100));
        this.setWeight(rng.nextDouble(200));
        this.setNumFoodEaten(rng.nextInt(5));
        this.setId(rng.nextInt(100));
    }

    public Human(String hairColor, String eyeColor, double height, double weight, int id) throws InvalidHumanIDException
    {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        setId(id);
    }

    @Override
    public void eat()
    {
        if (!isFull)
        {
            numFoodEaten++;
            if (numFoodEaten > 3)
            {
                isFull = true;
            }
        }
        else
        {
            System.out.println("Human is full!");
        }
    }

    @Override
    public String generateByproduct()
    {
        if (isFull)
        {
            return "byproduct";
        }
        else
        {
            return "nothing";
        }
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public int getNumFoodEaten()
    {
        return numFoodEaten;
    }

    public void setNumFoodEaten(int numFoodEaten)
    {
        this.numFoodEaten = numFoodEaten;
    }

    public boolean isFull()
    {
        return isFull;
    }

    public void setFull(boolean full)
    {
        isFull = full;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) throws InvalidHumanIDException
    {
        if (id >= 0)
        {
            this.id = id;
        }
        else
        {
            throw new InvalidHumanIDException();
        }
    }

    // natural ordering
    @Override
    public int compareTo(Human o)
    {
        return Double.compare(this.getHeight(), o.getHeight());
    }

    @Override
    public String toString()
    {
        return "Human #" + id + ": is " + this.height + " inches tall and weighs " + this.weight + " pounds and has eaten " + this.numFoodEaten + " food.";
    }
}
