package App.Application.Controllers;

import App.Domain.Player;
import App.Domain.Statistic;
import App.Infrastructure.PlayerRepository;
import App.Infrastructure.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Player")
public class PlayerController {

    private final PlayerRepository playerRepository;

    // Constructor to inject the PlayerRepository
    public PlayerController(@Autowired JdbcTemplate databaseConnection) {
        this.playerRepository = new PlayerRepository(databaseConnection);
    }

    // GET: Retrieve all players
    @GetMapping("")
    public List<Player> getAllPlayers() {
        return this.playerRepository.get();
    }

    // GET: Retrieve a specific player by ID
    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable("id") String id) throws Exception {
        return this.playerRepository.get(id);
    }

    // POST: Create a new player
    @PostMapping("")
    public void createPlayer(@RequestBody Player player) {
        this.playerRepository.create(player);
    }

    // PUT: Update an existing player by ID
    @PutMapping("/{id}")
    public void updatePlayer(@PathVariable("id") String id, @RequestBody Player player) {
        this.playerRepository.update(id, player);
    }

    // DELETE: Delete a player by ID
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable("id") String id) {
        this.playerRepository.delete(id);
    }
}
