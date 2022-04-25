package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengersRowMapper implements RowMapper<Passengers> {
	
	@Override
    public Passengers mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passengers passengers = new Passengers();
		passengers.setId(rs.getInt("id"));
		passengers.setPclass(rs.getInt("pclass"));
		passengers.setSurvived(rs.getInt("survived"));
		passengers.setName(rs.getString("name"));
		passengers.setSex(rs.getString("sex"));
		passengers.setAge(rs.getString("age"));
		passengers.setSibsp(rs.getInt("sibsp"));
		passengers.setParch(rs.getInt("parch"));
		passengers.setTicket(rs.getString("ticket"));
		passengers.setFare(rs.getString("fare"));
		passengers.setCabin(rs.getString("cabin"));
		passengers.setEmbarked(rs.getString("embarked"));
		passengers.setBoat(rs.getString("boat"));
		passengers.setBody(rs.getString("body"));
		passengers.setHomedest(rs.getString("homedest"));

        return passengers;
    }
}
