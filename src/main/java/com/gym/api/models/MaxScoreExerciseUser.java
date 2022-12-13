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
public class MaxScoreExerciseUser implements Serializable {
    private int msec_id;
    @NonNull Integer exercise_id;
    @NonNull Integer user_id;
    @NonNull Integer max_score;
    private int extra_weight;

    MaxScoreExerciseUser(ResultSet s) throws SQLException {
        setExercise_id(s.getInt("exercise_id"));
        setExtra_weight(s.getInt("extra_weight"));
        setMax_score(s.getInt("max_score"));
        setMsec_id(s.getInt("msec_id"));
        setUser_id(s.getInt("user_id"));
    }
}
