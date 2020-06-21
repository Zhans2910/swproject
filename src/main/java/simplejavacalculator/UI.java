/**
 * @name        Simple Java Calculator
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;


import java.io.*;

public class UI implements ActionListener {
   /**comment.*/
   private final JFrame frame;
   /**comment.*/
   private final JPanel panel;
   /**comment.*/
   private final JPanel panelSub1;
   /**comment.*/
   private final JPanel panelSub2;
   /**comment.*/
   private final JPanel panelSub3;
   /**comment.*/
   private final JPanel panelSub4;
   /**comment.*/
   private final JPanel panelSub5;
   /**comment.*/
   private final JPanel panelSub6;
   /**comment.*/
   private final JPanel panelSub7;
   /**comment.*/
   private final JPanel panelSub8;
   /**comment.*/
   private final JTextArea text;
   /**comment.*/
   private final JButton[] but;
   /**comment.*/
   private final JButton butAdd;
   /**comment.*/
   private final JButton butMinus;
   /**comment.*/
   private final JButton butMultiply;
   /**comment.*/
   private final JButton butDivide;
   /**comment.*/
   private final JButton butEqual;
   /**comment.*/
   private final JButton butCancel;
   /**comment.*/
   private final JButton butSquareRoot;
   /**comment.*/
   private final JButton butSquare;
   /**comment.*/
   private final JButton butOneDevidedBy;
   /**comment.*/
   private final JButton butCos;
   /**comment.*/
   private final JButton butSin;
   /**comment.*/
   private final JButton butTan;
   /**comment.*/
   private final JButton butxpowerofy;
   /**comment.*/
   private final JButton butlog;
   /**comment.*/
   private final JButton butrate;
   /**comment.*/
   private final JButton butabs;
   /**comment.*/
   private final JButton butBinary;
   /**comment.*/
   private final Calculator calc;
   /**comment.*/
   private static final String[] BUTTON_VALUE = {"0", "1", "2", "3",
      "4", "5", "6",
      "7", "8", "9"};
   /**comment.*/
   private final Font font;
   /**comment.*/
   private final Font textFont;
   /**comment.*/
   public UI() throws IOException {
      final int oneeight = 18;
      final int thirty = 30;
      final int twofour = 24;
      final int tenn = 10;
      frame = new JFrame("Calculator PH");
      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panelSub1 = new JPanel(new FlowLayout());
      panelSub2 = new JPanel(new FlowLayout());
      panelSub3 = new JPanel(new FlowLayout());
      panelSub4 = new JPanel(new FlowLayout());
      panelSub5 = new JPanel(new FlowLayout());
      panelSub6 = new JPanel(new FlowLayout());
      panelSub7 = new JPanel(new FlowLayout());
      panelSub8 = new JPanel(new FlowLayout());
      font = new Font("Consolas", Font.PLAIN, oneeight);
      text = new JTextArea(1, thirty);
      textFont = new Font("Consolas", Font.BOLD, twofour);
      but = new JButton[tenn];
      for (int i = 0; i < tenn; i++) {
         but[i] = new JButton(String.valueOf(i)); }
      butAdd = new JButton("+");
      butMinus = new JButton("-");
      butMultiply = new JButton("*");
      butDivide = new JButton("/");
      butEqual = new JButton("=");
      butSquareRoot = new JButton("sqrt");
      butSquare = new JButton("x*x");
      butOneDevidedBy = new JButton("1/x");
      butCos = new JButton("Cos");
      butSin = new JButton("Sin");
      butTan = new JButton("Tan");
      butxpowerofy = new JButton("x^y");
      butlog = new JButton("log10(x)");
      butrate = new JButton("x%");
      butabs = new JButton("abs(x)");
      butCancel = new JButton("C");
      butBinary = new JButton("Bin");
      calc = new Calculator();
   }
   /**comment.*/
   public void init() {
      final int tenn = 10;
      final int w = 450;
      final int h = 450;
      final int twoonezero = 210;
      final int onefive = 15;
      final int thr = 3;
      final int fou = 4;
      final int fiv = 5;
      final int sixx = 6;
      final int seve = 7;
      final int eigh = 8;
      final int nin = 9;
      final int onehundred = 100;
      frame.setSize(w, h);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      text.setFont(textFont);
      text.setEditable(false);
      for (int i = 0; i < tenn; i++) {
         but[i].setFont(font);
      }
      butAdd.setFont(font);
      butMinus.setFont(font);
      butMultiply.setFont(font);
      butDivide.setFont(font);
      butEqual.setFont(font);
      butSquareRoot.setFont(font);
      butSquare.setFont(font);
      butOneDevidedBy.setFont(font);
      butCos.setFont(font);
      butSin.setFont(font);
      butTan.setFont(font);
      butxpowerofy.setFont(font);
      butlog.setFont(font);
      butrate.setFont(font);
      butabs.setFont(font);
      butCancel.setFont(font);
      butBinary.setFont(font);
      panel.add(Box.createHorizontalStrut(onehundred));
      panelSub1.add(text);
      panel.add(panelSub1);
      panelSub2.add(but[1]);
      panelSub2.add(but[2]);
      panelSub2.add(but[thr]);
      panelSub2.add(Box.createHorizontalStrut(onefive));
      panelSub2.add(butAdd);
      panelSub2.add(butMinus);
      panel.add(panelSub2);
      panelSub3.add(but[fou]);
      panelSub3.add(but[fiv]);
      panelSub3.add(but[sixx]);
      panelSub3.add(Box.createHorizontalStrut(onefive));
      panelSub3.add(butMultiply);
      panelSub3.add(butDivide);
      panel.add(panelSub3);
      panelSub4.add(but[seve]);
      panelSub4.add(but[eigh]);
      panelSub4.add(but[nin]);
      panelSub4.add(Box.createHorizontalStrut(onefive));
      panelSub4.add(butEqual);
      panelSub4.add(butCancel);
      panel.add(panelSub4);
      panelSub5.add(but[0]);
      panelSub5.add(Box.createHorizontalStrut(twoonezero));
      panel.add(panelSub5);
      panelSub6.add(butSquare);
      panelSub6.add(butSquareRoot);
      panelSub6.add(butOneDevidedBy);
      panelSub6.add(butxpowerofy);
      panel.add(panelSub6);
      panelSub7.add(butCos);
      panelSub7.add(butSin);
      panelSub7.add(butTan);
      panel.add(panelSub7);
      panelSub8.add(butlog);
      panelSub8.add(butrate);
      panelSub8.add(butabs);
      panelSub8.add(butBinary);
      panel.add(panelSub8);
      for (int i = 0; i < tenn; i++) {
         but[i].addActionListener(this);
      }
      butAdd.addActionListener(this);
      butMinus.addActionListener(this);
      butMultiply.addActionListener(this);
      butDivide.addActionListener(this);
      butSquare.addActionListener(this);
      butSquareRoot.addActionListener(this);
      butOneDevidedBy.addActionListener(this);
      butCos.addActionListener(this);
      butSin.addActionListener(this);
      butTan.addActionListener(this);
      butxpowerofy.addActionListener(this);
      butlog.addActionListener(this);
      butrate.addActionListener(this);
      butabs.addActionListener(this);
      butBinary.addActionListener(this);
      butEqual.addActionListener(this);
      butCancel.addActionListener(this);
      frame.add(panel);
   }
   @Override
   /** @param e for parameter.*/
   public void actionPerformed(final ActionEvent e) {
      final int tenn = 10;
      final Object source = e.getSource();
      for (int i = 0; i < tenn; i++) {
         if (source == but[i]) {
            text.replaceSelection(BUTTON_VALUE[i]);
            return;
         }
      }
      if (source == butAdd) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.ADD, reader()));
      }
      if (source == butMinus) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.MINUS, reader()));
      }
      if (source == butMultiply) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.MULTIPLY,
                                 reader()));
      }
      if (source == butDivide) {
         writer(calc
                   .calculateBi(Calculator.BiOperatorModes.DIVIDE, reader()));
      }
      if (source == butxpowerofy) {
         writer(calc
                   .calculateBi(Calculator.BiOperatorModes.X_POWER_OF_Y,
                                reader()));
      }
      if (source == butSquare) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SQUARE,
                                   reader()));
      }
      if (source == butSquareRoot) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SQUARE_ROOT,
                                   reader()));
      }
      if (source == butOneDevidedBy) {
         writer(calc.calculateMono(
                                   Calculator.MonoOperatorModes.ONE_DEVIDE_BY,
            reader()));
      }
      if (source == butCos) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.COS,
                                   reader()));
      }
      if (source == butSin) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.SIN,
                                   reader()));
      }
      if (source == butTan) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.TAN,
                                   reader()));
      }
      if (source == butlog) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.LOG,
                                   reader()));
      }
      if (source == butrate) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.RATE,
                                   reader()));
      }
      if (source == butabs) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.ABS, reader()));
      }
      if (source == butEqual) {
         writer(calc.calculateEqual(reader()));
      }
      if (source == butCancel) {
         writer(calc.reset());
      }
      if (source == butBinary) {
         parsetoBinary();
      }
      text.selectAll();
   }
   private void parsetoBinary() {
      try {
         text.setText("" + Long.toBinaryString(Long.parseLong(text.getText())));
      } catch (NumberFormatException ex) {
         System.err.println("Error while parse to binary." + ex.toString());
      }
   }
   /**@return number.*/
   public Double reader() {
      Double num;
      String str;
      str = text.getText();
      num = Double.valueOf(str);
      return num;
   }
   /**@param num for taking number.*/
   public void writer(final Double num) {
      if (Double.isNaN(num)) {
         text.setText("");
      } else {
         text.setText(Double.toString(num));
      }
   }
}
