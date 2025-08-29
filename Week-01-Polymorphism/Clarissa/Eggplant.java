public class Eggplant extends Plant
{
    private int numOfEggplants = 0;

    public Eggplant ()
    {
        super();
        super.setType("Vegetable");
        super.setProducesFruit(true);
    }

    @Override
    public void photosynthesis(int amtOfSunlight)
    {
        if (amtOfSunlight > 5)
        {
            super.grow(6);
        }
        else if (amtOfSunlight > 2)
        {
            super.grow(2);
        }

        if (this.getHeight() > 12)
        {
            growAnEggplant();
        }
    }

    public void growAnEggplant()
    {
        numOfEggplants++;
    }

    @Override
    public String toString()
    {
        return super.toString() + " \nEggplant has produced " + numOfEggplants + " eggplants.";
    }
}
