package al.protax.tax.family_status;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "sf")
public class FamilyStatus {
    @Id
    @Column(name = "familje_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familyStatusId;
    @Column(name = "familja")
    private String familyStatus;
}
