/**
 * @name        Simple Java Calculator
 * @file        SimpleJavaCalculator.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

public final class SimpleJavaCalculator {
   private SimpleJavaCalculator() {
      //??
   }
   /** @param args for args*/
   public static void main(final String[] args) {
      try {
         UI uiCal = new UI();
         uiCal.init(); 
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }
}
