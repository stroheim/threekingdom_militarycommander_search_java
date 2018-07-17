package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SexDivDao;
import com.example.demo.entity.SexDiv;

@Service
public class SexDivService {

	private SexDivDao sexDivDao;

	@Autowired
	public SexDivService(SexDivDao sexDivDao) {
		this.sexDivDao = sexDivDao;
	}

	public List<SexDiv> getSexDivList() {
		return sexDivDao.selectAll();
	}

}
