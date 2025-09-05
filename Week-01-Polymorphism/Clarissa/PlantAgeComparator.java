import java.util.Comparator;

public class PlantAgeComparator implements Comparator<Plant>
{

    @Override
    public int compare(Plant p1, Plant p2)
    {
        if (p1.getDaysOld() < p2.getDaysOld())
        {
            return -1;
        }
        else if (p1.getDaysOld() > p2.getDaysOld())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
