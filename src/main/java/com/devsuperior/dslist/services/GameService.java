package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.dto.GameMinimoDTO;
import com.devsuperior.dslist.projections.GameMinimoProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<GameMinimoDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        //transforma a lista de games com a variavel result em uma lista de gameMinimoDTO
        return result.stream().map(GameMinimoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinimoDTO> findByList(long  listId) {
        List<GameMinimoProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinimoDTO::new).toList();
    }

}
