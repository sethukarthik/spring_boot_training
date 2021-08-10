package com.spring_demo.constructor;

public class Player {
	private int age;
	private String name;
	private int plyNum;
	
	public Player() {
		System.out.println("Game::DefaultConstructor");
	}
	
	public Player(int age, String name, int plyNum) {
		this.age = age;
		this.name = name;
		this.plyNum = plyNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlyNum() {
		return plyNum;
	}

	public void setPlyNum(int plyNum) {
		this.plyNum = plyNum;
	}
	
	public static Player newPlayer(int age, String name, int plyNum) {
		System.err.println("Player::NewPlayer");
		return new Player(age, name, plyNum);
	}

	@Override
	public String toString() {
		return "Player [age=" + age + ", name=" + name + ", plyNum=" + plyNum + "]";
	}
	
}
