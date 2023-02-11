package workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (this.exercises.size() < this.exerciseCount) {
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return this.exercises.removeIf(exercise -> exercise.getName().equals(name) && exercise.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : this.exercises) {
            if (exercise.getMuscle().equals(muscle) && exercise.getName().equals(name)) {
                return exercise;
            }
        }
        return null;
    }
    public Exercise getMostBurnedCaloriesExercise(){
        if (this.exercises.size() == 0){
            return null;
        }
        return Collections.max(this.exercises, Comparator.comparing(exercise -> exercise.getBurnedCalories()));
    }
    public int getExerciseCount(){
        return this.exercises.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Workout type: " + this.type).append(System.lineSeparator());
        for (Exercise exercise: this.exercises){
            sb.append(exercise).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
