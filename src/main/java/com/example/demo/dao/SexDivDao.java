package com.example.demo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.SexDiv;

@ConfigAutowireable
@Dao
public interface SexDivDao {

	@Select
	List<SexDiv> selectAll();

	@Insert
	int insert(SexDiv sexDiv);

}
