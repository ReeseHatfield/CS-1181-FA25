import java.util.Random;

public abstract class Plant implements Comparable<Plant>
{
    private int height = 0;
    private int daysOld = 0;
    private String color = "";
    private boolean producesFruit = false;
    private String type = "";
    private Random rng = new Random();

    public Plant()
    {
        this.color = "green";
        this.daysOld = rng.nextInt(30);
    }

    public void grow(int amtToGrow)
    {
        this.height = this.height + amtToGrow;
    }

    public abstract void photosynthesis(int amtOfSunlight);

    @Override
    public String toString()
    {
        return "Plant " + "(" + type + ")" + ": current height is " + height + " and is " + daysOld + " days old.";
    }

    @Override
    public int compareTo(Plant p)
    {
        if (this.height < p.getHeight())
        {
            return -1;
        }
        else if (this.height > p.getHeight())
        {
            return 1;
        }
        else
        {
            if (this.producesFruit && !p.isProducesFruit())
            {
                return -1;
            }
            else if (!this.producesFruit && p.isProducesFruit())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isProducesFruit()
    {
        return producesFruit;
    }

    public void setProducesFruit(boolean producesFruit)
    {
        this.producesFruit = producesFruit;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getDaysOld()
    {
        return daysOld;
    }

    public void setDaysOld(int daysOld)
    {
        this.daysOld = daysOld;
    }
}
