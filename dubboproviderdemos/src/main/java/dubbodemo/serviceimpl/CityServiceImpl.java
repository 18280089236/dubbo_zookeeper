package dubbodemo.serviceimpl;

import dubbodemo.domain.City;
import dubbodemo.service.CityService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.1")
public class CityServiceImpl implements CityService {
    @Override
    public City findCityByName(String cityname) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}

