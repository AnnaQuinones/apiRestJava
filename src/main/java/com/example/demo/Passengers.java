package com.example.demo;

public class Passengers {
	
	private int id;
	private int pclass;
	private int survived;
	private String name;
	private String sex;
	private String age;
	private int sibsp;
	private int parch;
	private String ticket;
	private String fare;
	private String cabin;
	private String embarked;
	private String boat;
	private String body;
	private String homedest;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPclass() {
		return pclass;
	}
	public void setPclass(int pclass) {
		this.pclass = pclass;
	}
	public int getSurvived() {
		return survived;
	}
	public void setSurvived(int survived) {
		this.survived = survived;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSibsp() {
		return sibsp;
	}
	public void setSibsp(int sibsp) {
		this.sibsp = sibsp;
	}
	public int getParch() {
		return parch;
	}
	public void setParch(int parch) {
		this.parch = parch;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getEmbarked() {
		return embarked;
	}
	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}
	public String getBoat() {
		return boat;
	}
	public void setBoat(String boat) {
		this.boat = boat;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getHomedest() {
		return homedest;
	}
	public void setHomedest(String homedest) {
		this.homedest = homedest;
	}
	@Override
	public String toString() {
		return "Passengers [id=" + id + ", pclass=" + pclass + ", survived=" + survived + ", name=" + name + ", sex="
				+ sex + ", age=" + age + ", sibsp=" + sibsp + ", parch=" + parch + ", ticket=" + ticket + ", fare="
				+ fare + ", cabin=" + cabin + ", embarked=" + embarked + ", boat=" + boat + ", body=" + body
				+ ", homedest=" + homedest + "]";
	}
	
}
