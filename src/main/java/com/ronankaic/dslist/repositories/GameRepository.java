package com.ronankaic.dslist.repositories;

import com.ronankaic.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
