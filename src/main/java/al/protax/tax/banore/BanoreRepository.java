package al.protax.tax.banore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BanoreRepository extends JpaRepository<Banore,Long> {

    @Query(value = "DELETE FROM Banore b WHERE b.kod_pronari = ?1",nativeQuery = true )
    void deleteBanoreById(Long banoreId);
}
