import java.util.*;

/*
From what I can tell an exercise consists of 

Date
Name/type
Mussel category
sets:
	sets consist of:
		Weight(sometimes is irrelevant)
		repetition
*/

public class Exercise{
	
	private Date date;
	private String exerciseName;
	private String musselCategory;
	private Set[] sets;
	
	
	//Default Constructor
	public Exercise(){

	}
	
	public Exercise(Date date, String exerciseName, String musselCategory, Set[] sets){
		this.exerciseName = exerciseName;
		this.musselCategory = musselCategory;
		this.date = date;
		this.sets = sets;
	}

	public String getExerciseName(){
		return exerciseName;
	}

	public void setExerciseName(String newExerciseName){
		this.exerciseName = newExerciseName;
	}
	
	public String getMusselCategory(){
		return musselCategory;
	}
	
	public void setMusselCategory(String musselCategory){
		this.musselCategory = musselCategory;
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
		//This is all bad practice, should use a string builder, but fuck it, it will get optimized out.
		String ret = "";
		ret = ret + "Date: " + this.getDate() + "\n";
		ret = ret + "Name: " + this.getExerciseName() + "\n";
		ret = ret + "Muscle Group: " + this.getMusselCategory() + "\n";
		ret = ret + "Sets:" + "\n";
		Set[] tempSets = this.getSets();
		for(int i = 0; i < tempSets.length; i++){
			ret = ret + tempSets[i].toString();
		}
	
		return ret;
	}

}