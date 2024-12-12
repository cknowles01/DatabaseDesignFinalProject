package App.Application.Controllers;

import App.Domain.Team;
import App.Infrastructure.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Team")
public class TeamController {

    private final TeamRepository teamRepository;


    public TeamController(@Autowired JdbcTemplate databaseConnection){
        this.teamRepository = new TeamRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Team> getAllTeams(){
        return this.teamRepository.get();
    }
}
