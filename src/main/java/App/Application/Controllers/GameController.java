package App.Application.Controllers;

import App.Domain.Game;
import App.Domain.Penalty;
import App.Infrastructure.GameRepository;
import App.Infrastructure.PenaltyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Game")
public class GameController {

    private final GameRepository gameRepository;


    public GameController(@Autowired JdbcTemplate databaseConnection){
        this.gameRepository = new GameRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Game> getAllGames(){
        return this.gameRepository.get();
    }
}