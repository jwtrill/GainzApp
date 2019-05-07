import java.util.*;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
	    

        Exercise testExercise = new Exercise(new Date(),"Hammer Curls", "Bitch strings", new Set[]{new Set(420, 69), new Set(69, 420)});
        
        //Gson gson = new Gson();
        //String json = gson.toJson(testExercise);  

        //System.out.println(testExercise.toString());
        //System.out.println();
        
        String testExerciseJSON = exerciseToJSON(testExercise);
        System.out.println(testExerciseJSON);
	}
	
	public static String exerciseToJSON(Exercise exercise) {
	    //private Date date;
	    //private String exerciseName;
	    //private String muscleCategory;
	    //private Set[] sets;
	    StringBuilder JSONstring = new StringBuilder();
	    Set[] tempSets = exercise.getSets();
	    
	    JSONstring.append("{\n" + "\"date\"" + " : \"" + exercise.getDate() + "\",\n"
	    + "\"exerciseName\"" + " : \"" + exercise.getExerciseName() + "\",\n"
	    + "\"muscleCategory\"" + " : \"" + exercise.getMuscleCategory() + "\",\n");
	    for (int i = 0; i < tempSets.length; i++) {
	        int setCount = i + 1;
	        JSONstring.append("\"Sets\"" + " : \"" + setCount + "\",\n"
	        + "\"Reps\"" + " : \"" + tempSets[i].getAmountOfReps() + "\",\n"
	        + "\"Weight\"" + " : \"" + tempSets[i].getWeight() + "\"\n");
	    }
	    JSONstring.append("}");
	    return JSONstring.toString();
	}
	
}
