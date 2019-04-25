public class exercise
{
	private String exerciseName;
	private int amountOfSets;

	public String getExerciseName(){
		return exerciseName;
	}

	public void setExerciseName(String newExerciseName){
		this.exerciseName = newExerciseName;
	}

	public int getAmountOfSets(){
		return amountOfSets;
	}

	public void setAmountOfSets(int newAmountOfSets){
		this.amountOfSets = newAmountOfSets;
	}
	
	public exercise(){

	}

	public exercise(String nameOfExercise, int setTotal)
	{
	exerciseName = nameOfExercise;
	amountOfSets = setTotal;

	}
}