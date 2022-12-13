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
public class MovementStructure implements Serializable {
    private int mstructure_id;
    @NonNull private String structure;

    MovementStructure(ResultSet s) throws SQLException {
        setMstructure_id(s.getInt("mstructure_id"));
        setStructure(s.getString("structure"));
    }
}
