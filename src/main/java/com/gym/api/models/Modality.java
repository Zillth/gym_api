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
public class Modality implements Serializable{
    private int modality_id;
    @NonNull String modality;

    Modality(ResultSet s) throws SQLException {
        setModality(s.getString("modality"));
        setModality_id(s.getInt("modality_id"));
    }
}
