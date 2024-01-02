package Controller;

import Entity.TravelPackage;
import Repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItineraryController {
    @Autowired
    ItineraryRepository itineraryRepository;

    @PostMapping("/addTravelPackage")
    public String createTravelPackage(@RequestBody TravelPackage travelPackage){
        itineraryRepository.save(travelPackage);
         return "travel package saved";
    }

    @GetMapping("/travelPackage")
    public ResponseEntity<List<TravelPackage>> getAllTravelPackage(){
        List<TravelPackage> travelPackageList=new ArrayList<>();
        itineraryRepository.findAll().forEach(travelPackageList::add);
        return new ResponseEntity<List<TravelPackage>>(travelPackageList, HttpStatus.OK);
    }
}
