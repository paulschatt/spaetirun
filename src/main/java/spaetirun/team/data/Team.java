package spaetirun.team.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;
import spaetirun.spaetirun.data.Spaetirun;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    private UUID id;

    private String name;

    @OneToOne
    private Spaetirun spaetirun;

    @Column(insertable = false, updatable = false)
    private Date createdAt;
}
