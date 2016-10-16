package com.java101;

public class Hero {
	private String name;
	private int power;
	private int skill;
	private int vitality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", power=" + power + ", skill=" + skill + ", vitality=" + vitality + "]";
	}
}
