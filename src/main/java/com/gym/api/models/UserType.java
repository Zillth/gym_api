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
public class UserType implements Serializable {
    private int utype_id;
    @NonNull String usertType;

    UserType(ResultSet s) throws SQLException {
        setUsertType(s.getString("usertType"));
        setUtype_id(s.getInt("utype_id"));
    }
}
