package al.protax.tax.statusi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusiRepository extends JpaRepository<Statusi, Long> {
}
