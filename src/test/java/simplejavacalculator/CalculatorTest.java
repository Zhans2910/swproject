package simplejavacalculator;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Double.NaN;

public class CalculatorTest {
    @Test
    public void Test1() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.square, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void Test2() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Test3() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 25.0);
        Assert.assertEquals((Double) 0.04, result);
    }
    @Test
    public void Test4() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.sin, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Test5() throws Exception{
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add,3.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal,5.0 );
        Assert.assertEquals((Double) 8.0, result);
    }
    
    @Test
    public void Test6() throws Exception{
        Calculator c = new Calculator();
        Assert.assertEquals((Double)5.0, c.calculateMono(Calculator.MonoOperatorModes.abs, -5.0));
        Assert.assertEquals((Double)5.0, c.calculateMono(Calculator.MonoOperatorModes.abs, 5.0));
    }

    @Test
    public void Test7() throws Exception{
        Calculator c = new Calculator();
        Assert.assertEquals((Double) .45, c.calculateMono(Calculator.MonoOperatorModes.rate, 45.0));
    }

    @Test
    public void Test8() throws Exception {
        Calculator c = new Calculator();
        Assert.assertEquals((Double)3.0, c.calculateMono(Calculator.MonoOperatorModes.log, 1000.0));
    }

    @Test
    public void Test9() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.multiply, 4.8);
        Assert.assertEquals( (Double) 9.6, c.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
    }

    @Test
    public void Test10() throws Exception {
	Calculator c = new Calculator();
	c.calculateBi(Calculator.BiOperatorModes.minus, 6.565);
	Double result= c.calculateBi(Calculator.BiOperatorModes.normal, 1.3);
	Assert.assertEquals( (Double) 5.265000000000001, result);
    }
    @Test
    public void Test11() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.cos, 0.0);
        Assert.assertEquals((Double) 1.0, calculation);
    }
    @Test
    public void Test12() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.tan, 0.0);
        Assert.assertEquals((Double) 0.0, calculation);
    }
    @Test
    public void Test13() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.tan, 90.0);
        Assert.assertTrue(Double.isNaN(calculation));
    }
    @Test
    public void Test14() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.divide, 14.0);
        Double result= c.calculateBi(Calculator.BiOperatorModes.normal, 1.4);
        Assert.assertEquals( (Double) 10.0, result);
    }

}
