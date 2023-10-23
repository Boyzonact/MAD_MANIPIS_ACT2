package com.project.mad_manipis_activity2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText kel;
    String num = "";
    String op2 = "+";
    boolean op = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kel = findViewById(R.id.editText);  // <- Corrected reference
    }


    public void kelvin(View view) {
        if (op)
            kel.setText("");
        op = false;
        String number = kel.getText().toString();
        int viewId = view.getId(); // Get the view ID once

        if (viewId == R.id .button0) {
            number += "0";
        } else if (viewId == R.id.button9) {
            number += "9";
        } else if (viewId == R.id.button8) {
            number += "8";
        } else if (viewId == R.id.button7) {
            number += "7";
        } else if (viewId == R.id.button6) {
            number += "6";
        } else if (viewId == R.id.button5) {
            number += "5";
        } else if (viewId == R.id.button4) {
            number += "4";
        } else if (viewId == R.id.button3) {
            number += "3";
        } else if (viewId == R.id.button2) {
            number += "2";
        } else if (viewId == R.id.button1) {
            number += "1";
        }else if (viewId == R.id.buttondot) {
            number += ".";
        }


        kel.setText(number);
    }

    public void vinot(View view) {
        op = true;
        num = kel.getText().toString();

        int viewId = view.getId();

        if (viewId == R.id.buttondivide) {
            op2 = "/";
        } else if (viewId == R.id.buttonplus) {
            op2 = "+";
        } else if (viewId == R.id.buttonminus) {
            op2 = "-";
        }else if (viewId == R.id.buttonmultiply) {
            op2 = "*";
        }


    }

    public void Vinskie(View view) {
        String num = kel.getText().toString();
        double result = 0.0;

        switch (op2) {
            case "+":
                result = Double.parseDouble(num) + Double.parseDouble(num);
                break;
            case "/":
                result = Double.parseDouble(num) / Double.parseDouble(num);
                break;
            case "*":
                result = Double.parseDouble(num) * Double.parseDouble(num);
                break;
            case "-":
                result = Double.parseDouble(num) - Double.parseDouble(num);
                break;
        }

        kel.setText(String.valueOf(result));
    }

    public void hanap(View view) {
        kel.setText("0");
        op= true;
    }

    public void percent(View view) {
        double no =Double.parseDouble(kel.getText().toString())/100;
        kel.setText(String.valueOf(no));
        op=true;
    }


    public void sqaure(View view) {
        double input = Double.parseDouble(kel.getText().toString());
        double result = Math.sqrt(input);
        kel.setText(String.valueOf(result));
    }

    public void powerN(View view) {
        double base = Double.parseDouble(kel.getText().toString());


        double exponent = Double.parseDouble(kel.getText().toString());
        double result = Math.pow(base, exponent);
        kel.setText(String.valueOf(result));
    }




    public void Reciprocal(View view) {
        String numberText = kel.getText().toString();

        if (!numberText.isEmpty()) {
            double number = Double.parseDouble(numberText);

            if (number != 0) {
                double reciprocal = 1.0 / number;
                kel.setText(String.valueOf(reciprocal));
            }
        }
    }

    public void exponent(View view) {
        String baseText = kel.getText().toString();

        if (!baseText.isEmpty()) {
            double base = Double.parseDouble(baseText);


            EditText Waragud = findViewById(R.id.editText);
            String Kapoy = Waragud.getText().toString();

            if (!Kapoy.isEmpty()) {
                double exponent = Double.parseDouble(Kapoy);
                double result = Math.pow(base, exponent);
                kel.setText(String.valueOf(result));
            }
        }
    }
    public void erisa(View view) {
        String currentText = kel.getText().toString();

        if (!currentText.isEmpty()) {

            String newText = currentText.substring(0, currentText.length() - 1);
            kel.setText(newText);
        }
    }


}