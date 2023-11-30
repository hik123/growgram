package com.green.growgreen.plant;

import com.green.growgreen.plant.model.PlantInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlantMapper {
    int insPlant(PlantInsDto dto);
}
