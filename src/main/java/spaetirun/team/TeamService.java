package spaetirun.team;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamService {

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return List.of(
                new Team("Team Alpha", "Berlin"),
                new Team("Team Beta", "Hamburg")
        );
    }

    @Data
    @AllArgsConstructor
    static class Team {
        private String name;
        private String city;
    }
}
