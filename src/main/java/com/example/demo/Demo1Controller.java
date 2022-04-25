package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Demo1Controller {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/getAll")
	public List<Passengers> getAll()
	{
		String sql = "SELECT * FROM passengers";
		List<Passengers> customers = jdbcTemplate.query(sql,new PassengersRowMapper());
         
        return customers;
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/getById/{id}")
	public Passengers getById(@PathVariable int id)
	{
		String sql = "SELECT * FROM passengers where id= ?";
		Passengers customers = jdbcTemplate.queryForObject(sql, new Object[] { id }, new PassengersRowMapper());
         
        return customers;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Passengers passengers)
	{
		jdbcTemplate.update(
			    "INSERT INTO passengers (id,pclass,survived,name,sex,age,sibsp,parch,ticket,fare,cabin,embarked,boat,body,homedest) "
			    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
			    passengers.getId(),passengers.getPclass(),passengers.getSurvived(),passengers.getName(),passengers.getSex(),passengers.getAge(),passengers.getSibsp(),passengers.getParch(),passengers.getTicket(),passengers.getFare(),passengers.getCabin(),passengers.getEmbarked(),passengers.getBoat(),passengers.getBody(),passengers.getHomedest()
			);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/GetNumberBySex/{sex}")
	public int GetNumberBySex(@PathVariable String sex)
	{
		String sql = "SELECT * FROM passengers where sex = ?";
		List<Passengers> customers = (List<Passengers>) jdbcTemplate.query(sql, new Object[] { sex }, new PassengersRowMapper());
         
        return customers.size();
	}
	
	@GetMapping("/GetSurvived")
	public int GetSurvived()
	{
		String sql = "select * from passengers where survived =  1";
		List<Passengers> customers = (List<Passengers>) jdbcTemplate.query(sql, new PassengersRowMapper());
         
        return customers.size();
	}
	
	@GetMapping("/GetAverageAge")
	public double GetAverageAge()
	{
		String sql = "select SUM(CAST(age as float)) _totalBal from passengers";
		double customers = jdbcTemplate.queryForObject(sql, Double.class);
		
		String sql2 = "SELECT * FROM passengers";
		List<Passengers> customers2 = jdbcTemplate.query(sql2,new PassengersRowMapper());
         
		double average = customers/customers2.size();
        return average;
	}
}
