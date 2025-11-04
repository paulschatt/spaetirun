package spaetirun.spaetirun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaetirun.spaetirun.data.Spaetirun;

import java.util.UUID;

public interface SpaetirunRepository extends JpaRepository<Spaetirun, UUID> {
}
