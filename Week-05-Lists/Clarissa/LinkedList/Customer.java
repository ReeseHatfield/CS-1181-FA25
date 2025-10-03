public class Customer implements Comparable<Customer>
{
    private String name = "";
    private boolean callAhead = false;

    public Customer(boolean callAhead, String name)
    {
        this.callAhead = callAhead;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isCallAhead()
    {
        return callAhead;
    }

    public void setCallAhead(boolean callAhead)
    {
        this.callAhead = callAhead;
    }

    @Override
    public int compareTo(Customer o)
    {
        if ((this.isCallAhead() && o.isCallAhead()) || (!this.isCallAhead() && !o.isCallAhead()))
        {
            return this.getName().compareTo(o.getName());
        }
        else if (this.isCallAhead())
        {
            return -1;
        }
        else
        {
            return 1;
        }

    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "name='" + name + '\'' +
                ", callAhead=" + callAhead +
                '}';
    }
}
