import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    private static final int FRAME_WIDTH = 400, FRAME_HEIGHT = 200;
    private static JPanel panel = null;
    private JLabel label = null;
    private double mainNumber = 0;
    private double operationNumber = 0;
    private boolean operation = false;
    private String operationType = "";

    private JButton zero = null;
    private JButton one = null;
    private JButton two = null;
    private JButton three = null;
    private JButton four = null;
    private JButton five = null;
    private JButton six = null;
    private JButton seven = null;
    private JButton eight = null;
    private JButton nine = null;

    private JButton enter = null;
    private JButton clear = null;

    private JButton plus = null;
    private JButton minus = null;
    private JButton times = null;
    private JButton divide = null;
    private JButton exponent = null;

    public Calculator() {
        setup();
    }

    public void setup() {
        panel = new JPanel();
        label = new JLabel("" + mainNumber);
        mainNumber = 0;
        operationNumber = 0;
        panel.setBackground(Color.pink);

        // Initalize buttons
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");

        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("×");
        divide = new JButton("÷");
        exponent = new JButton("^");
        
        enter = new JButton("=");
        clear = new JButton("Clear");
        // Add action listeners
        zero.addActionListener(new ZeroListener());
        one.addActionListener(new OneListener());
        two.addActionListener(new TwoListener());
        three.addActionListener(new ThreeListener());
        four.addActionListener(new FourListener());
        five.addActionListener(new FiveListener());
        six.addActionListener(new SixListener());
        seven.addActionListener(new SevenListener());
        eight.addActionListener(new EightListener());
        nine.addActionListener(new NineListener());

        clear.addActionListener(new ClearListener());
        enter.addActionListener(new EnterListener());

        plus.addActionListener(new PlusListener());
        minus.addActionListener(new MinusListener());
        times.addActionListener(new TimesListener());
        divide.addActionListener(new DivideListener());
        exponent.addActionListener(new ExponentListener());
        panel.add(zero);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);

        panel.add(clear);
        panel.add(enter);

        panel.add(plus);
        panel.add(minus);
        panel.add(times);
        panel.add(divide);
        panel.add(exponent);
        panel.add(label);
    }

    private class ZeroListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(0);

        }
    }

    private class OneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(1);

        }
    }

    private class TwoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(2);

        }
    }

    private class ThreeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(3);

        }
    }

    private class FourListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(4);

        }
    }

    private class FiveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(5);

        }
    }

    private class SixListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(6);

        }
    }

    private class SevenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(7);

        }
    }

    private class EightListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(8);

        }
    }

    private class NineListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            appendNum(9);

        }
    }

    private class ClearListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            mainNumber = 0;
            operationNumber = 0;
            label.setText("" + mainNumber);
            operation = false;
        }
    }

    private class EnterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operationType.equals("+")) {
                mainNumber += operationNumber;
            } else if (operationType.equals("-")) {
                mainNumber -= operationNumber;
            } else if (operationType.equals("*")) {
                mainNumber *= operationNumber;
            } else if (operationType.equals("/")) {
                mainNumber /= operationNumber;
            } else if (operationType.equals("^")) {
                mainNumber =  Math.pow(mainNumber, operationNumber);
            }
            operationNumber = 0;
            label.setText("" + mainNumber);
            operation = false;
        }
    }

    private class PlusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operation == true) {
                if (operationType.equals("+")) {
                    mainNumber += operationNumber;
                } else if (operationType.equals("-")) {
                    mainNumber -= operationNumber;
                } else if (operationType.equals("*")) {
                    mainNumber *= operationNumber;
                } else if (operationType.equals("/")) {
                    mainNumber /= operationNumber;
                } else if (operationType.equals("^")) {
                    mainNumber =  Math.pow(mainNumber, operationNumber);
                }
                operationNumber = 0;
                label.setText("" + mainNumber);
            }
            operation = true;
            operationType = "+";
            label.setText("" + mainNumber + operationType);
        }
    }

    private class MinusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operation == true) {
                if (operationType.equals("+")) {
                    mainNumber += operationNumber;
                } else if (operationType.equals("-")) {
                    mainNumber -= operationNumber;
                } else if (operationType.equals("*")) {
                    mainNumber *= operationNumber;
                } else if (operationType.equals("/")) {
                    mainNumber /= operationNumber;
                } else if (operationType.equals("^")) {
                    mainNumber =  Math.pow(mainNumber, operationNumber);
                }
                operationNumber = 0;
                label.setText("" + mainNumber);
            }
            operation = true;
            operationType = "-";
            label.setText("" + mainNumber + operationType);
        }
    }

    private class TimesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operation == true) {
                if (operationType.equals("+")) {
                    mainNumber += operationNumber;
                } else if (operationType.equals("-")) {
                    mainNumber -= operationNumber;
                } else if (operationType.equals("*")) {
                    mainNumber *= operationNumber;
                } else if (operationType.equals("/")) {
                    mainNumber /= operationNumber;
                } else if (operationType.equals("^")) {
                    mainNumber =  Math.pow(mainNumber, operationNumber);
                }
                operationNumber = 0;
                label.setText("" + mainNumber);
            }
            operation = true;
            operationType = "*";
            label.setText("" + mainNumber + operationType);
        }
    }

    private class DivideListener implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operation == true) {
                if (operationType.equals("+")) {
                    mainNumber += operationNumber;
                } else if (operationType.equals("-")) {
                    mainNumber -= operationNumber;
                } else if (operationType.equals("*")) {
                    mainNumber *= operationNumber;
                } else if (operationType.equals("/")) {
                    mainNumber /= operationNumber;
                } else if (operationType.equals("^")) {
                    mainNumber =  Math.pow(mainNumber, operationNumber);
                }
                operationNumber = 0;
                label.setText("" + mainNumber);
            }
            operation = true;
            operationType = "/";
            label.setText("" + mainNumber + operationType);
        }
    }

    private class ExponentListener implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent event) {
            if (operation == true) {
                if (operationType.equals("+")) {
                    mainNumber += operationNumber;
                } else if (operationType.equals("-")) {
                    mainNumber -= operationNumber;
                } else if (operationType.equals("*")) {
                    mainNumber *= operationNumber;
                } else if (operationType.equals("/")) {
                    mainNumber /= operationNumber;
                } else if (operationType.equals("^")) {
                    mainNumber =  Math.pow(mainNumber, operationNumber);
                }
                operationNumber = 0;
                label.setText("" + mainNumber);
            }
            operation = true;
            operationType = "^";
            label.setText("" + mainNumber + operationType);
        }
    }

    public void appendNum(int num) {
        if (!operation) {
            if (mainNumber == 0) {
                mainNumber = num;
                label.setText("" + mainNumber);
            } else if (mainNumber == (int) mainNumber){
                String temp = "" + (int) mainNumber;
                temp += num;
                mainNumber = Integer.parseInt(temp);
                label.setText("" + mainNumber);
            } else {
                ClearCalc();
                mainNumber = num;
                label.setText("" + mainNumber);
            }
        } else {
            if (operationNumber == 0) {
                operationNumber = num;
                label.setText("" + mainNumber + operationType + operationNumber);
            } else if (operationNumber == (int) operationNumber) {
                String temp = "" + (int) operationNumber;
                temp += num;
                operationNumber = Integer.parseInt(temp);
                label.setText("" + mainNumber + operationType + operationNumber);
            } else {
                ClearCalc();
                mainNumber = num;
                label.setText("" + mainNumber);
            }
        }
    }
    public void ClearCalc() {
        mainNumber = 0;
        operationNumber = 0;
        label.setText("" + mainNumber);
        operation = false;
    }
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.getContentPane().add(panel);
        frame.pack();
    }
}