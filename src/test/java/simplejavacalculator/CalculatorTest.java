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
}