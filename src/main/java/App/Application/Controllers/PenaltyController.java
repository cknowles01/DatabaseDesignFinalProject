package App.Application.Controllers;

import App.Domain.Penalty;
import App.Infrastructure.BaseRepository;
import App.Infrastructure.PenaltyRepository;
import App.Infrastructure.TeamStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Penalty")
public class PenaltyController {

    private final PenaltyRepository penaltyRepository;

    public PenaltyController(@Autowired JdbcTemplate databaseConnection) {
        this.penaltyRepository = new PenaltyRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Penalty getPenaltyById(@PathVariable String id) throws Exception {
        return penaltyRepository.get(id);
    }

    @GetMapping("")
    public List<Penalty> getAllPenalties() {
        return penaltyRepository.get();
    }

    @PostMapping("")
    public void createPenalty(@RequestBody Penalty penalty) {
        penaltyRepository.create(penalty);
    }

    @DeleteMapping("/{id}")
    public void deletePenalty(@PathVariable String id) {
        penaltyRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updatePenalty(@PathVariable String id, @RequestBody Penalty penalty) {
        penaltyRepository.update(id, penalty);
    }
}
