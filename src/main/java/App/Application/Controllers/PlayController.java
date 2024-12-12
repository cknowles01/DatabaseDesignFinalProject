package App.Application.Controllers;

import App.Domain.Play;
import App.Domain.Referee;
import App.Infrastructure.PlayRepository;
import App.Infrastructure.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Play")
public class PlayController {

    private final PlayRepository playRepository;


    public PlayController(@Autowired JdbcTemplate databaseConnection){
        this.playRepository = new PlayRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Play> getAllPlays(){
        return this.playRepository.get();
    }
}

