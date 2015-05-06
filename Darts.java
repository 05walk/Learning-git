//Sarah Walker
//Worksheet 36

import java.util.*;
import java.awt.*;

public class Darts
{
   public static void main(String [] args)
   {
      Set<Point> tosses = new HashSet<Point>(); //create set
      tosses.add(new Point (10,10)); //add some elements
      tosses.add(new Point (-58, 100)); 
      tosses.add(new Point (15, -30));
      tosses.add(new Point (100, -45));
      tosses.add(new Point (2, -4));
      System.out.println(tosses); //Print the set
      
      tosses.remove(new Point (10,10));
      System.out.println(tosses);
      System.out.println(tosses.contains(new Point(-58, 100)) );
      System.out.println( tosses.size() );
      
      System.out.println("Iterating through the Set:");
      Iterator<Point> tossesIter= tosses.iterator();
      while( tossesIter.hasNext() )
      {
         Point toss=tossesIter.next();
         System.out.println(toss);
      }
   }
}