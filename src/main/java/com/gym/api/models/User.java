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
public class User implements Serializable {
    private int user_id;
    @NonNull private Integer utype_id;
    @NonNull private String email;
    @NonNull private String password;
    @NonNull private String username;
    @NonNull private String surnames;
    @NonNull private String names;
    @NonNull private String image;

    User(ResultSet s) throws SQLException {
        setEmail(s.getString("email"));
        setImage(s.getString("image"));
        setNames(s.getString("names"));
        setPassword(s.getString("password"));
        setSurnames(s.getString("surnames"));
        setUser_id(s.getInt("user_id"));
        setUsername(s.getString("username"));
        setUtype_id(s.getInt("utype_id"));
    }
}
