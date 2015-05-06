//Sarah Walker
//Worksheet 32

import java.util.*;

public abstract class Team implements Rankable
{
   protected List<Player> roster;
   protected int MAX_ROSTER_SIZE;
   protected int MIN_PLAYING_NUM;
   //protected int current; 
   protected Record teamRecord;
   
   public Team(int MAX_ROSTER_SIZE, int MIN_PLAYING_NUM) throws IllegalArgumentException
   {
      if (MAX_ROSTER_SIZE<0||MIN_PLAYING_NUM<0)
      {
         throw new IllegalArgumentException();
      }
      this.MAX_ROSTER_SIZE=MAX_ROSTER_SIZE;
      this.MIN_PLAYING_NUM=MIN_PLAYING_NUM;
      roster= new LinkedList<Player>();//(MAX_ROSTER_SIZE);
   }
   
   public String toString()
   {
      return roster.toString();
   //    String s="";
//       for(int i=0; i<roster.size(); i++)
//       {
//          s+=roster[i].toString()+ "\n";
//       }
//       return s;
   }
   
   public void addPlayer(Player p) 
   {
      if(roster.size()==MAX_ROSTER_SIZE)
      {
         throw new IllegalArgumentException();
      }
      roster.add(p);
     //  roster[current]=p;
//       current++;
   }
   
   public boolean removePlayer(String name)
   {
      if(roster.size()==0)
      {
         throw new IllegalArgumentException();
      }
      roster.remove(name);
  //     for(int i=0; i<current; i++)
//       {
//          if(roster[i].equals(name))
//          {
//             roster[i]=null;
//             return true;
//          }
//       }
      return false;
   }
   
   public Player findPlayer(String name)
   {
      for(int i=0; i<roster.size(); i++)
      {
         if(roster.get(i).getName().equals(name))
         {
            return roster.get(i);
         }
      }
      return null;
   }
   
   public int getRosterSize()
   {
      return roster.size();
   }
   
   public void updatePlayerStatus(String name, boolean newStatus)
   {
      if(findPlayer(name)!=null)
      {
         findPlayer(name).setStatus(newStatus);
      }
      else
      {
         throw new IllegalArgumentException();
      }
   }
   
   public boolean canFieldATeam() 
   {
      return roster.size()>=MIN_PLAYING_NUM; //this is boolean zen
   }
   
   public abstract boolean shouldFieldATeam();
   
   public List<Player> getRoster()
   {
      return roster;
   }
   
   public Record getRecord()
   {
      return teamRecord;
   }
   
   public void setRecord(Record r)
   {
      teamRecord=r;
   }
   
   public int isBetterThan(Rankable other)
   {
     Record r=other.getRecord();
     return teamRecord.isBetterThan(r);
      // // if(other instanceof Team)
// //       {
// //          Team o=(Team)other;
// //          return teamRecord.isBetterThan(o.teamRecord);
// //       }
// //       return -2;
   }
   
   public void sort()
   {
      Collections.sort(roster);
   }

}