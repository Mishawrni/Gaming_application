package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class games {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int gameid;
	private String gameName;
	private int year;
	private Genere gameType;
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Genere getGameType() {
		return gameType;
	}
	public void setGameType(Genere gameType) {
		this.gameType = gameType;
	}
	
	//@OneToOne(cascade=CascadeType.ALL)
	//private Genere genere;
	
	
}
