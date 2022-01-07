package com.study.day12_6;

import java.util.List;

public interface Service {
	List<Youbike> queryYoubikes();
	List<Youbike> queryYoubikes(String snaKeyword);
	List<Youbike> queryByGatherThenSbi(Integer amount);
	List<Youbike> queryByGatherThenBemp(Integer amount);
}
