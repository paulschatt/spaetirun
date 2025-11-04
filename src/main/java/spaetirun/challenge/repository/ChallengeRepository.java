package spaetirun.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaetirun.challenge.data.Challenge;

import java.util.UUID;

public interface ChallengeRepository extends JpaRepository<Challenge, UUID> {
}
