package com.study.day12_6;

import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		Service service = new ServiceImpl();
		service.updateYoubikes();
		
		//List<Youbike> youbikes = service.queryYoubikes();
		//List<Youbike> youbikes = service.queryYoubikes("火車");
		//List<Youbike> youbikes = service.queryByGatherThenSbi(50);
		List<Youbike> youbikes = service.queryByGatherThenBemp(50);
		service.print(youbikes);
		
		
	}
}
