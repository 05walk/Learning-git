//Sarah Walker
//Team Project

public class Player implements Comparable<Player>
{
   private String playerName;
   private boolean playerStatus;
   
   public Player(String playerName, boolean playerStatus)
   {
      this.playerName=playerName;
      this.playerStatus=playerStatus;
   }
   
   public Player(String playerName)
   {
      this.playerName=playerName;
      playerStatus=false;
   }
   
   public Player()
   {
      playerName="";
      playerStatus=false;
   }
   
   public String getName()
   {
      return playerName;
   }
   
   public void setName(String playerName)
   {
      this.playerName=playerName;
   }
   
   public boolean getStatus()
   {
      return playerStatus;
   }
   
   public void setStatus(boolean playerStatus)
   {
      this.playerStatus=playerStatus;
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof Player)
      {
         Player two=(Player)other;
         if (this.playerName.equals(two.playerName) && this.playerStatus==two.playerStatus)
         {
            return true;
         }
      }
      return false;
      
   }
   
   public String toString()
   {
      return "Name: " + playerName + ", Avaliability: " + playerStatus;
   }
   
   public int compareTo(Player other)
   {
      if(other.getName().equals(this.playerName))
      {
         return 1;
      }
      return -1;
   }
}