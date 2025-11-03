package spaetirun.team.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spaetirun.team.data.Team;
import spaetirun.team.repository.TeamRepository;

import java.util.List;

@RestController
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
}
