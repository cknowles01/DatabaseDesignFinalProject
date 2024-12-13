package App.Application.Controllers;

import App.Domain.Player;
import App.Domain.PlayerStats;
import App.Infrastructure.PlayerRepository;
import App.Infrastructure.PlayerStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PlayerStats")
public class PlayerStatsController {

    private final PlayerStatsRepository playerStatsRepository;

    public PlayerStatsController(@Autowired JdbcTemplate databaseConnection) {
        this.playerStatsRepository = new PlayerStatsRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public PlayerStats getPlayerStatsById(@PathVariable String id) throws Exception {
        return playerStatsRepository.get(id);
    }

    @GetMapping("")
    public List<PlayerStats> getAllPlayerStats() {
        return playerStatsRepository.get();
    }

    @PostMapping("")
    public void createPlayerStats(@RequestBody PlayerStats playerStats) {
        playerStatsRepository.create(playerStats);
    }

    @DeleteMapping("/{id}")
    public void deletePlayerStats(@PathVariable String id) {
        playerStatsRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updatePlayerStats(@PathVariable String id, @RequestBody PlayerStats playerStats) {
        playerStatsRepository.update(id, playerStats);
    }
}
