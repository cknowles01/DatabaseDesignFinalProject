package App.Application.Controllers;

import App.Domain.Team;
import App.Infrastructure.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Team")
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(@Autowired JdbcTemplate databaseConnection) {
        this.teamRepository = new TeamRepository(databaseConnection);
    }

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamRepository.get();
    }

    @GetMapping("/{name}")
    public Team getTeamByName(@PathVariable String name) {
        return teamRepository.get(name);
    }

    @PostMapping("")
    public void createTeam(@RequestBody Team team) {
        teamRepository.create(team);
    }

    @PutMapping("/{name}")
    public void updateTeam(@PathVariable String name, @RequestBody Team team) {
        teamRepository.update(name, team);
    }

    @DeleteMapping("/{name}")
    public void deleteTeam(@PathVariable String name) {
        teamRepository.delete(name);
    }
}
