package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.player;
import com.example.demo.repository.playerRepository;

@RestController
public class playerControl {
	
	@Autowired
	public playerRepository repo;
	
	//add player
	@PostMapping("/save")
	public player addPlayer(@RequestBody player pr) 
	{
		return repo.save(pr);
	}
	
	//add multiple students
	@PostMapping("/saveAll")
	public List<player> addMultiplePlayer(@RequestBody List<player> pr)
	{
		return repo.saveAll(pr);
	}
	
	//find all
	@GetMapping("/findall")
	public List<player> findplayers()
	{
		return repo.findAll();
	}
	
	//find by id
	@GetMapping("/findbyid")
	public player findusingid(@PathVariable int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//update
	@PutMapping("update/{id}")
	public player updatePlayer(@RequestBody int id)
	{
		player oldPlayer=repo.findById(id).orElse(null);
		oldPlayer.setName(oldPlayer.getName());
		oldPlayer.setAddress(oldPlayer.getAddress());
		oldPlayer.setAge(oldPlayer.getAge());
		
		return repo.save(oldPlayer);
	}
	
	public String deletePlayer(@PathVariable int id) 
	{
		repo.deleteById(id);
		return "success";
	}
	
	
}
