package App.Application.Controllers;

import App.Domain.PlayerStats;
import App.Domain.Team;
import App.Domain.TeamStats;
import App.Infrastructure.PlayerStatsRepository;
import App.Infrastructure.TeamRepository;
import App.Infrastructure.TeamStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TeamStats")
public class TeamStatsController {

    private final TeamStatsRepository teamStatsRepository;

    public TeamStatsController(@Autowired JdbcTemplate databaseConnection) {
        this.teamStatsRepository = new TeamStatsRepository(databaseConnection);
    }

    @GetMapping("")
    public List<TeamStats> getAllTeamStats() {
        return teamStatsRepository.get();
    }

    @GetMapping("/{id}")
    public TeamStats getTeamStatsById(@PathVariable int id) throws Exception {
        return teamStatsRepository.get(String.valueOf(id));
    }

    @PostMapping("")
    public void createTeamStats(@RequestBody TeamStats teamStats) {
        // Ensure LeagueStatID is sent as part of the request body
        teamStatsRepository.create(teamStats);
    }

    @PutMapping("/{id}")
    public void updateTeamStats(@PathVariable int id, @RequestBody TeamStats teamStats) {
        // Ensure LeagueStatID is updated properly
        teamStatsRepository.update(String.valueOf(id), teamStats);
    }

    @DeleteMapping("/{id}")
    public void deleteTeamStats(@PathVariable int id) {
        teamStatsRepository.delete(String.valueOf(id));
    }
}
