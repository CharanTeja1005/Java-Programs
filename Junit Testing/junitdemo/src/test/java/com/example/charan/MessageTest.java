package com.example.charan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MessageTest {
	
	@Test
	public void testGetHello() {
		Message message = new Message();
		assertEquals("Hello" ,message.getHello());
	}
	
	@Test
	public void testGetBye() {
		Message message = new Message();
		assertEquals("Bye" ,message.getBye());
	}
	
	@Test
	public void testGetHelloNot() {
		Message message = new Message();
		assertNotEquals("Hello1" ,message.getHello());
	}

}
