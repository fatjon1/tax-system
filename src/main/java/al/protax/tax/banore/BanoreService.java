package al.protax.tax.banore;

import al.protax.tax.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BanoreService {

  private final BanoreRepository banoreRepository;

    @Autowired
    public BanoreService(BanoreRepository banoreRepository) {
        this.banoreRepository = banoreRepository;
    }

    public List<Banore> getAllBanore(){
        PageRequest limit = PageRequest.of(0, 100);
        return banoreRepository.findAll(limit).stream().toList();
    }

    public Banore getBanoreById(Long personId) throws UserNotFoundException {
       return banoreRepository.findById(personId)
               .orElseThrow(()-> new UserNotFoundException("User not found"));
    }

    public Banore addBanore(Banore banore){
       return banoreRepository.save(banore);
    }

    public Banore updateBanore(Banore banore){
        return banoreRepository.save(banore);
    }

    public void deleteBanore(Long banoreId){
        banoreRepository.deleteBanoreById(banoreId);
    }
}
