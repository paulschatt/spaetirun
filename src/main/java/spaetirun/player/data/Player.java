package spaetirun.player.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import spaetirun.spaetirun.data.Spaetirun;
import spaetirun.team.data.Team;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    private UUID id;

    private String name;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Spaetirun spaetirun;

    @Column(insertable = false, updatable = false)
    private Date createdAt;
}
