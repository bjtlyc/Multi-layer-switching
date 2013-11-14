/*
 *
 * Application class used to maintain three hashmap for each tier. 
 */
import java.util.*;
public class Application
{
    private HashMap<Integer,Boolean> tier1;
    private HashMap<Integer,Boolean> tier2;
    private HashMap<Integer,Boolean> tier3;
    
    public Application()
    {
        tier1 = new HashMap<>();
        tier2 = new HashMap<>();
        tier3 = new HashMap<>();
    }
    Boolean get(int tier, int serverNo)
    {
        if(tier == 1)
            return tier1.get(serverNo);
        else if(tier == 2)
            return tier2.get(serverNo);
        else if(tier == 3)
            return tier3.get(serverNo);
        else
            return false;
    }
    void put(int tier, int serverNo)
    {
        if(tier == 1)
            tier1.put(serverNo, true);
        else if(tier == 2)
            tier2.put(serverNo, true);
        else if(tier == 3)
            tier3.put(serverNo, true);
    }
    int size(int tier)
    {
        if(tier == 1)
            return tier1.size();
        else if(tier == 2)
            return tier2.size();
        else if(tier == 3)
            return tier3.size();
        else
            return -1;
    }
}
