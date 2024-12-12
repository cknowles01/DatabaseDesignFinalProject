package App.Application.Controllers;

import App.Domain.Game;
import App.Domain.Referee;
import App.Infrastructure.GameRepository;
import App.Infrastructure.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController()
@RequestMapping("/Referee")
public class RefereeController {

    private final RefereeRepository refereeRepository;


    public RefereeController(@Autowired JdbcTemplate databaseConnection){
        this.refereeRepository = new RefereeRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Referee> getAllReferees(){
        return this.refereeRepository.get();
    }
}

