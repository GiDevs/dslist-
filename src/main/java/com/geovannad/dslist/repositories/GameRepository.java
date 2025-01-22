package com.geovannad.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovannad.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
