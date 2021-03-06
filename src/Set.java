import java.util.*;

public class Set{
	
	private int amountOfReps;
	private double weight;
	
	public Set(){
		this.amountOfReps = 0;
		this.weight = 0;
	}
	
	public Set(int amountOfReps){
		this.amountOfReps = amountOfReps;
		this.weight = 0;
	}

	public Set(int amountOfReps, double weight){
		this.amountOfReps = amountOfReps;
		this.weight = weight;
	}

	public int getAmountOfReps(){
		return amountOfReps;
	}

	public void setAmountOfReps(int amountOfReps){
		this.amountOfReps = amountOfReps;
	}

	public double getWeight(){
		return weight;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public String toJSONString(){
		
		StringBuilder ret = new StringBuilder();
		
		ret.append("{\n");
		ret.append("\"reps\"" + " : \"" + this.getAmountOfReps() + "\",\n");
		ret.append("\"weight\"" + " : \"" + this.getWeight() + "\"\n}");
		
		return ret.toString();
	}
	
	public String toString(){
		StringBuilder ret = new StringBuilder();
		ret.append("\t Reps: " + this.getAmountOfReps() + "\n");
		ret.append("\t Weight: " + this.getWeight() + "\n\n");
		return ret.toString();
	}

}
