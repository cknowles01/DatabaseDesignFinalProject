package App.Application.Controllers;

import App.Domain.LeagueStats;
import App.Domain.Statistic;
import App.Infrastructure.LeagueStatsRepository;
import App.Infrastructure.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Statistic")
public class StatisticController {

    private final StatisticRepository statisticRepository;

    public StatisticController(@Autowired JdbcTemplate databaseConnection) {
        this.statisticRepository = new StatisticRepository(databaseConnection);
    }

    @GetMapping("/{id}")
    public Statistic getStatisticById(@PathVariable String id) {
        return statisticRepository.get(id);
    }

    @GetMapping("")
    public List<Statistic> getAllStats() {
        return statisticRepository.get();
    }

    @PostMapping("")
    public void createStatistic(@RequestBody Statistic statistic) {
        statisticRepository.create(statistic);
    }

    @DeleteMapping("/{id}")
    public void deleteStatistic(@PathVariable String id) {
        statisticRepository.delete(id);
    }

    @PutMapping("/{id}")
    public void updateStatistic(@PathVariable String id, @RequestBody Statistic statistic) {
        statisticRepository.update(id, statistic);
    }
}
