package com.ch.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button vCero, vUno, vDos, vTres, vCuatro, vCinco, vSeis, vSiete, vOcho, vNueve,
            vPunto, vClear, vIgual, vMas, vMenos, vPor, vDividido;

    private TextView vResultado;
    private Integer vNumero1 = 0;
    private Integer vNumero2 = 0;
    private Integer vOperacion;
    private Integer vTipoOperacion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView() {
        vCero = findViewById(R.id.btnCero);
        vUno = findViewById(R.id.btnUno);
        vDos = findViewById(R.id.btnDos);
        vTres = findViewById(R.id.btnTres);
        vCuatro = findViewById(R.id.btnCuatro);
        vCinco = findViewById(R.id.btnCinco);
        vSeis = findViewById(R.id.btnSeis);
        vSiete = findViewById(R.id.btnSiete);
        vOcho = findViewById(R.id.btnOcho);
        vNueve = findViewById(R.id.btnNueve);
        vMas = findViewById(R.id.btnSuma);
        vMenos = findViewById(R.id.btnResta);
        vPor = findViewById(R.id.btnMultiplicacion);
        vDividido = findViewById(R.id.btnDividido);
        vPunto = findViewById(R.id.btnPunto);
        vIgual = findViewById(R.id.btnIgual);
        vClear = findViewById(R.id.btnClear);
        vResultado = findViewById(R.id.txtRespuesta);

        vCero.setOnClickListener(this);
        vUno.setOnClickListener(this);
        vDos.setOnClickListener(this);
        vTres.setOnClickListener(this);
        vCuatro.setOnClickListener(this);
        vCinco.setOnClickListener(this);
        vSeis.setOnClickListener(this);
        vSiete.setOnClickListener(this);
        vOcho.setOnClickListener(this);
        vNueve.setOnClickListener(this);
        vMas.setOnClickListener(this);
        vMenos.setOnClickListener(this);
        vPor.setOnClickListener(this);
        vDividido.setOnClickListener(this);
        vPunto.setOnClickListener(this);
        vIgual.setOnClickListener(this);
        vClear.setOnClickListener(this);
        

    }

    private void indicarNumero(String numero) {
        vResultado.setText(vResultado.getText() + numero);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCero) {
            indicarNumero("0");
        }
        if (v.getId() == R.id.btnUno) {
            indicarNumero("1");
        }
        if (v.getId() == R.id.btnDos) {
            indicarNumero("2");
        }
        if (v.getId() == R.id.btnTres) {
            indicarNumero("3");
        }
        if (v.getId() == R.id.btnCuatro) {
            indicarNumero("4");
        }
        if (v.getId() == R.id.btnCinco) {
            indicarNumero("5");
        }
        if (v.getId() == R.id.btnSeis) {
            indicarNumero("6");
        }
        if (v.getId() == R.id.btnSiete) {
            indicarNumero("7");
        }
        if (v.getId() == R.id.btnOcho) {
            indicarNumero("8");
        }
        if (v.getId() == R.id.btnNueve) {
            indicarNumero("9");
        }
        if (v.getId() == R.id.btnClear) {
            Limpiar();
        }
        if (v.getId() == R.id.btnSuma) {
            operSuma();
        }
        if (v.getId() == R.id.btnResta) {
            operResta();
        }
        if (v.getId() == R.id.btnMultiplicacion) {
            operMultiplicacion();
        }
        if (v.getId() == R.id.btnDividido) {
            operDivision();
        }
        if (v.getId() == R.id.btnIgual) {
            operIgualdad();
        }
    }

    private void operDivision() {
        vNumero1 = (Integer.parseInt(vResultado.getText().toString()));
        vTipoOperacion = 4;
        Limpiar();
    }

    private void operMultiplicacion() {
        vNumero1 = (Integer.parseInt(vResultado.getText().toString()));
        vTipoOperacion = 3;
        Limpiar();
    }

    private void operResta() {
        vNumero1 = (Integer.parseInt(vResultado.getText().toString()));
        vTipoOperacion = 2;
        Limpiar();
    }

    private void operSuma() {
        vNumero1 = (Integer.parseInt(vResultado.getText().toString()));
        vTipoOperacion = 1;
        Limpiar();
    }

    public void operIgualdad() {
        vNumero2 = (Integer.parseInt(vResultado.getText().toString()));
        if (vTipoOperacion.equals(1)) {
            vOperacion = vNumero1 + vNumero2;
        }
        if (vTipoOperacion.equals(2)) {
            vOperacion = vNumero1 - vNumero2;
        }
        if (vTipoOperacion.equals(3)) {
            vOperacion = vNumero1 * vNumero2;
        }
        if (vTipoOperacion.equals(4)) {
            vOperacion = vNumero1 / vNumero2;
        }
        vResultado.setText(vOperacion.toString());
    }

    private void Limpiar() {
        vResultado.setText("");
    }
}