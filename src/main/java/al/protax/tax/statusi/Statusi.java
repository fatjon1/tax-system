package al.protax.tax.statusi;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "statusi")
public class Statusi {
    @Id
    @Column(name = "kod_statusi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kod_statusi;
    @Column(name = "statusi")
    private String statusi;
}
