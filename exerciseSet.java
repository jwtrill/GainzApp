public class exerciseSet
{
	private int amountOfReps;
	private double weight;

	public int getAmountOfReps(){
		return amountOfReps;
	}

	public void setAmountOfReps(int newAmountOfReps){
		this.amountOfReps = newAmountOfReps;
	}

	public double getWeight(){
		return weight;
	}

	public void setWeight(double newWeight){
		this.weight = newWeight;
	}

	public exerciseSet(){

	}

	public exerciseSet(int repsAmount, double liftedWeight){
	amountOfReps = repsAmount;
	weight = liftedWeight;
	}

}