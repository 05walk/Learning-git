public class TeamPlayer extends Player
{
   private String position;
   
   public TeamPlayer()
   {
   }
   
   public TeamPlayer(String name, boolean status, String position)
   {
      super(name, status);
      setPosition(position);
   }
   
   public TeamPlayer(String name, String position)
   {
      this(name, false, position);
   }
   
   public void setPosition(String position)
   {
      this.position=position;
   }
   
   public String getPosition()
   {
      return position;
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof TeamPlayer)
      {
         TeamPlayer two=(TeamPlayer) other;
         if (super.equals(two)&& this.position.equals(two.position))//how to account for player equality test as well?
         {
            return true;
         }
      }
      return false;
   }
   
   public String toString()
   {
      String s=super.toString() + " Position: " + position;
      return s;
   }
}