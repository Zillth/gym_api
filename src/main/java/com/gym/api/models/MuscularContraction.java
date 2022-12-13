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
public class MuscularContraction implements Serializable{
    private int mcontraction_id;
    @NonNull private String contraction;

    MuscularContraction(ResultSet s) throws SQLException {
        setContraction(s.getString("contraction"));
        setMcontraction_id(s.getInt("mcontraction_id"));
    }
}
