package App.Application.Controllers;

import App.Domain.Penalty;
import App.Domain.Score;
import App.Infrastructure.PenaltyRepository;
import App.Infrastructure.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Score")
public class ScoreController {

    private final ScoreRepository scoreRepository;

    public ScoreController(@Autowired JdbcTemplate databaseConnection) {
        this.scoreRepository = new ScoreRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable String id) throws Exception{
        return scoreRepository.get(id);
    }

    @GetMapping("")
    public List<Score> getAllScores() {
        return scoreRepository.get();
    }

    @PostMapping("")
    public void createScore(@RequestBody Score score) {
        scoreRepository.create(score);
    }

    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable String id) {
        scoreRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updateScore(@PathVariable String id, @RequestBody Score score) {
        scoreRepository.update(id, score);
    }
}
