package com.study.day12_6;

import java.util.List;

public interface Service {
	List<Youbike> queryYoubikes();
	List<Youbike> queryYoubikes(String snaKeyword);
	List<Youbike> queryByGatherThenSbi(Integer amount);
	List<Youbike> queryByGatherThenBemp(Integer amount);
	void updateYoubikes();
	void print(List<Youbike> youbikes);
	
	List<Youbike> queryByDistance(Double my_lat, Double my_lng, Double m);
}
