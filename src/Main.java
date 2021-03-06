import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

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
        
        System.out.println("this is the gson.fromJson and then gson.toJson output");
        System.out.println(gson.toJson(testExercise));
        
        //write a JSON file to gainzapp folder
        try {
        File myFile = new File("myjsonstuff.txt");
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter =new OutputStreamWriter(fOut);
        myOutWriter.append(gson.toJson(testExercise));
        myOutWriter.close();
        fOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        //read a JSON file from gainzapp folder
        try {
        File myFile = new File("myjsonstuff.txt");
        FileInputStream fIn = new FileInputStream(myFile);
        BufferedReader myReader = new BufferedReader(new InputStreamReader(fIn));
        String line = "";
        String readJsonString = ""; //Holds the text
        while ((line = myReader.readLine()) != null) 
        {
            readJsonString += line ;
        }
        myReader.close();
        System.out.println("THIS IS FROM THE JSON READER!!!");
        System.out.println(readJsonString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	

	
}
