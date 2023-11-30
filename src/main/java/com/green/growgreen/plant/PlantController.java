package com.green.growgreen.plant;

import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
