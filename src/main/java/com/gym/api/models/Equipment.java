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
public class Equipment implements Serializable{
    private int equipment_id;
    @NonNull private String equipment;

    Equipment(ResultSet s) throws SQLException {
        setEquipment(s.getString("equipment"));
        setEquipment_id(s.getInt("equipment_id"));
    }
}
