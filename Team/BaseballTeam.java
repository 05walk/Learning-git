//Sarah Walker
//Worksheet 32

public class BaseballTeam extends Team
{
   //private Record r;
   
   public BaseballTeam(int min, int max)
   {
      super(min, max);
   }
   
   public void addPlayer(Player p) 
   {
      if(p instanceof TeamPlayer)
      {  
         super.addPlayer(p);
      }
      else
      {
         throw new IllegalArgumentException();
      }
   }
   
   public void updatePosition(String name, String newPosition)
   {
         TeamPlayer p = (TeamPlayer)findPlayer(name);  
         if(p!=null)///look for null not boolean 
         {
            p.setPosition(newPosition);
         }
   }
   
   public boolean shouldFieldATeam()
   {
      boolean catcher=false;
      boolean pitcher=false;
      for(int i=0;i<roster.size(); i++)
      {
         if(((TeamPlayer)roster.get(i)).getPosition().equals("Pitcher"))
         {
            pitcher=true;
         }
         if(((TeamPlayer)roster.get(i)).getPosition().equals("Catcher"))
         {
            catcher=true;
         }
      }
      if(roster.size()>=11&&catcher==true&&pitcher==true)
      {
         return true;
      }
      return false;
   }
   
   public void win()
   {
      super.teamRecord.won();
   }
   
   public void lose()
   {
      super.teamRecord.lost();
   }
}