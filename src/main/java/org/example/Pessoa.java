package org.example;

import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Pessoa(String nome) { this.nome = nome; }

    public  String getUltimaNotificacao() {
        return  this.ultimaNotificacao;
    }

    public void adicionar(GrupoDeFIlmes grupo)
    {
        grupo.addObserver(this);
    }

    public void update(Observable grupo, Object argi)
    {
        this.ultimaNotificacao = this.nome + ", notificação de filme novo no " + grupo.toString();
    }
}
