package App.Infrastructure;

import App.Domain.Coach;
import App.Domain.Team;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class CoachRepository extends BaseRepository<Coach> {

    public CoachRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Coach get(String id) {
        return this.getDatabaseConnection().queryForObject("SELECT * FROM COACH WHERE ID = ?", BeanPropertyRowMapper.newInstance(Coach.class), id);
    }

    @Override
    public List<Coach> get() {
        return this.getDatabaseConnection().query("SELECT * FROM COACH", BeanPropertyRowMapper.newInstance(Coach.class));
    }

    @Override
    public void create(Coach coach) {
        this.getDatabaseConnection().update("INSERT INTO COACH (ID, NAME, AGE, EXPERIENCE, TEAM) VALUES (?, ?, ?, ?, ?)",
                coach.getID(), coach.getName(), coach.getAge(), coach.getExperience(), coach.getTeam());
    }

    @Override
    public void delete(String id) {
        this.getDatabaseConnection().update("DELETE FROM COACH WHERE ID = ?", id);
    }

    @Override
    public void update(String id, Coach coach) {
        this.getDatabaseConnection().update("UPDATE COACH SET NAME = ?, AGE = ?, EXPERIENCE = ?, TEAM = ? WHERE ID = ?",
                coach.getName(), coach.getAge(), coach.getExperience(), coach.getTeam(), id);
    }
}
