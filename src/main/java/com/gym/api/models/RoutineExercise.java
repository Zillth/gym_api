package com.gym.api.models;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class RoutineExercise implements Serializable {
    private int re_id;
    @NonNull private Integer routine_id;
    @NonNull private Integer exercise_id;
    @NonNull private Integer series;
    @NonNull private Integer reps;
    @NonNull private Integer break_exercise;
    private int extra_weight;
    
    RoutineExercise(ResultSet s) throws SQLException {
        setBreak_exercise(s.getInt("break_exercise"));
        setExercise_id(s.getInt("exercise_id"));
        setExtra_weight(s.getInt("extra_weight"));
        setRe_id(s.getInt("re_id"));
        setReps(s.getInt("reps")); 
        setRoutine_id(s.getInt("routine_id"));
        setSeries(s.getInt("series"));
    }
}
