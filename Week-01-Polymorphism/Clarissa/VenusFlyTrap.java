public class VenusFlyTrap extends Plant implements Consumer
{
    private int numFliesConsumed = 0;

    public VenusFlyTrap()
    {
        super();
        super.setProducesFruit(false);
        super.setType("Carnivorous");
    }

    @Override
    public void photosynthesis(int amtOfSunlight)
    {
        if (amtOfSunlight > 7)
        {
            super.grow(3);
        }
        else if (amtOfSunlight > 2)
        {
            super.grow(1);
        }
    }

    @Override
    public void eat()
    {
        numFliesConsumed++;
        grow(1);
    }

    @Override
    public String generateByproduct()
    {
        return "fly corpse";
    }
}
