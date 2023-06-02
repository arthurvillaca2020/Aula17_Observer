package org.example;

import java.util.Observable;

public class GrupoDeFIlmes extends Observable {
    private String nomeGrupo;
    private String genero;
    public GrupoDeFIlmes(String nomeGrupo, String genero)
    {
        this.nomeGrupo = nomeGrupo;
        this.genero = genero;
    }

    public void lancarFilme(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Grupo " +
                "{Nome do grupo = " + nomeGrupo + ", " +
                "Genero = " + genero + "}";
    }
}
