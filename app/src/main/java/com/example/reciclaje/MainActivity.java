package com.example.reciclaje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Peso> pesos;
    private RecyclerView listaPesos;
    private PesoAdaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPesos = (RecyclerView) findViewById(R.id.rvLista);
        LinearLayoutManager lim = new LinearLayoutManager(this);
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        listaPesos.setLayoutManager(lim);
        data();
        inicializaAdaptador();
    }

    public void data(){
        pesos = new ArrayList<>();
        pesos.add(new Peso("01/01/2022", "78"));
        pesos.add(new Peso("02/01/2022", "79"));
        pesos.add(new Peso("03/01/2022", "77"));
        pesos.add(new Peso("04/01/2022", "76"));
        pesos.add(new Peso("05/01/2022", "75"));
        pesos.add(new Peso("06/01/2022", "76"));
        pesos.add(new Peso("07/01/2022", "76"));
        pesos.add(new Peso("08/01/2022", "78"));
        pesos.add(new Peso("09/01/2022", "79"));
        pesos.add(new Peso("10/01/2022", "77"));
        pesos.add(new Peso("11/01/2022", "76"));
        pesos.add(new Peso("12/01/2022", "75"));
        pesos.add(new Peso("13/01/2022", "76"));
        pesos.add(new Peso("14/01/2022", "76"));
    }

    public void inicializaAdaptador(){
        adaptador = new PesoAdaptador(pesos);
        listaPesos.setAdapter(adaptador);
    }


}