package App.Application.Controllers;

import App.Domain.Game;
import App.Domain.Referee;
import App.Infrastructure.GameRepository;
import App.Infrastructure.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/Referee")
public class RefereeController {

    private final RefereeRepository refereeRepository;

    public RefereeController(@Autowired JdbcTemplate databaseConnection) {
        this.refereeRepository = new RefereeRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Referee getRefereeById(@PathVariable String id) throws Exception {
        return refereeRepository.get(id);
    }

    @GetMapping("")
    public List<Referee> getAllReferees() {
        return refereeRepository.get();
    }

    @PostMapping("")
    public void createReferee(@RequestBody Referee referee) {
        refereeRepository.create(referee);
    }

    @DeleteMapping("/{id}")
    public void deleteReferee(@PathVariable String id) {
        refereeRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updateReferee(@PathVariable String id, @RequestBody Referee referee) {
        refereeRepository.update(id, referee);
    }
}

