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
public class MuscularGroup implements Serializable{
    private int mgroup_id;
    @NonNull private String mgroup;

    MuscularGroup(ResultSet s) throws SQLException{
        setMgroup(s.getString("mgroup"));
        setMgroup_id(s.getInt("mgroup_id"));
    }
}
