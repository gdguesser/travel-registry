package com.travelregistry.travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {

    @Autowired
    private TravelRepository travelRepository;

    @PostMapping("/v1/travel/register")
    public TravelDto registerTravel(@RequestBody TravelForm travelForm) {
        Travel travel = travelForm.toModel();
        travelRepository.save(travel);

        return new TravelDto(travelForm.getOrigin(), travelForm.getDestiny(), travelForm.getDistanceBetweenOriginAndDestiny());
    }
}
