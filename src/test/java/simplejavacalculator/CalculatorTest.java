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

}