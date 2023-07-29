package com.dslist.mygames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslist.mygames.dto.GameMinDTO;
import com.dslist.mygames.dto.GameRequestDTO;
import com.dslist.mygames.entities.Game;
import com.dslist.mygames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		 return result;
	
	}
	
	@PostMapping
	public void saveGame(@RequestBody GameRequestDTO data) {
		Game gameData = data.toGame();
		gameService.save(gameData);
	}
	

}