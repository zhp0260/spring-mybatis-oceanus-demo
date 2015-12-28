package com.oceanus.demo.dao.shard;

import com.bj58.oceanus.core.shard.Function;


import java.util.Map;

public class OrderInfoShardFunction implements Function{

	@Override
	public int execute(int size, Map<String, Object> parameters) {
		long id = Long.valueOf(parameters.get("ID").toString());
		System.out.println( "-------id: "+id+" size: "+size+" index: "+(int)(id % size)+"---------");
		return (int)(id % size);
	}

}
