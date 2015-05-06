public class IndividualPlayer extends Player implements Rankable
{
   private Record playerRecord;
   
   public IndividualPlayer(String name, boolean status, Record playerRecord)
   {
      super(name, status);
      this.playerRecord=playerRecord;
   }
   
   public IndividualPlayer(String name, Record playerRecord)
   {
      this(name, false, playerRecord);
   }
   
   public String toString()
   {
      return super.toString() + ", Record: " + playerRecord.toString();
   }
   
   public int getWins()
   {
      return playerRecord.getWins();
   }
   
   public int getLosses()
   {
      return playerRecord.getLosses();
   }
   
   public double getPercent()
   {
      return playerRecord.getPercent();
   }
   
   public Record getRecord()
   {
      return playerRecord;
   }
   
   public void setRecord(Record r)
   {
      playerRecord=r;
   }
   
   public void setWins(int w)
   {
      playerRecord.setWins(w);
   }
   
   public void setLosses(int l)
   {
      playerRecord.setLosses(l);
   }
   
   public void won()
   {
      playerRecord.won();
   }
   
   public void lost()
   {
      playerRecord.lost();
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof IndividualPlayer)
      {
         IndividualPlayer i=(IndividualPlayer) other;
         return(super.equals(i)&&this.playerRecord.equals(i.playerRecord));
      }
      return false;
   }
   
   public int isBetterThan(Rankable other)
   {
      Record r=other.getRecord();
      return playerRecord.isBetterThan(r);
   }

}