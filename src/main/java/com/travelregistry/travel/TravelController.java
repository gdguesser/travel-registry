package com.travelregistry.travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/travels")
public class TravelController {

    @Autowired
    private TravelRepository travelRepository;

    @PostMapping("/register")
    public TravelDto registerTravel(@RequestBody TravelForm travelForm) {
        Travel travel = travelForm.toModel();
        travelRepository.save(travel);

        return new TravelDto(travelForm.getOrigin(), travelForm.getDestiny(), travelForm.getDistanceBetweenOriginAndDestiny());
    }

    @GetMapping
    public List<Travel> listAll() {
        return travelRepository.findAll();
    }
}
