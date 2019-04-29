import java.util.*;

/*
From what I can tell an exercise consists of 

Date
Name/type
muscle category
sets:
	sets consist of:
		Weight(sometimes is irrelevant)
		repetition
*/

public class Exercise{
	
	private Date date;
	private String exerciseName;
	private String muscleCategory;
	private Set[] sets;
	
	
	//Default Constructor
	public Exercise(){

	}
	
	public Exercise(Date date, String exerciseName, String muscleCategory, Set[] sets){
		this.exerciseName = exerciseName;
		this.muscleCategory = muscleCategory;
		this.date = date;
		this.sets = sets;
	}

	public String getExerciseName(){
		return exerciseName;
	}

	public void setExerciseName(String newExerciseName){
		this.exerciseName = newExerciseName;
	}
	
	public String getMuscleCategory(){
		return muscleCategory;
	}
	
	public void setMuscleCategory(String muscleCategory){
		this.muscleCategory = muscleCategory;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Set[] getSets(){
		return sets;
	}
	
	public String toString(){
		//I am capable of basic string manipulation... swag
		StringBuilder ret = new StringBuilder();
		ret.append("Date: " + this.getDate() + "\n");
		ret.append("Name: " + this.getExerciseName() + "\n");
		ret.append("Muscle Group: " + this.getMuscleCategory() + "\n");
		ret.append("Sets:" + "\n");
		Set[] tempSets = this.getSets();
		for(int i = 0; i < tempSets.length; i++){
			ret.append(tempSets[i].toString());
		}
	
		return ret.toString();
	}

}
