//Sarah Walker
//Worksheet 30

public class RecordWithTiesAndElo extends RecordWithTies
{
   private double elo;
   
   public RecordWithTiesAndElo()
   {
   }
   
   public RecordWithTiesAndElo(int wins, int losses, int ties, double elo)
   {
      super(wins, losses, ties);
      this.elo=elo;
   }
   
   public double getEloRating()
   {
      return elo;
   }
   
   public String toString()
   {
      return super.toString()+", " + elo+ " Elo rating";
   }
   
   public boolean equals(Object other)
   {
      if (other instanceof RecordWithTiesAndElo)
      {
         RecordWithTiesAndElo r= (RecordWithTiesAndElo) other;
         return (super.equals(r)&& this.elo==r.elo);
      }
      return false;
   }
   
   public int isBetterThan(Object other)
   {
      if(other instanceof RecordWithTiesAndElo)
      {
         RecordWithTiesAndElo r=(RecordWithTiesAndElo)other;
         if(Math.abs(this.elo-r.elo)<0.01)
         {
            return 0;
         }
      
         else if(this.elo>r.elo)
         {
            return 1;
         }
         else
         {
            return -1;
         }
       }
       return -2;//if the other object is not a record, return -2 and hopefully find that later
   }
   
   public void setEloRating(double elo)
   {
     this.elo=elo;
   }
   
   public void updateElo(RecordWithTiesAndElo other, double outcome)
   {
     double change =EloChangeCalculator.getRatingChange(this.elo, other.elo, outcome);
     this.elo+=change;
     other.elo-=change;
   }
   
   public static void updateElo(RecordWithTiesAndElo other, RecordWithTiesAndElo other2, double outcome)
   {
     double change =EloChangeCalculator.getRatingChange(other.elo, other2.elo, outcome);
     other.elo+=change;
     other2.elo-=change;
   }
   
}