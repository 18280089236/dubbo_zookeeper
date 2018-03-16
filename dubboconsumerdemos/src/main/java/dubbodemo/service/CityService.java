package dubbodemo.service;

import dubbodemo.domain.City;

/**
 * 和RMI调用类似
 */
public interface CityService {

    public City findCityByName(String cityname);
}
