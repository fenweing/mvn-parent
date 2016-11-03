package org.mvn.dao;

import org.apache.ibatis.annotations.Param;
import org.mvn.common.User;

public interface TestDao {
	public User getUserByName(@Param(value="name")String name);
}
