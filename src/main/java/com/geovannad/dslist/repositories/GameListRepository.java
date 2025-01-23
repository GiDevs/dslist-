package com.geovannad.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovannad.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
