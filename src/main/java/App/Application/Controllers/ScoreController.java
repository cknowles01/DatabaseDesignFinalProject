package App.Application.Controllers;

import App.Domain.Penalty;
import App.Domain.Score;
import App.Infrastructure.PenaltyRepository;
import App.Infrastructure.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Score")
public class ScoreController {

    private final ScoreRepository scoreRepository;


    public ScoreController(@Autowired JdbcTemplate databaseConnection){
        this.scoreRepository = new ScoreRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Score> getAllScores(){
        return this.scoreRepository.get();
    }
}