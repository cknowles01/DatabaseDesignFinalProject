package App.Application.Controllers;

import App.Domain.Player;
import App.Domain.PlayerStats;
import App.Infrastructure.PlayerRepository;
import App.Infrastructure.PlayerStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/PlayerStats")
public class PlayerStatsController {

    private final PlayerStatsRepository playerStatsRepository;


    public PlayerStatsController(@Autowired JdbcTemplate databaseConnection){
        this.playerStatsRepository = new PlayerStatsRepository(databaseConnection);
    }
    @GetMapping("")
    public List<PlayerStats> getAllPlayerStats(){
        return this.playerStatsRepository.get();
    }
}
