package spaetirun.spaetirun.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Spaetirun {
    @Id
    private UUID id;

    private String name;

    @Column(insertable = false, updatable = false)
    private Date createdAt;
}
