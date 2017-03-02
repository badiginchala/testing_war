package com.recruit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.recruit.pojo.Position;
import com.recruit.service.IPositionService;

@Controller
public class PositionController {

	@Autowired
	private IPositionService positionService;

	@RequestMapping(value = "/position", method = RequestMethod.POST)
	@ResponseBody
	public Position createPosition(@RequestBody Position position) {
		positionService.preparePosition(position);
		return position;
	}
	
	@RequestMapping(value = "/position", method = RequestMethod.GET)
	@ResponseBody
	public List<Position> getPosition() {
		List<Position> positionList = positionService.getPosition();
		return positionList;
	}

}
