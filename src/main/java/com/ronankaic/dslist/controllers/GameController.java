package com.ronankaic.dslist.controllers;

import com.ronankaic.dslist.dto.GameMimDTO;
import com.ronankaic.dslist.entities.Game;
import com.ronankaic.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMimDTO> findAll() {
        List<GameMimDTO> result = gameService.findAll();
        return result;
    }

}

