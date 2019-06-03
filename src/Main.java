import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
	    
	    
        // WORKS TO CONVERT INTO STRING
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date date = new Date();
        String stringDate = sdf.format(date);

        // Conversion
        //Date d = new Date();
        //String s = d.toString();
        //Date theSameDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(s);
        //System.out.println(s);

        Exercise testExercise = new Exercise(stringDate,"Hammer Curls", "Bitch strings", new Set[]{new Set(420, 69), new Set(69, 420)});
        
        System.out.println(testExercise.toJSONString());
        
        Gson gson = new Gson();
        
        Exercise newExercise = gson.fromJson(testExercise.toJSONString(), Exercise.class);
        
        System.out.println("this is the fromJson and then toJSONString output");
        System.out.println(newExercise.toJSONString());
	}
	

	
}
