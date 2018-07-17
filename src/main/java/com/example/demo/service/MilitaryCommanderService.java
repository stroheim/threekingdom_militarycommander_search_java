package com.example.demo.service;

import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.condition.MilitaryCommanderSearchCondition;
import com.example.demo.dao.MilitaryCommanderDao;
import com.example.demo.entity.MilitaryCommander;

@Service
public class MilitaryCommanderService {

	@Autowired
	private MilitaryCommanderDao militaryCommanderDao;

	public List<MilitaryCommander> findAll() {
		return militaryCommanderDao.selectAll();
	}

	public Page<MilitaryCommander> searchMilitaryCommander(MilitaryCommanderSearchCondition condition,
			Pageable pageable) {
		int offset = pageable.getPageNumber() * pageable.getPageSize();
		int limit = pageable.getPageSize();
		SelectOptions options = SelectOptions.get().offset(offset).limit(limit).count();

		List<MilitaryCommander> results = militaryCommanderDao.selectCondition(condition, options);
		long count = options.getCount();

		Page<MilitaryCommander> pagenatedList = new PageImpl<MilitaryCommander>(results, pageable, count);
		return pagenatedList;

	}

}
