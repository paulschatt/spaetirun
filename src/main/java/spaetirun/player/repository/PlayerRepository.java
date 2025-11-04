package spaetirun.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaetirun.player.data.Player;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {
}
