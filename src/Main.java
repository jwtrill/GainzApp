import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
	    

        Exercise testExercise = new Exercise(new Date(),"Hammer Curls", "Bitch strings", new Set[]{new Set(420, 69), new Set(69, 420)});
        
        System.out.println(testExercise.toJSONString());
	}
	

	
}
