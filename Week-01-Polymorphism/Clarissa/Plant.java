public abstract class Plant
{
    private int height = 0;
    private String color = "";
    private boolean producesFruit = false;
    private String type = "";

    public Plant()
    {
        this.color = "green";
    }

    public void grow(int amtToGrow)
    {
        this.height = this.height + amtToGrow;
    }

    public abstract void photosynthesis(int amtOfSunlight);

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
}
