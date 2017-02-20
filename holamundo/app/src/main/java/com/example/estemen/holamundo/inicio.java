package com.example.estemen.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void newActivity(View view) {

        TextView tv = (TextView) findViewById(R.id.pantalla);
        numero2 = Double.parseDouble(tv.getText().toString());
        if(operador.equals("+"))
        {
            resultado = numero1 + numero2;
        }
        else if(operador.equals("-"))
        {
            resultado = numero1 - numero2;
        }
        else if(operador.equals("*"))
        {
            resultado = numero1 * numero2;
        }
        else if(operador.equals("/"))
        {
            resultado = numero1 / numero2;
        }
        tv.setText(resultado.toString());

        Intent intento = new Intent(this,in2.class);
        intento.putExtra("resul", resultado );
        startActivity(intento);

    }

    Double numero1, numero2, resultado;
    String operador;

    public void onClickOperacionCap(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void onClickButtonigual(View miView)
    {

    }

    public void onClickButton1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText() + "1");
    }

    public void onClickButton2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"2");
    }

    public void onClickButton3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"3");
    }

    public void onClickButton4(View miView) {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"4");
    }
    public void onClickButton5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"5");
    } public void onClickButton6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"6");
    } public void onClickButton7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"7");
    }

    public void onClickButton18(View miView) {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"8");
    }
    public void onClickButton9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"9");
    }
    public void onClickButton14(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.pantalla);
        tv.setText(tv.getText()+"0");
    }
    public void onClickButtonmas(View miView)
    {
        operador="+";
        onClickOperacionCap(miView);

    } public void onClickButtonmenos(View miView)
    {
        operador = "-";
        onClickOperacionCap(miView);
    } public void onClickButtonpor(View miView)
    {
        operador = "*";
        onClickOperacionCap(miView);
    }
    public void onClickButtondividir(View miView)
    {
        operador = "/";
        onClickOperacionCap(miView);

    }




}
