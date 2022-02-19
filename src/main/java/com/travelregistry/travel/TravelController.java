package com.travelregistry.travel;

import com.travelregistry.utils.DistanceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<TravelDto> listAll() {
        List<Travel> travelsList = travelRepository.findAll();
        List<TravelDto> travelsDtoList = new ArrayList<>();

        DistanceCalculator distanceCalculator = new DistanceCalculator();

        System.out.println(distanceCalculator.distance(-26.2697733, -48.8343821, 41.1621416, -8.6394632, "K") + " Kilometers");

        if (!travelsList.isEmpty()) {
            for (Travel travel : travelsList) {
                travelsDtoList.add(travel.toDto());
            }
        }

        return travelsDtoList;
    }
}
