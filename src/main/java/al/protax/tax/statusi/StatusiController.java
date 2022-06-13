package al.protax.tax.statusi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusiController {

    private final StatusiService statusiService;
    @Autowired
    public StatusiController(StatusiService statusiService) {
        this.statusiService = statusiService;
    }

    @GetMapping(path = "api/v1/statuses")
    public List<Statusi> getStatuses(){
        return statusiService.getStatuses();
    }
}
