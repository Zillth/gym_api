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
public class BadgeLevel implements Serializable {
    private int blevel_id;
    @NonNull
    private String level;

    BadgeLevel(ResultSet s) throws SQLException {
        setBlevel_id(s.getInt("blevel_id"));
        setLevel(s.getString("level"));
    }
}
