public class Human implements Consumer
{
    private String hairColor = "";
    private String eyeColor = "";
    private int numFoodEaten = 0;
    private boolean isFull = false;

    public Human()
    {

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
}
