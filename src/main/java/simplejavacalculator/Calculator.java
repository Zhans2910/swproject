/**
 * @name        Simple Java Calculator
 * @file        Calculator.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import static java.lang.Double.NaN;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class Calculator {

    public enum BiOperatorModes {
        /**comment.*/
        NORMAL, ADD, MINUS, MULTIPLY, DIVIDE, X_POWER_OF_Y 
    }

    public enum MonoOperatorModes {
        /**comment.*/
        SQUARE, SQUARE_ROOT, ONE_DEVIDE_BY, COS, SIN, TAN, LOG, RATE, ABS
    }
    /**comment.*/
    private Double num1;
    /**comment.*/
    private Double num2;
    /**comment.*/
    private BiOperatorModes mode = BiOperatorModes.NORMAL;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.NORMAL) {
            return num2;
        }
        if (mode == BiOperatorModes.ADD) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.MINUS) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.MULTIPLY) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.DIVIDE) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.X_POWER_OF_Y) {
            return pow(num1,num2);
        }

        // never reach
        throw new Error();
    }
    /** @return desired operation of two numbers.
     * @param num of two numbers is taken.
     * @param newMode type of operation.
     */
    public Double calculateBi(final BiOperatorModes newMode, final Double num) {
        if (mode == BiOperatorModes.NORMAL) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }
    /** @return calculate equal.
     * @param num is taken.
     */
    public Double calculateEqual(final Double num) {
        return calculateBi(BiOperatorModes.NORMAL, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.NORMAL;

        return NaN;
    }
    /** @return desired operation.
     * @param num is taken.
     * @param newMode is type of operation
     */
    public Double calculateMono(final MonoOperatorModes newMode, 
                                final Double num) {
        final int oneeightzero = 180;
        final int nineone = 90;
        final int hundredd = 100;
        if (newMode == MonoOperatorModes.SQUARE) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.SQUARE_ROOT) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.ONE_DEVIDE_BY) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.COS) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.SIN) {
            return Math.sin(num);
        }
        if (newMode == MonoOperatorModes.TAN) {
            if (num == 0 || num % oneeightzero == 0) {
                return 0.0;
            }
            if (num % nineone == 0 && num % oneeightzero != 0) {
                return NaN;
            }

            return Math.tan(num);
        }
        if (newMode == MonoOperatorModes.LOG) {
            return log10(num);
        }
        if (newMode == MonoOperatorModes.RATE) {
           return num / hundredd;
        }
        if (newMode == MonoOperatorModes.ABS){
            return Math.abs(num);
        }

        // never reach
        throw new Error();
    }

}
