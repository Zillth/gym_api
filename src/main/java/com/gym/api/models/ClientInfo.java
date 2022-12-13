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
public class ClientInfo implements Serializable{
    private int cinfo_id;
    @NonNull private Integer user_id;
    @NonNull private Double weight;
    @NonNull private Double height;
    @NonNull private Double body_fat;
    @NonNull private String address;
    @NonNull private Integer btype_id;
    @NonNull private Integer trainer_id;

    ClientInfo(ResultSet s) throws SQLException {
        setAddress(s.getString("address"));
        setBody_fat(s.getDouble("body_fat"));
        setBtype_id(s.getInt("btype_id"));
        setCinfo_id(s.getInt("cinfo_id"));
        setHeight(s.getDouble("height"));
        setTrainer_id(s.getInt("trainer_id"));
        setUser_id(s.getInt("user_id"));
        setWeight(s.getDouble("weight"));
    }
}
