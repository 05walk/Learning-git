public class RecordWithTies extends Record
{
   private int ties;
   
   public RecordWithTies()
   {
      super(0,0);
      this.ties=0;
   }
   
   public RecordWithTies(int ties)
   {
      super(0,0);
      this.ties=ties;
   }
   
   public RecordWithTies(int wins, int losses, int ties)
   {  
      super(wins, losses);
      this.ties=ties;
   }
   
   public void setTies(int ties)
   {
      this.ties=ties;
   }
   
   public int getTies()
   {
      return ties;
   }
   
   public void tied()
   {
      ties++;
   }
   
   public String toString()
   {
      return super.toString()+ ", " +ties + " ties";
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof RecordWithTies)
      {
         RecordWithTies r= (RecordWithTies) other;
         return (super.equals(r)&& this.ties==r.ties);
      }
      return false;
   }
   
   public double getPercent()
   {
      double per=(super.getWins()/(double)(super.getWins()+super.getLosses()+ties)*100);
      return per;
   }
   
}