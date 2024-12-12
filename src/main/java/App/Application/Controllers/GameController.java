package App.Application.Controllers;

import App.Domain.Game;
import App.Domain.Penalty;
import App.Infrastructure.GameRepository;
import App.Infrastructure.PenaltyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Game")
public class GameController {

    private final GameRepository gameRepository;

    public GameController(@Autowired JdbcTemplate databaseConnection) {
        this.gameRepository = new GameRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable String id) {
        return gameRepository.get(id);
    }

    @GetMapping("")
    public List<Game> getAllGames() {
        return gameRepository.get();
    }

    @PostMapping("")
    public void createGame(@RequestBody Game game) {
        gameRepository.create(game);
    }

    @PutMapping("/{id}")
    public void updateGame(@PathVariable String id, @RequestBody Game game) {
        gameRepository.update(id, game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable String id) {
        gameRepository.delete(id);
    }
}
