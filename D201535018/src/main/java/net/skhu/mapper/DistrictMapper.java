package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.City;

@Mapper
public interface DistrictMapper {

    List<City> findAll();
}
