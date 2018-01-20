package com.kelly.calculadora10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText tela;
    private TextView telinha;
    float num1 = 0;
    String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tela = (EditText) findViewById(R.id.editText_tela);
        telinha = (TextView) findViewById(R.id.textView);

        Button b0 = (Button) findViewById(R.id.button_0);
        Button b1 = (Button) findViewById(R.id.button_1);
        Button b2 = (Button) findViewById(R.id.button_2);
        Button b3 = (Button) findViewById(R.id.button_3);
        Button b4 = (Button) findViewById(R.id.button_4);
        Button b5 = (Button) findViewById(R.id.button_5);
        Button b6 = (Button) findViewById(R.id.button_6);
        Button b7 = (Button) findViewById(R.id.button_7);
        Button b8 = (Button) findViewById(R.id.button_8);
        Button b9 = (Button) findViewById(R.id.button_9);


        Button del = (Button) findViewById(R.id.button_del);
        Button ce = (Button) findViewById(R.id.button_ce);

        Button posnge = (Button) findViewById(R.id.button_posneg);
        Button comma = (Button) findViewById(R.id.button_comma);
        Button resul = (Button) findViewById(R.id.button_equal);

        Button sum = (Button) findViewById(R.id.button_plus);
        Button minus = (Button) findViewById(R.id.button_minus);
        Button mult = (Button) findViewById(R.id.button_mult);
        Button div = (Button) findViewById(R.id.button_div);
        Button raiz = (Button) findViewById(R.id.button_raiz);
        Button potencia = (Button) findViewById(R.id.button_quadrado);
        Button porcent = (Button) findViewById(R.id.button_porcent);
        Button sobrex = (Button) findViewById(R.id.button_porx);


        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        del.setOnClickListener(this);
        ce.setOnClickListener(this);

        posnge.setOnClickListener(this);
        comma.setOnClickListener(this);
        resul.setOnClickListener(this);

        sum.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        raiz.setOnClickListener(this);
        potencia.setOnClickListener(this);
        porcent.setOnClickListener(this);
        sobrex.setOnClickListener(this);

        tela.setText("");
        telinha.setText("");
    }

    @Override


    public void onClick(View view) {

        Button btn = (Button) view;
        String txt = btn.getText().toString();
        EditText tela = (EditText) findViewById(R.id.editText_tela);
        String txttela = tela.getText().toString();


        switch (view.getId()) {

            case R.id.button_0:
                tela.setText(txttela + txt);
                break;
            case R.id.button_1:
                tela.setText(txttela + txt);
                break;
            case R.id.button_2:
                tela.setText(txttela + txt);
                break;
            case R.id.button_3:
                tela.setText(txttela + txt);
                break;
            case R.id.button_4:
                tela.setText(txttela + txt);
                break;
            case R.id.button_5:
                tela.setText(txttela + txt);
                break;
            case R.id.button_6:
                tela.setText(txttela + txt);
                break;
            case R.id.button_7:
                tela.setText(txttela + txt);
                break;
            case R.id.button_8:
                tela.setText(txttela + txt);
                break;
            case R.id.button_9:
                tela.setText(txttela + txt);
                break;
            case R.id.button_comma:

                if (!(txttela.equals(""))) {

                    tela.setText(txttela + txt);
                }else{
                    tela.setText("0" + txt);

                }


                break;
            case R.id.button_ce:
                tela.setText("");
                telinha.setText("");
                break;
            case R.id.button_del:
                if (!(txttela.equals(""))) {

                    int ind = txttela.length() - 1;
                    tela.setText(txttela.substring(0, ind));

                }
                break;
            case R.id.button_plus:
                calculo(txt);
                break;
            case R.id.button_minus:
                calculo(txt);
                break;
            case R.id.button_mult:
                calculo(txt);
                break;
            case R.id.button_div:
                calculo(txt);
                break;
            case R.id.button_equal:
                if (!(tela.getText().toString().equals(""))) {
                    resul();
                }

                break;
            case R.id.button_quadrado:

                if (tela.getText().toString().equals("")) {

                    tela.setText("0");

                }

                num1 = Float.parseFloat(tela.getText().toString());
                float result = (float) Math.pow(num1, 2);
                telinha.setText("sqr(" + num1 + ")");
                tela.setText(String.valueOf(result));
                break;
            case R.id.button_raiz:

                if (tela.getText().toString().equals("")) {

                    tela.setText("0");

                }

                num1 = Float.parseFloat(tela.getText().toString());
                float result2 = (float) Math.sqrt(num1);
                telinha.setText("Raiz(" + num1 + ")");
                tela.setText(String.valueOf(result2));
                break;
            case R.id.button_porx:

                if (tela.getText().toString().equals("")) {

                    tela.setText("0");

                }

                num1 = Float.parseFloat(tela.getText().toString());
                float result3 = 1 / num1;
                telinha.setText("1/(" + num1 + ")");
                tela.setText(String.valueOf(result3));

                if (num1 == 0) {

                    tela.setText("error");
                    Toast.makeText(getApplicationContext(), "Não é possível dividir por zero", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.button_porcent:
                Toast.makeText(getApplicationContext(), "Essa funcionalidade ainda não foi implementada", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_posneg:
                Toast.makeText(getApplicationContext(), "Essa funcionalidade ainda não foi implementada", Toast.LENGTH_SHORT).show();
                break;


        }


    }

    public void calculo(String tipoOperacao) {


        if (tela.getText().toString().equals("")) {

            tela.setText("0");

        }

        num1 = Float.parseFloat(tela.getText().toString());
        operacao = tipoOperacao;
        tela.setText("");
        telinha.setText(num1 + operacao);

    }

    public void resul() {

        float num2 = Float.parseFloat((tela.getText().toString()));
        float result = 0;


        if (operacao.equals("+")) {
            result = num2 + num1;
        }
        if (operacao.equals("-")) {
            result = num1 - num2;
        }
        if (operacao.equals("*")) {
            result = num1 * num2;
        }
        if (operacao.equals("/")) {
            result = num1 / num2;
        }


        telinha.setText("");
        tela.setText(String.valueOf(result));


    }
}



