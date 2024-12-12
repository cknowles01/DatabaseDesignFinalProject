package App.Application.Controllers;

import App.Domain.PlayerStats;
import App.Domain.TeamStats;
import App.Infrastructure.PlayerStatsRepository;
import App.Infrastructure.TeamStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/TeamStats")
public class TeamStatsController {

    private final TeamStatsRepository teamStatsRepository;


    public TeamStatsController(@Autowired JdbcTemplate databaseConnection){
        this.teamStatsRepository = new TeamStatsRepository(databaseConnection);
    }
    @GetMapping("")
    public List<TeamStats> getAllTeamStats(){
        return this.teamStatsRepository.get();
    }
}