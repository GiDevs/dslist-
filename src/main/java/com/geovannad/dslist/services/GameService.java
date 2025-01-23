package com.geovannad.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geovannad.dslist.dto.GameDTO;
import com.geovannad.dslist.dto.GameMinDTO;
import com.geovannad.dslist.entities.Game;
import com.geovannad.dslist.repositories.GameRepository;

@Service
public class GameService {
	
		@Autowired
		private GameRepository gameRepository;
		
		@Transactional(readOnly = true)
		public GameDTO findById(Long id) {
			Game result = gameRepository.findById(id).get();
			return new GameDTO(result);
			
		}

		@Transactional(readOnly = true)
		public List<GameMinDTO> findAll() {
				List<Game> result = gameRepository.findAll();
				return result.stream(). map(x -> new GameMinDTO(x)).toList();		
			
		}
}
