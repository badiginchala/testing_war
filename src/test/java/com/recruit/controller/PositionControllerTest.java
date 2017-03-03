package com.recruit.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.recruit.pojo.Position;
import com.recruit.service.PositionService;

@RunWith(MockitoJUnitRunner.class)
public class PositionControllerTest {
	
	@InjectMocks
	private PositionController positionController;
	
	@Mock
	private PositionService positionService;
	
	@Test
	public void testCreatePosition() {
		positionController.createPosition(new Position());
		verify(positionService, times(1)).preparePosition(any(Position.class));
	}
	
	@Test
	public void testGetPosition() {
		positionController.getPosition();
		verify(positionService, times(1)).getPosition();
	}

}
