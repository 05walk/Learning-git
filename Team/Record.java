public class Record implements Rankable
{
   private int wins;
   private int losses;
   
   public Record()
   {
      this.wins=0;
      this.losses=0;
   }
   
   public Record(int wins, int losses)
   {
      this.wins=wins;
      this.losses=losses;
   }
   
   public Record getRecord()
   {
      return this;
   }
   
   public int getWins()
   {
      return wins;
   }
   
   public int getLosses()
   {
      return losses;
   }
   
   public void setWins(int wins)
   {
      this.wins=wins;
   }
   
   public void setLosses(int losses)
   {
      this.losses=losses;
   }
   
   public void won()
   {
      wins++;
   }
   
   public void lost()
   {
      losses++;
   }
   
   public double getPercent()
   {
      double per=(wins/(double)(wins+losses)*100);
      return per;
   }
   
   public String toString()
   {
      return wins+ " wins, " + losses + " losses";
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof Record)
      {
         Record o= (Record) other;
         return (this.wins==o.wins&&this.losses==o.losses);
      }
      return false;
   }
   
   public int isBetterThan(Rankable other)
   {
      Record r=other.getRecord();
      //return this.isBetterThan(r);
      // // if(other instanceof Record)
// //       {
// //          Record r=(Record)other;
// //          
         if(Math.abs(this.getPercent()-r.getPercent())<0.01)
         {
            return 0;
         }
      
         else if(this.getPercent()>r.getPercent())
         {
            return 1;
         }
         else
         {
            return -1;
         }
// //        }
// //        return -2;//if the other object is not a record, return -2 and hopefully find that later
   }
}