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
public class Routine implements Serializable{
    private int routine_id;
    @NonNull private String title;
    @NonNull private Integer duration;
    @NonNull private Integer break_exercise;
    @NonNull private Integer created_by;

    Routine(ResultSet s) throws SQLException {
        setBreak_exercise(s.getInt("break_exercise"));
        setCreated_by(s.getInt("created_by"));
        setDuration(s.getInt("duration"));
        setRoutine_id(s.getInt("routine_id"));
        setTitle(s.getString("title"));
    }
}
