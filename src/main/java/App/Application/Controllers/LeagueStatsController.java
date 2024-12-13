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



import App.Domain.LeagueStats;
import App.Infrastructure.LeagueStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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


    @GetMapping("/{id}")
    public LeagueStats getLeagueStatsById(@PathVariable String id) throws Exception {
        return leagueStatsRepository.get(id);
    }


    @PostMapping("")
    public void createLeagueStats(@RequestBody LeagueStats leagueStats) {
        leagueStatsRepository.create(leagueStats);
    }


    @PutMapping("/{id}")
    public void updateLeagueStats(@PathVariable String id, @RequestBody LeagueStats leagueStats) {
        leagueStatsRepository.update(id, leagueStats);
    }


    @DeleteMapping("/{id}")
    public void deleteLeagueStats(@PathVariable String id) {
        leagueStatsRepository.delete(id);
    }
}
