package al.protax.tax.statusi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusiService {

        private final StatusiRepository statusiRepository;

    @Autowired
    public StatusiService(StatusiRepository statusiRepository) {
        this.statusiRepository = statusiRepository;
    }

    public List<Statusi> getStatuses(){
        return statusiRepository.findAll();
    }

}
