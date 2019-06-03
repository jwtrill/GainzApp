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
	
	private String date;
	private String exerciseName;
	private String muscleCategory;
	private Set[] sets;
	
	
	//Default Constructor
	public Exercise(){

	}
	
	public Exercise(String date, String exerciseName, String muscleCategory, Set[] sets){
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
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public Set[] getSets(){
		return sets;
	}
	
	
	
	/*
{
 	"date": "Thu May 16 17:45:03 UTC 2019",
 	"exerciseName": "Hammer Curls",
 	"muscleCategory": "Bitch strings",
 	"sets": [{
 			"reps": "420",
 			"weight": "69.0"
 		},
 		{
 			"reps": "69",
 			"weight": "420.0"
 		}
 	]
 }
*/
	public String toJSONString(){
		//return string
		StringBuilder ret = new StringBuilder();
		//get sets
		Set[]tempSets = this.getSets();
		
		ret.append("{\n" + "\"date\"" + " : \"" + this.getDate() + "\",\n"
	    + "\"exerciseName\"" + " : \"" + this.getExerciseName() + "\",\n"
	    + "\"muscleCategory\"" + " : \"" + this.getMuscleCategory() + "\",\n");
	    
	    ret.append("\"sets\"" + " : ");
	    ret.append("[");
	    
	    //Does order matter for sets??
	    for (int i = 0; i < tempSets.length; i++) {
	       ret.append(tempSets[i].toJSONString());
	       if(i != tempSets.length -1){
				ret.append(",\n");
			}
	    }
	    ret.append("]");
	    ret.append("\n}");
	    
	    return ret.toString();
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


