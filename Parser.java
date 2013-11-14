/*
 * Main function to get the input
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class Parser
{
	public static void main(String[] args) throws Exception {
        if( args.length != 2)
        {
            System.err.println("invalid argument");
            System.exit(1);
        }
		Application app = new Application();
		 
		String line;
        try(BufferedReader in = new BufferedReader(new FileReader(args[0])))
        {
		    while((line = in.readLine()) != null)
		    {
		        StringTokenizer linetok = new StringTokenizer(line, ";");
		        if(linetok.nextElement().toString().equals(args[1]))
		        {
			        int i =0;
			        while(i<3)
			        {
			            StringTokenizer servers  = new StringTokenizer(linetok.nextElement().toString() , "_");
			            int serverNo = Integer.valueOf(servers.nextElement().toString().substring(8));
			            servers.nextToken();
			            servers.nextToken();
			            int tier = Integer.valueOf(servers.nextToken().toString());

			            if(app.get(tier, serverNo) == null)
				            app.put(tier, serverNo);
			            i++;
			        }
		        }
		    }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
		System.out.println("Tier 1: " + app.size(1) + " Tier 2: " + app.size(2) + " Tier 3: " + app.size(3));
	}
}
