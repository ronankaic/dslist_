package com.ronankaic.dslist.services;

import com.ronankaic.dslist.dto.GameMimDTO;
import com.ronankaic.dslist.entities.Game;
import com.ronankaic.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMimDTO> findAll() {
       List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMimDTO::new).toList();
    }

}
