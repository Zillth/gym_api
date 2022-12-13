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
public class Exercise implements Serializable{
    private int exercise_id;
    @NonNull private Integer wtype_id;
    @NonNull private Integer mcontracion_id;
    @NonNull private Integer modality_id;
    @NonNull private Integer mstructure_id;
    @NonNull private String name;
    @NonNull private String description;
    private String video_url;

    Exercise(ResultSet s) throws SQLException {
        setDescription(s.getString("description"));
        setExercise_id(s.getInt("exercise_id"));
        setMcontracion_id(s.getInt("mcontracion_id"));
        setModality_id(s.getInt("modality_id"));
        setMstructure_id(s.getInt("mstructure_id"));
        setName(s.getString("name"));
        setVideo_url(s.getString("video_url"));
        setWtype_id(s.getInt("wtype_id"));
    }
}
