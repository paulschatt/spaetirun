package spaetirun.challenge.data;

import jakarta.persistence.*;
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
public class Challenge {
    @Id
    private UUID id;

    private String name;

    private String description;

    private int points;

    //How often a challenge can be done
    private int maxTimes;

    @ManyToOne
    private Spaetirun spaetirun;

    @Column(insertable = false, updatable = false)
    private Date createdAt;
}
