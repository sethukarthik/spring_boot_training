package com.spring_demo.constructor;

public class Game {
	
	private String name;
	private Player player;
	
	public Game() {
		System.out.println("Game::DefaultConstructor");
	}

	public Game(String name, Player player) {
		this.name = name;
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public static Game newGame(String name, Player player) {
		System.err.println("Player::newGame");
		return new Game(name, player);
	}
	
	public Game newGameIns(String name, Player player) {
		System.err.println("Player::newGame");
		return new Game(name, player);
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", player=" + player + "]";
	}

}
