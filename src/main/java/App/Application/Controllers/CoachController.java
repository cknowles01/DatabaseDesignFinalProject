package App.Application.Controllers;


import App.Domain.Coach;
import App.Domain.Team;
import App.Infrastructure.CoachRepository;
import App.Infrastructure.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Coach")
public class CoachController {

    private final CoachRepository coachRepository;

    public CoachController(@Autowired JdbcTemplate databaseConnection) {
        this.coachRepository = new CoachRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Coach getCoachById(@PathVariable String id) {
        return coachRepository.get(id);
    }

    @GetMapping("")
    public List<Coach> getAllCoaches() {
        return coachRepository.get();
    }

    @PostMapping("")
    public void createCoach(@RequestBody Coach coach) {
        coachRepository.create(coach);
    }

    @DeleteMapping("/{id}")
    public void deleteCoach(@PathVariable String id) {
        coachRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updateCoach(@PathVariable String id, @RequestBody Coach coach) {
        coachRepository.update(id, coach);
    }
}


