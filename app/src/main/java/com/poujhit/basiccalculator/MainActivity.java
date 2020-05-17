package com.poujhit.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    Button ac,dot,signchange,mod,div,plus,sub,mul,equal,info,seven,eight,one,two,three,four,five,six,nine,zero,clear;
    TextView input;
    String ans="";

    ArrayList <Integer> operatorcheck= new ArrayList<>();
    private int checksign=0;
    private int checkdot=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac = findViewById(R.id.acbutton);
        signchange = findViewById(R.id.buttonp);
        mod = findViewById(R.id.modbutton);
        div =  findViewById(R.id.divbutton);
        plus =  findViewById(R.id.plusbutton);
        sub =  findViewById(R.id.subbutton);
        mul =  findViewById(R.id.mulbutton);
        equal =  findViewById(R.id.equalbutton);
        info= findViewById(R.id.infobutton);
        clear = findViewById(R.id.buttonclear);



        input=  findViewById(R.id.it);
        one= findViewById(R.id.buttonone);
        two=  findViewById(R.id.buttontwo);
        three=  findViewById(R.id.buttonthree);
        four=  findViewById(R.id.buttonfour);
        five=  findViewById(R.id.buttonfive);
        six= findViewById(R.id.buttonsix);
        seven= findViewById(R.id.sevenbutton);
        eight= findViewById(R.id.buttoneight);
        nine=  findViewById(R.id.buttonnine);
        zero= findViewById(R.id.buttonzero);
        dot= findViewById(R.id.dotbutton);


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdot=1;
                checksign=0;
              input.setText("");
                //input.setMovementMethod(new ScrollingMovementMethod());


              ans="";
              operatorcheck.clear();
            }
        });

        signchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();
                else {
                    checkdot = 1;
                    if (input.getText().toString() == "INVALID" || input.getText().toString().isEmpty())
                        input.setText(null);


                    if (checksign == 0) {
                        String s = input.getText().toString();
                        double num = Double.parseDouble(s + "");
                        num *= -1;
                        ans = String.valueOf(num);
                        input.setText(num + "");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }

                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input.getText().toString().isEmpty()) {
                    String s = input.getText().toString();

                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != 'X' && ch != '÷' && ch != '.') {
                        StringBuilder s1 = new StringBuilder();
                        for (int i = 0; i < s.length() - 1; i++) {
                            s1.append(s.charAt(i));
                        }
                        ans = ans.substring(0, s.length() - 1);
                        ans = s1.toString();
                        input.setText(s1.toString());
                    }
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=1;
                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = input.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='X' && ch!='÷' && ch!='.')
                    {
                        operatorcheck.add(s.length()-1);
                        ans+="%";
                        input.setText(input.getText() + "%");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }
                    }

                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = input.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='X' && ch!='÷' && ch!='.') {
                        operatorcheck.add(s.length()-1);
                        ans+="÷";
                        input.setText(input.getText() + "÷");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }
                    }
                }

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = input.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='X' && ch!='÷' && ch!='.') {
                        operatorcheck.add(s.length()-1);
                        ans+="+";
                        input.setText(input.getText() + "+");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }

                    }
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = input.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='X' && ch!='÷' && ch!='.') {
                        operatorcheck.add(s.length()-1);
                        ans+="-";
                        input.setText(input.getText() + "-");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }

                    }
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = input.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='X' && ch!='÷' && ch!='.') {
                        operatorcheck.add(s.length()-1);
                        ans+="X";
                        input.setText(input.getText() + "X");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }

                    }

                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksign=1;
                checkdot=0;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(!input.getText().toString().isEmpty())
                {
                    String s = ans;
                    char ch = s.charAt(s.length() - 1);
                    if (ch == '+' || ch == '-' || ch == '%' || ch == 'X' || ch == '÷' || ch=='.')
                    {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
                        input.setText("INVALID");
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }
                    }
                    else
                    {
                        operatorcheck.add(s.length()-1);
                        s+= "=";

                        double num1=Double.parseDouble(s.substring(0,operatorcheck.get(0)+1));

                        for(int i=0;i<operatorcheck.size()-1;i++)
                        {
                            double num2 = Double.parseDouble(s.substring(operatorcheck.get(i)+2,operatorcheck.get(i+1)+1));
                            if(s.charAt(operatorcheck.get(i)+1)=='+')
                            {
                                num1+=num2;
                            }
                            else if(s.charAt(operatorcheck.get(i)+1)=='-')
                            {
                                num1-=num2;
                            }
                            else if(s.charAt(operatorcheck.get(i)+1)=='÷')
                            {
                                num1/=num2;
                            }
                            else if(s.charAt(operatorcheck.get(i)+1)=='X')
                            {
                                num1*=num2;
                            }
                            else if(s.charAt(operatorcheck.get(i)+1)=='%')
                            {
                                num1%=num2;
                            }
                        }

                        String answer = String.valueOf(num1);
                        operatorcheck.clear();
                        input.setText(answer);
                        input.setMovementMethod(new ScrollingMovementMethod());
                        while (input.canScrollVertically(1)) {
                            input.scrollBy(0, 10);
                        }
                        ans=answer;
                    }

                }

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdot=1;
                if(input.getText().toString().equals("INVALID"))
                    input.setText(null);

                ans+="1";
                input.setText(input.getText()+ "1");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="2";
                input.setText(input.getText()+ "2");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdot=1;
                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="3";
                input.setText(input.getText()+ "3");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;
                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="4";
                input.setText(input.getText() + "4");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="5";
                input.setText(input.getText() + "5");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="6";
                input.setText(input.getText() + "6");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="7";

                input.setText(input.getText() + "7");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;
                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="8";
                input.setText(input.getText() + "8");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }

            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="9";

                input.setText(input.getText() + "9");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkdot=1;

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                ans+="0";
                input.setText(input.getText() + "0");
                input.setMovementMethod(new ScrollingMovementMethod());
                while (input.canScrollVertically(1)) {
                    input.scrollBy(0, 10);
                }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(input.getText().toString()=="INVALID")
                    input.setText(null);

                if(checkdot==1) {


                    if (!input.getText().toString().isEmpty()) {
                        String s = input.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '÷' && ch != '.') {
                            ans += ".";
                            input.setText(input.getText() + ".");
                            input.setMovementMethod(new ScrollingMovementMethod());
                            while (input.canScrollVertically(1)) {
                                input.scrollBy(0, 10);
                            }
                        }

                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"INVALID",Toast.LENGTH_SHORT).show();
                }
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),infoScreen.class);
                startActivity(i);
            }
        });



    }


}

