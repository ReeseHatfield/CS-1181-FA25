import java.util.ArrayList;
import java.util.Collections;

public class Train <P, C extends Comparable<C>> implements Comparable<Train>
{
    private ArrayList<P> passengers = new ArrayList<>();
    private ArrayList<C> cargo = new ArrayList<>();

    public Train(ArrayList<P> pass, ArrayList<? extends C> cargoPieces)
    {
        passengers.addAll(pass);
        cargo.addAll(cargoPieces);
    }

    public ArrayList<C> sortCargo()
    {
        Collections.sort(cargo);
        return cargo;
    }

    @Override
    public int compareTo(Train o)
    {
        return 0;
    }
}
