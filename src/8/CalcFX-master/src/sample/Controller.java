package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;

public class Controller {

    public TextField input;
    public boolean isFloat = false;
    public double left, right;
    public String o = " ";

    public void operation(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        o = button.getText();
       if (isNumeric(input.getText())) {
            left = Double.parseDouble(input.getText());
       }
        input.setText(button.getText());
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void digit(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        if (input.getText().startsWith("0") && !input.getText().startsWith("0.")) {
            input.setText("");
        }

        if (input.getText().startsWith(o)) {
            input.setText("");
        }

        input.setText(input.getText() + button.getText());
    }

    public void equals(ActionEvent actionEvent) {
        if (input.getText().isEmpty()) {
            input.setText(String.valueOf(left));
        } else {
            if (isNumeric(input.getText())) {
                right = Double.parseDouble(input.getText());
                switch (o) {
                    case "+":
                        if (isFloat) {
                            input.setText(String.valueOf(left + right));
                        } else {
                            input.setText(String.valueOf((int) left + (int) right));
                        }
                        break;
                    case "-":
                        if (isFloat) {
                            input.setText(String.valueOf(left - right));
                        } else {
                            input.setText(String.valueOf((int) left - (int) right));
                        }
                        break;
                    case "*":
                        if (isFloat) {
                            input.setText(String.valueOf(left * right));
                        } else {
                            input.setText(String.valueOf((int) left * (int) right));
                        }
                        break;
                    case "/":
                        if (String.valueOf(left / right).length() > 14) {
                            input.setText(String.valueOf(left / right).substring(0, 14));
                        } else {
                            input.setText(String.valueOf(left / right));
                        }
                        break;
                    case "%":
                        if (isFloat) {
                            input.setText("Error, float type");
                        } else {
                            if (right == 0){
                                input.setText("Infinity");
                            } else {
                                input.setText(String.valueOf((int) left % (int) right));
                            }
                        }
                        break;
                }
            }
        }
    }

    public void div(ActionEvent actionEvent) {
        if (!input.getText().contains(".")) {
            if (input.getText().isEmpty()){
                input.setText("0");
            }
            Button button = (Button) actionEvent.getSource();
            input.setText(input.getText() + button.getText());
            isFloat = true;
        }
    }

    public void backspace(ActionEvent actionEvent) {
        if (input.getText().length() != 0) {
            if (input.getText().length() == 1){
                Button button = (Button) actionEvent.getSource();
                input.setText("0");
            } else {
                Button button = (Button) actionEvent.getSource();
                input.setText(input.getText().substring(0, input.getText().length() - 1));
            }
        }
    }

    public void clean(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        left = 0;
        right = 0;
        o = " ";
        input.setText("0");
    }
}
