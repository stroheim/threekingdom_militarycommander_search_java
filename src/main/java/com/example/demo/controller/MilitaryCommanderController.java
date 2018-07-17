package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.PageWrapper;
import com.example.demo.condition.MilitaryCommanderSearchCondition;
import com.example.demo.entity.MilitaryCommander;
import com.example.demo.entity.SexDiv;
import com.example.demo.service.MilitaryCommanderService;
import com.example.demo.service.SexDivService;

@Controller
@RequestMapping("/threekingdom")
public class MilitaryCommanderController {

	private static final int DEFAULT_PAGEABLE_SIZE = 10;

	@Autowired
	private MilitaryCommanderService militaryCommanderService;

	@Autowired
	private SexDivService sexDivService;

	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<MilitaryCommander> list = militaryCommanderService.findAll();
		model.addAttribute("entities", list);
		return "military_commander/IndexPaged";
	}

	@RequestMapping(value = "/military_commander/IndexPaged", method = RequestMethod.GET)
	public String init(Model model) {
		List<SexDiv> sexDivList = sexDivService.getSexDivList();
		model.addAttribute("sexDivList", sexDivList);
		model.addAttribute("page", null);
		model.addAttribute("pagedList", null);
		model.addAttribute("condition", new MilitaryCommanderSearchCondition());
		return "military_commander/IndexPaged";
	}

	@RequestMapping(value = "/military_commander/IndexPaged")
	public String index(MilitaryCommanderSearchCondition condition,
			@PageableDefault(size = DEFAULT_PAGEABLE_SIZE, page = 0) Pageable pageable, Model model) {
		Page<MilitaryCommander> pagenatedList = militaryCommanderService.searchMilitaryCommander(condition, pageable);
		PageWrapper<MilitaryCommander> wrapper = new PageWrapper<MilitaryCommander>(pagenatedList,
				"/threekingdom/military_commander/IndexPaged");
		model.addAttribute("page", wrapper);
		model.addAttribute("pagedList", wrapper.getContent());
		model.addAttribute("condition", condition);
		List<SexDiv> sexDivList = sexDivService.getSexDivList();
		model.addAttribute("sexDivList", sexDivList);
		return "military_commander/IndexPaged";
	}

}
