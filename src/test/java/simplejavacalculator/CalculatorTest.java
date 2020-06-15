package simplejavacalculator;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Double.NaN;

public class CalculatorTest {
    @Test
    public void Test1() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void Test2() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE_ROOT, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Test3() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ONE_DEVIDE_BY, 25.0);
        Assert.assertEquals((Double) 0.04, result);
    }
    @Test
    public void Test4() throws Exception{
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SIN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Test5() throws Exception{
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD,3.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL,5.0 );
        Assert.assertEquals((Double) 8.0, result);
    }
    
    @Test
    public void Test6() throws Exception{
        Calculator c = new Calculator();
        Assert.assertEquals((Double)5.0, c.calculateMono(Calculator.MonoOperatorModes.ABS, -5.0));
        Assert.assertEquals((Double)5.0, c.calculateMono(Calculator.MonoOperatorModes.ABS, 5.0));
    }

    @Test
    public void Test7() throws Exception{
        Calculator c = new Calculator();
        Assert.assertEquals((Double) .45, c.calculateMono(Calculator.MonoOperatorModes.RATE, 45.0));
    }

    @Test
    public void Test8() throws Exception {
        Calculator c = new Calculator();
        Assert.assertEquals((Double)3.0, c.calculateMono(Calculator.MonoOperatorModes.LOG, 1000.0));
    }

    @Test
    public void Test9() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MULTIPLY, 4.8);
        Assert.assertEquals( (Double) 9.6, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 2.0));
    }

    @Test
    public void Test10() throws Exception {
	Calculator c = new Calculator();
	c.calculateBi(Calculator.BiOperatorModes.MINUS, 6.565);
	Double result= c.calculateBi(Calculator.BiOperatorModes.NORMAL, 1.3);
	Assert.assertEquals( (Double) 5.265000000000001, result);
    }
    @Test
    public void Test11() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.COS, 0.0);
        Assert.assertEquals((Double) 1.0, calculation);
    }
    @Test
    public void Test12() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.TAN, 0.0);
        Assert.assertEquals((Double) 0.0, calculation);
    }
    @Test
    public void Test13() throws Exception{
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.TAN, 90.0);
        Assert.assertTrue(Double.isNaN(calculation));
    }
    @Test
    public void Test14() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.DIVIDE, 14.0);
        Double result= c.calculateBi(Calculator.BiOperatorModes.NORMAL, 1.4);
        Assert.assertEquals( (Double) 10.0, result);
    }
    @Test
    public void Test15() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.NORMAL, 5.0);
        Assert.assertTrue(Double.isNaN(c.calculateBi(Calculator.BiOperatorModes.NORMAL, 8.0)));
    }
    @Test
    public void Test16() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.X_POWER_OF_Y, 2.0);
        Double result= c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals( (Double) 8.0, result);
    }
    @Test
    public void Test17() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD,3.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL,0.0 );
        Assert.assertEquals((Double) 3.0, result);
    }
    @Test
    public void Test18() throws Exception {
            Calculator calculator = new Calculator();
            calculator.calculateBi(Calculator.BiOperatorModes.ADD, 8.3);
            calculator.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
            Assert.assertEquals((Double)13.3, calculator.calculateEqual(3.0));
    }
    @Test
    public void Test19() throws Exception {
        Calculator c = new Calculator();
        Double calculation = c.calculateMono(Calculator.MonoOperatorModes.TAN, -30.0);
        Assert.assertEquals((Double) 6.405331196646276, calculation);
    }
    @Test
    public void Test20() throws Exception {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.NORMAL, 0.0);
        Assert.assertTrue(Double.isNaN(c.reset()));
    }
}


