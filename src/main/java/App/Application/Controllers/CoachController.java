package App.Application.Controllers;


import App.Domain.Coach;
import App.Domain.Team;
import App.Infrastructure.CoachRepository;
import App.Infrastructure.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Coach")
public class CoachController {

    private final CoachRepository coachRepository;


    public CoachController(@Autowired JdbcTemplate databaseConnection){
        this.coachRepository = new CoachRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Coach> getAllCoaches(){
        return this.coachRepository.get();
    }
}
