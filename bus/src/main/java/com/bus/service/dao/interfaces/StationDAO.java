package com.bus.service.dao.interfaces;

import java.util.List;

import com.bus.service.dao.models.Station;

public interface StationDAO {
	public void save(Station p);

	public List<Station> list();
}
