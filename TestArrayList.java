//Sarah Walker
//Worksheet 34

import java.util.*;

public class TestArrayList
{  
   public static void main(String[] args)
   {
      ArrayList<String> foo= new ArrayList<String>();
      foo.add("Hello");
      foo.add("world");
      foo.add("Jack");
      foo.add("!!!!");
      System.out.println(foo);
      foo.remove(3);
      System.out.println(foo);
      foo.remove("Jack");
      System.out.println(foo);
      //System.out.println("The array now has " + foo.size() + " elements");
      
      System.out.println("The item at index 2 is " +foo.get(1));
      
      foo.set(4, "Does this really work?");
      System.out.println(foo); //nope cuz you can't set anything more than 1 past the end 
      //this is a test for git
      
   }
}