package al.protax.tax.banore;

import al.protax.tax.statusi.Statusi;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "Banore")
@Table(name = "banore")
public class Banore {
    @Id
    @Column(name = "kod_pronari")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kod_pronari;
    @Column(name = "emri")
    private String emri;
    @Column(name = "datelindja")
    private LocalDate datelindja;
    @Column(name = "nid")
    private String nid;
    @Nullable
    @OneToOne
    @JoinColumn(name = "statusi_fkey", referencedColumnName = "kod_statusi")
    private Statusi statusi_fkey;
    //private FamilyStatus familyStatus;
    //private FamilyMembers familyMembers;


    public Banore(String emri, LocalDate datelindja, String nid, @Nullable Statusi statusi_fkey) {
        this.emri = emri;
        this.datelindja = datelindja;
        this.nid = nid;
        this.statusi_fkey = statusi_fkey;
    }
}
