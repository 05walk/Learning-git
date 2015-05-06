//tollbooth
public class tollbooth{

	//Create private data here
   int numberOfCars, operatorCash;

	/** construct a tollbooth object.
	 *  at this point there have been 0 cars and 0 dollars
	 *  have been collected.
	 **/
	public tollbooth() {
   numberOfCars=0;
   operatorCash=0;

	}

	/** Accesses the number of cars that have
	 *  passed through our tollbooth
	 *  @return the number of cars that have come
	 *  through the tollbooth
	 **/
	public int numCars(){
   return numberOfCars;

	}

	/**Accesses the ammount of money collected by the tollbooth
	 * @return the ammount of money collected
	 **/
	public double moneyCollected(){
   return operatorCash;
	}

	/** A car passes through the tollbooth and state variables are
	 *  updated accordingly.
	 **/
	public void addCar(){
   numberOfCars++;
   operatorCash +=3;
	}
}

