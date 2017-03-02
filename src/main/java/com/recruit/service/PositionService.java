package com.recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruit.repository.PositionRepository;
import com.recruit.pojo.Position;

@Service
public class PositionService implements IPositionService {

	@Autowired
	PositionRepository positionRepository;


	public Position preparePosition(Position position) {
		return positionRepository.save(position);
	}

}