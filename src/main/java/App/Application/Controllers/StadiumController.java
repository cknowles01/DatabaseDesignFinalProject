package App.Application.Controllers;


import App.Domain.Coach;
import App.Domain.Stadium;
import App.Infrastructure.CoachRepository;
import App.Infrastructure.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Stadium")
public class StadiumController {

    private final StadiumRepository stadiumRepository;


    public StadiumController(@Autowired JdbcTemplate databaseConnection){
        this.stadiumRepository = new StadiumRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Stadium> getAllStadiums(){
        return this.stadiumRepository.get();
    }
}
