package com.recruit.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.recruit.pojo.Position;
import com.recruit.repository.PositionRepository;

@RunWith(MockitoJUnitRunner.class)
public class PositionServiceTest {
	
	@InjectMocks
	private PositionService positionService;
	
	@Mock
	private PositionRepository positionRepository;
	
	@Test
	public void testPreparePosition() {
		positionService.preparePosition(new Position());
		verify(positionRepository,times(1)).save(any(Position.class));
	}
	
	@Test
	public void testGetPosition() {
		positionService.getPosition();
		verify(positionRepository,times(1)).findAll();
	}

}
