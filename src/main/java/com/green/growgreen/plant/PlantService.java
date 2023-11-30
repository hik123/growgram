package com.green.growgreen.plant;


import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PlantService {
    private final PlantMapper mapper;

    public ResVo postPlant(PlantInsDto dto) {
        int affectedRow = mapper.insPlant(dto);
        return new ResVo(dto.getIplant());
    };
}
