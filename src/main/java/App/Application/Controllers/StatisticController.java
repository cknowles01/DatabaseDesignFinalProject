package App.Application.Controllers;

import App.Domain.LeagueStats;
import App.Domain.Statistic;
import App.Infrastructure.LeagueStatsRepository;
import App.Infrastructure.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Statistic")
public class StatisticController {

    private final StatisticRepository statisticRepository;


    public StatisticController(@Autowired JdbcTemplate databaseConnection){
        this.statisticRepository = new StatisticRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Statistic> getAllStats(){
        return this.statisticRepository.get();
    }
}