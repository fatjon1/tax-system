package al.protax.tax.banore;

import al.protax.tax.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/banoret")
public class BanoreController {

    private final BanoreService banoreService;
    @Autowired
    public BanoreController(BanoreService banoreService) {
        this.banoreService = banoreService;
    }
    @GetMapping
    public ResponseEntity<List<Banore>> getAllPersons(){
        List<Banore> banoret = banoreService.getAllBanore();
        return new ResponseEntity<>(banoret, HttpStatus.OK);
    }

    @GetMapping("/{banoreId}")
    public ResponseEntity<Banore> getBanore(@PathVariable("banoreId") Long banoreId) throws UserNotFoundException {
        Banore banori = banoreService.getBanoreById(banoreId);
        return new ResponseEntity<>(banori, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Banore> addBanore(@RequestBody Banore banore){
        Banore banori = banoreService.addBanore(banore);
        return new ResponseEntity<>(banori, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Banore> updateBanore(@RequestBody Banore banore){
        Banore banori = banoreService.updateBanore(banore);
        return new ResponseEntity<>(banori, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{banoreId}")
    public ResponseEntity<?> deleteBanore(@PathVariable("banoreId") Long banoreId){
         banoreService.deleteBanore(banoreId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public ResponseEntity<List<Banore>> findBanoreByName(@PathVariable("name") String name){
       List<Banore> banoret = banoreService.findBanoreByName(name);
       return new ResponseEntity<>(banoret, HttpStatus.OK);
    }


}
