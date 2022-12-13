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
public class WorkType implements Serializable {
    private int wtype_id;
    @NonNull
    String type;

    WorkType(ResultSet s) throws SQLException {
        setType(s.getString("type"));
        setWtype_id(s.getInt("wtype_id"));
    }
}
