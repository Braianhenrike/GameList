package com.dslist.mygames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslist.mygames.dto.GameMinDTO;
import com.dslist.mygames.entities.Game;
import com.dslist.mygames.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO (x)).toList();
	}
	
	public Game save(Game game) {
        return gameRepository.save(game);
    }
	
	
}