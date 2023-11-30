package com.green.growgreen.plant;

import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelDto;
import com.green.growgreen.plant.model.PlantSelVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plant")
public class PlantController {
    private final PlantService service;

    @PostMapping
    public ResVo postPlant(@RequestBody PlantInsDto dto) {
        return service.postPlant(dto);
    };

    @GetMapping
    public List<PlantSelVo> getPlantAll(PlantSelDto dto) { //get방식은 json으로 받는거 아님 @RequestBody  X
        log.info("dto : {}", dto);
        return service.getPlantAll(dto);
    }
}


