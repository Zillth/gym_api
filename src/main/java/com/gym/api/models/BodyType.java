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
public class BodyType implements Serializable {
    private int btype_id;
    @NonNull
    private String type;

    BodyType(ResultSet s) throws SQLException {
        setBtype_id(s.getInt("btype_id"));
        setType(s.getString("type"));
    }
}
