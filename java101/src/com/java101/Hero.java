package com.java101;

public class Hero {
	private String name;
	private long power;
	private long skill;
	private long vitality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPower() {
		return power;
	}

	public void setPower(long power) {
		this.power = power;
	}

	public long getSkill() {
		return skill;
	}

	public void setSkill(long skill) {
		this.skill = skill;
	}

	public long getVitality() {
		return vitality;
	}

	public void setVitality(long vitality) {
		this.vitality = vitality;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", power=" + power + ", skill=" + skill + ", vitality=" + vitality + "]";
	}
}
