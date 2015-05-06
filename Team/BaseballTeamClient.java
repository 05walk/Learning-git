//Sarah Walker
//Worksheet 32
//BaseballTeamClient.java
//2 March 2015

import java.io.*;
import java.util.*;

public class BaseballTeamClient
{
   public static void main(String[] args)
   {
      BaseballTeam Mariners=new BaseballTeam(11, 40);//11 is the smallest roster size, up to a 40 man roster
      Scanner fileScan=openFile("MarinersRoster.txt");
      if(fileScan!=null)
      {
         fillRoster(fileScan, Mariners);
      }
      System.out.println(Mariners);
      Mariners.updatePosition("Robinson Cano", "DH"); //why doesn't this work??
      System.out.println(Mariners);
      BaseballTeam Athletics=new BaseballTeam(11, 40);//11 is the smallest roster size, up to a 40 man roster
      Scanner fileScan2=openFile("AthleticsRoster.txt");
      if(fileScan2!=null)
      {
         fillRoster(fileScan2, Athletics);
      }
      Mariners.win();
      Athletics.lose();
      System.out.println("Mariners beat Athletics!");
      System.out.println(Mariners.getRecord());
      System.out.println(Athletics.getRecord());
      
   }
   
   /** 
    *This method opens the file and creates a Scanner on that file.
    *@param filename the file that is being opened
    *@return the Scanner on the file.
    */
   public static Scanner openFile(String filename)
   {
   File f=new File(filename);
      Scanner fileScan= null;
      try
      {
         fileScan = new Scanner(f);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Error opening file " + filename);
         return null;
      }
      return fileScan;
   }
   
   public static void fillRoster(Scanner fileScan, BaseballTeam Mariners)
   {
      while(fileScan.hasNextLine())
      {
         String name=fileScan.nextLine();
         String stat=fileScan.nextLine();
         boolean status;
         if(stat.equals("true ")||stat.equals("true"))
         {
            status=true;
         }
         else
         {
            status=false;
         }
         String position=fileScan.nextLine();
         Player p= new TeamPlayer(name, status, position);
         Mariners.addPlayer(p);
         fileScan.nextLine();
      }
   }
}