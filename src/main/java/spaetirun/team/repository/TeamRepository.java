package spaetirun.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaetirun.team.data.Team;

import java.util.UUID;

public interface TeamRepository extends JpaRepository<Team, UUID> {
}
