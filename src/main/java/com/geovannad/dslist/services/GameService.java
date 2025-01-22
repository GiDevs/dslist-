package com.geovannad.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geovannad.dslist.dto.GameMinDTO;
import com.geovannad.dslist.entities.Game;
import com.geovannad.dslist.repositories.GameRepository;

@Service
public class GameService {
	
		@Autowired
		private GameRepository gameRepository;

		public List<GameMinDTO> findAll() {
				List<Game> result = gameRepository.findAll();
				return result.stream(). map(x -> new GameMinDTO(x)).toList();		
			
		}
}
