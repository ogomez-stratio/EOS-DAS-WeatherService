package com.stratio.daasWeatherService.dao;

import com.stratio.daasWeatherService.domain.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherEntity,Long>{

    List<WeatherEntity> findByDesCityAndDesTextLikeIgnoreCase(String city, String text);
}
