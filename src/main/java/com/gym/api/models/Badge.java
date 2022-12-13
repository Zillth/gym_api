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
public class Badge implements Serializable {
    private int badge_id;
    @NonNull
    private Integer blevel_id;
    @NonNull
    private String title;
    @NonNull
    private String description;

    Badge(ResultSet s) throws SQLException {
        setBadge_id(s.getInt("badge_id"));
        setBlevel_id(s.getInt("blevel_id"));
        setTitle(s.getString("title"));
        setDescription(s.getString("description"));
    }
}
