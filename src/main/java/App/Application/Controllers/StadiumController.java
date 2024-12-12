package App.Application.Controllers;


import App.Domain.Coach;
import App.Domain.Stadium;
import App.Infrastructure.CoachRepository;
import App.Infrastructure.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Stadium")
public class StadiumController {
    private final StadiumRepository stadiumRepository;

    public StadiumController(@Autowired JdbcTemplate databaseConnection) {
        this.stadiumRepository = new StadiumRepository(databaseConnection);
    }

    @GetMapping("")
    public List<Stadium> getAllStadiums() {
        return this.stadiumRepository.get();
    }

    @GetMapping("/{id}")
    public Stadium getStadiumById(@PathVariable String id) throws Exception {
        return stadiumRepository.get(id);
    }


    @PostMapping("")
    public void createStadium(@RequestBody Stadium stadium) {
        stadiumRepository.create(stadium);
    }

    @PutMapping("/{id}")
    public void updateStadium(@PathVariable String id, @RequestBody Stadium stadium) {
        stadiumRepository.update(id, stadium);
    }

    @DeleteMapping("/{id}")
    public void deleteStadium(@PathVariable String id) {
        stadiumRepository.delete(id);
    }
}


