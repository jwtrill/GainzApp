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
	
	public Exercise(Date date, String exerciseName, String musselCategory, Set[] set){
		this.exerciseName = nameOfExercise;
		this.musselCategory = musselCategory;
		this.date = date;
		this.set = set;
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

}