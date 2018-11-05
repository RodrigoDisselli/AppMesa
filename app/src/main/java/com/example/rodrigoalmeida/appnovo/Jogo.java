package com.example.rodrigoalmeida.appnovo;

import android.content.Intent;
import android.widget.Toast;

import java.util.Random;

public class Jogo {

    Random rand = new Random();
    public String stringCores;
    private int level = 5;
    private int numeroRandom;

    private TelaJogo telaJogo;
    private int click;



    public Jogo (TelaJogo jogo){
        this.telaJogo = jogo;
        //recebe o context da activity Menu nessa não Activity
    }


    public String geraString(){
    //gera string comm as letras random
        stringCores = "";

        for(int i=0; i<= level; i++){

            numeroRandom = rand.nextInt(4);

            switch (numeroRandom) {
                case 0:
                    stringCores += "R";
                    break;
                case 1:
                    stringCores += "B";
                    break;
                case 2:
                    stringCores += "G";
                    break;
                case 3:
                    stringCores += "Y";
                    break;
                default:
            }
        }

        System.out.print("\n\n\n\nnumero gerado: " + stringCores);

        return stringCores;
    }

    public void getCorCode(String code){
        //verifica se o botao clickado eh o correto
        if(click <= stringCores.length() - 1){
            //verifica se o a string toda nao foi percorrida
            System.out.print(" Click:" + click + " | code:" + code);

            if (stringCores.substring(click, (click++)) == code){
                //se o botao eh o correto
                System.out.print(" OK\n");
                //Toast.makeText(this.menuActivity, String.valueOf(color.click + 1), Toast.LENGTH_SHORT).show();
                //mostra menssagem contando o numero de clicks

                if(click == stringCores.length()){
                    //se a string toda ja foi percorrida
                    Toast.makeText(this.telaJogo, "Parabéns", Toast.LENGTH_SHORT).show();
                    //returnToMainActivity();
                    //retorna a pagina inicial
                }

            }else{
                //se o botao clicado eh incorreto
                Toast.makeText(this.telaJogo, ":(", Toast.LENGTH_SHORT).show();
                System.out.print(" ERROR");
                //returnToMainActivity();
                //retorna a pagina inicial
            }

        }else{
            //returnToMainActivity();
            //retorna a pagina inicial
        }


    }

    /*public void returnToMainActivity(){
        //retorna a pagina inicial
        stringCores = "";
        click = 0;
        Intent intent = new Intent(this.telaJogo, MainActivity.class);
        this.telaJogo.startActivity(intent);
    }*/

    //pega os valores que identificam o botao clickado

    public void redBtn(){
        getCorCode("R");
    }

    public void blueBtn(){
        getCorCode("B");
    }

    public void greenBtn(){
    getCorCode("G");
    }

    public void yellowBtn(){
        getCorCode("Y");
    }
}

