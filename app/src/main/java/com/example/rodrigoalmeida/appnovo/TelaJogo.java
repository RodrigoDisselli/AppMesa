package com.example.rodrigoalmeida.appnovo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaJogo extends AppCompatActivity {

    Jogo jogo = new Jogo( this );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo);



        Button redBtn;
        Button blueBtn;
        Button greenBtn;
        Button yellowBtn;


            redBtn = (Button) findViewById(R.id.button4);
            blueBtn = (Button) findViewById(R.id.button2);
            greenBtn = (Button) findViewById(R.id.button5);
            yellowBtn = (Button) findViewById(R.id.button6);

            //envia a ação dde click dos botoes do jogo

            redBtn.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick( View v){
                    jogo.redBtn();
                }
            });

            blueBtn.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick( View v){
                    jogo.blueBtn();
                }
            });

            greenBtn.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick( View v){
                    jogo.greenBtn();
                }
            });

            yellowBtn.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick( View v){
                    jogo.yellowBtn();
                }
            });
        }
    }

