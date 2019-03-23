package cn.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class calTriAreaTest {
    private static calTriArea cal = new calTriArea();
	@Test
	public void testJudge() {
		assertEquals(false,cal.judge(2, 1, 3));
	}
	@Test
	public void testJudge1() {
		assertEquals(true,cal.judge(3, 4, 5));
	}
	@Test
	public void testJudge2() {
		assertEquals(false,cal.judge(-3, -4, -5));
	}
	@Test
	public void testCal(){
		assertEquals(3.89711431,cal.cal(3, 3, 3),0.00001);
	}
	@Test
	public void testCal1(){
		assertEquals(6.0,cal.cal(3, 4, 5),0.00001);
	}
	@Test
	public void testCal2(){
		assertEquals(-1.0,cal.cal(2, 1, 3),0.00001);
	}
	@Test
	public void testCal3(){
		assertEquals(-1.0,cal.cal(-2, -1, -3),0.00001);
	}
}
