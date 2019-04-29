public class Main {
	
	public static void main(String[] args) {

	    dateAndWorkout testDateAndWorkout = new dateAndWorkout("4/24/2019", "Back/Bis");
        exercise testExercise = new exercise("Hammer Curls", 4);

        System.out.print(testDateAndWorkout.getDateOfWorkout() + "\n");
        System.out.print(testDateAndWorkout.getWorkoutType() + "\n");

        System.out.print(testExercise.getExerciseName() + "\n");
        System.out.print(testExercise.getAmountOfSets() + "\n");


	}
}
