package com.greatlearning.springaop.example1;

import java.util.HashMap;
import java.util.Map;

public class PassangerDaoImpl implements PassangerDao {

	private static Map<Integer, Passanger> passangerMap = new HashMap<Integer, Passanger>();

	public Passanger getPassanger(int id) {
		if (null != passangerMap.get(id)) {
			return passangerMap.get(id);
		}
		Passanger passanger = new Passanger(id);
		passangerMap.put(id, passanger);
		return passanger;
	}

}
