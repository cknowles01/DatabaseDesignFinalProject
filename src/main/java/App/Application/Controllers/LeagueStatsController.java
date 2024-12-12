package App.Application.Controllers;

import App.Domain.LeagueStats;
import App.Domain.Stadium;
import App.Infrastructure.LeagueStatsRepository;
import App.Infrastructure.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/LeagueStats")
public class LeagueStatsController {

    private final LeagueStatsRepository leagueStatsRepository;


    public LeagueStatsController(@Autowired JdbcTemplate databaseConnection){
        this.leagueStatsRepository = new LeagueStatsRepository(databaseConnection);
    }
    @GetMapping("")
    public List<LeagueStats> getAllLeagueStats(){
        return this.leagueStatsRepository.get();
    }
}