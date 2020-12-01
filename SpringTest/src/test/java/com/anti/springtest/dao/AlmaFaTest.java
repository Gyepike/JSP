package com.anti.springtest.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.anti.springtest.services.dto.AlmaFa;

class AlmaFaTest {

	@Test
	void testHelloWrold() {
		 AlmaFa almafa = new AlmaFa();
		 assertEquals("PS4",almafa.helloWrold());
	}

}
