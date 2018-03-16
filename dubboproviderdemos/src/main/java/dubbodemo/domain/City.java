package dubbodemo.domain;

import java.io.Serializable;

/**
 * 城市实体类
 *
 * 实体类通过 Dubbo 服务之间 RPC 调用，需要实现序列化接口。最好指定下 serialVersionUID 值。
 */
public class City implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

    public City() {
    }

    public City(Long id, Long provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
