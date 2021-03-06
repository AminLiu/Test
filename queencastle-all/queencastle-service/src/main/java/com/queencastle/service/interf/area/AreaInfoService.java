package com.queencastle.service.interf.area;

import java.util.List;

import com.queencastle.dao.PageInfo;
import com.queencastle.dao.model.area.Area;
import com.queencastle.dao.model.area.City;
import com.queencastle.dao.model.area.Province;

public interface AreaInfoService {

	/**
	 * 标准化省信息
	 * 
	 * @param province
	 * @return
	 */
	int normalizeProvince(Province province);

	/**
	 * 标准化城市信息
	 * 
	 * @param city
	 * @return
	 */
	int normalizeCity(City city);

	int normalizeArea(Area area);

	List<Province> getAllProvinces();

	List<City> getByProvinceId(String provinceId);

	Province getProvinceById(String id);

	City getCityById(String id);

	List<City> getByProvinceCode(String provinceCode);

	Province getProvinceByprovinceCode(String provinceCode);

	City getByCityCode(String cityCode);

	PageInfo<Province> getProvincePageData(int page, int rows, String cname);

	PageInfo<City> getCityPageData(int page, int rows, String cname);

	List<Area> getAreasByCityCode(String cityCode);

	List<Area> getAllAreas();

	Area getAllAreasByAreaCode(String areaCode);

}
