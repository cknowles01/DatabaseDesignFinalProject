package App.Application.Controllers;

import App.Domain.Play;
import App.Domain.Referee;
import App.Infrastructure.PlayRepository;
import App.Infrastructure.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Play")
public class PlayController {

    private final PlayRepository playRepository;

    // Constructor injection of JdbcTemplate into PlayRepository
    public PlayController(@Autowired JdbcTemplate databaseConnection) {
        this.playRepository = new PlayRepository(databaseConnection);
    }

    // Endpoint to get all plays
    @GetMapping("")
    public List<Play> getAllPlays() {
        return this.playRepository.get();
    }

    // Endpoint to get a specific play by its ID
    @GetMapping("/{id}")
    public Play getPlayById(@PathVariable String id) throws Exception {
        return this.playRepository.get(id);
    }

    // Endpoint to create a new play
    @PostMapping("")
    public void createPlay(@RequestBody Play play) {
        this.playRepository.create(play);
    }

    // Endpoint to update an existing play
    @PutMapping("/{id}")
    public void updatePlay(@PathVariable String id, @RequestBody Play play) {
        this.playRepository.update(id, play);
    }

    // Endpoint to delete a play by its ID
    @DeleteMapping("/{id}")
    public void deletePlay(@PathVariable String id) {
        this.playRepository.delete(id);
    }
}