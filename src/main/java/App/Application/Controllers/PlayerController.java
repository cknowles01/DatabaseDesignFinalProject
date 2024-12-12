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

@RestController()
@RequestMapping("/Player")
public class PlayerController {

    private final PlayerRepository playerRepository;


    public PlayerController(@Autowired JdbcTemplate databaseConnection){
        this.playerRepository = new PlayerRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Player> getAllPlayers(){
        return this.playerRepository.get();
    }
}