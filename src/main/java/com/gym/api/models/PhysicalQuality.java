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
public class PhysicalQuality implements Serializable{
    private int pquality_id;
    @NonNull String quality;

    PhysicalQuality(ResultSet s) throws SQLException {
        setPquality_id(s.getInt("pquality_id"));
        setQuality(s.getString("quality"));
    }
}
