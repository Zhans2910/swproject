package simplejavacalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void ZhansayaTest() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.square, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void testZhansayaTest() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Test1() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 25.0);
        Assert.assertEquals((Double) 0.04, result);
    }
    @Test
    public void Test2() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.sin, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Test3() throws Exception{
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add,3.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal,5.0 );
        Assert.assertEquals((Double) 8.0, result);
    }
    
    @Test
    public void Test4() throws Exception{
        Calculator c = new Calculator();
        Assertions.assertEquals(5.0, c.calculateMono(Calculator.MonoOperatorModes.abs, -5.0));
        Assertions.assertEquals(5.0, c.calculateMono(Calculator.MonoOperatorModes.abs, 5.0));
    }

    @Test
    public void Test5() throws Exception{
        Calculator c = new Calculator();
        Assertions.assertEquals(.45, c.calculateMono(Calculator.MonoOperatorModes.rate, 45.0));
    }

    @Test
    public void Test6() throws Exception {
        Calculator c = new Calculator();
        Assertions.assertEquals(3.0, c.calculateMono(Calculator.MonoOperatorModes.log, 1000.0));
    }

    @Test
    public void Test7() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.multiply, 4.8);
        Assertions.assertEquals(9.6, c.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
    }

    @Test
	public void Test8() throws Exception {
		Calculator c = new Calculator();
		c.calculateBi(Calculator.BiOperatorModes.minus, 6.565);
		Assertions.assertEquals(5.265, c.calculateBi(Calculator.BiOperatorModes.normal, 1.3));
	}


}
