package com.example.demo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import com.example.demo.condition.MilitaryCommanderSearchCondition;
import com.example.demo.entity.MilitaryCommander;

@ConfigAutowireable
@Dao
public interface MilitaryCommanderDao {

	@Select
	List<MilitaryCommander> selectAll();

	@Select
	List<MilitaryCommander> selectCondition(MilitaryCommanderSearchCondition condition, SelectOptions options);
}
