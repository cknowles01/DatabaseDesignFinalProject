package App.Application.Controllers;

import App.Domain.Penalty;
import App.Infrastructure.BaseRepository;
import App.Infrastructure.PenaltyRepository;
import App.Infrastructure.TeamStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Penalty")
public class PenaltyController {

    private final PenaltyRepository penaltyRepository;


    public PenaltyController(@Autowired JdbcTemplate databaseConnection){
        this.penaltyRepository = new PenaltyRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Penalty> getAllPenalties(){
        return this.penaltyRepository.get();
    }
}