public class dateAndWorkout
{
	private String dateOfWorkout;
	private String workoutType;

	public String getDateOfWorkout(){
		return dateOfWorkout;
	}

	public void setDateOfWorkout(String newDateOfWorkout){
		this.dateOfWorkout = newDateOfWorkout;
	}

	public String getWorkoutType(){
		return workoutType;
	}

	public void setWorkoutType(String newWorkoutType){
		this.workoutType = newWorkoutType;
	}
	
	public dateAndWorkout(){

	}

	public dateAndWorkout(String date, String musclesTargetedForWorkout){
	dateOfWorkout = date;
	workoutType = musclesTargetedForWorkout;

	}

}