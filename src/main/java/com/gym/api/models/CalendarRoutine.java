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
public class CalendarRoutine implements Serializable {
    private int croutine_id;
    @NonNull private Integer routine_id;
    @NonNull private String days;
    @NonNull private Integer asigned_to;

    CalendarRoutine(ResultSet s) throws SQLException {
        setAsigned_to(s.getInt("asigned_to"));
        setCroutine_id(s.getInt("croutine_id"));
        setDays(s.getString("days"));
        setRoutine_id(s.getInt("routine_id"));
    }
}
