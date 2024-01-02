package Controller;

import Entity.Activities;
import Entity.Passenger;
import Repository.ActivitiesRepository;
import Repository.PassengerReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api2")
public class PassengerController {
    @Autowired
    PassengerReposiory passengerReposiory;

    @Autowired
    ActivitiesRepository activitiesRepository;

    @PostMapping("/addPassenger")
    public String addPassenger(@RequestBody Passenger passenger){
        passengerReposiory.save(passenger);
        return "Passenger saved";
    }

    @GetMapping("/passenger")
    public ResponseEntity<List<Passenger>> getAllPassenger(){
        List<Passenger> passengerList=new ArrayList<>();
        passengerReposiory.findAll().forEach(passengerList::add);
        return new ResponseEntity<List<Passenger>>(passengerList, HttpStatus.OK);
    }

    @GetMapping("/passenger/{passengerId}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long passengerId){
        Optional<Passenger> passengerOptional=passengerReposiory.findById(passengerId);
        if(passengerOptional.isEmpty()){
            return new ResponseEntity<Passenger>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<Passenger>(HttpStatus.OK);
        }
    }


}
