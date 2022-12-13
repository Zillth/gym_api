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
public class TrainerInfo implements Serializable {
    private int tinfo_id;
    @NonNull private Integer user_id;
    @NonNull private String score;
    @NonNull private Integer clients_number;
    @NonNull private String description;
    @NonNull private String address;

    TrainerInfo(ResultSet s) throws SQLException {
        setAddress(s.getString("address"));
        setClients_number(s.getInt("clients_number"));
        setDescription(s.getString("description"));
        setScore(s.getString("score"));
        setTinfo_id(s.getInt("tinfo_id"));
        setUser_id(s.getInt("user_id"));
    }
}
