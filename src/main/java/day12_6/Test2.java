package com.study.day12_6;

import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		Service service = new ServiceImpl();
		service.updateYoubikes();
		
		//List<Youbike> youbikes = service.queryYoubikes();
		//List<Youbike> youbikes = service.queryYoubikes("火車");
		//List<Youbike> youbikes = service.queryByGatherThenSbi(50);
		//List<Youbike> youbikes = service.queryByGatherThenBemp(50);
		Double my_lat = 24.990042172454217;
		Double my_lng = 121.31200549066264;
		Double m = 500.0;
		List<Youbike> youbikes = service.queryByDistance(my_lat, my_lng, m);
		service.print(youbikes);
		
		
	}
}
