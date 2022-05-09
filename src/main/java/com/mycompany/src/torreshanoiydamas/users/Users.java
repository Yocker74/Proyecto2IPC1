/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.src.torreshanoiydamas.users;

import com.mycompany.src.torreshanoiydamas.Principal;
import com.mycompany.src.torreshanoiydamas.ui.CheckersWindow;
import java.util.ArrayList;


/**
 *
 * @author mdyoc
 */

public class Users{
    private String name;
    private int jJHanoi, jJDamas, jGHanoi, jGDamas, tiempoHanoi, tiempoDamas, jugadasRealizadasHanoi;

    public int getJugadasRealizadasHanoi() {
        return jugadasRealizadasHanoi;
    }

    public void setJugadasRealizadasHanoi(int jugadasRealizadasHanoi) {
        this.jugadasRealizadasHanoi = jugadasRealizadasHanoi;
    }

    public int getjJHanoi() {
        return jJHanoi;
    }

    public void setjJHanoi(int jJHanoi) {
        this.jJHanoi = jJHanoi;
    }

    public int getjJDamas() {
        return jJDamas;
    }

    public void setjJDamas(int jJDamas) {
        this.jJDamas = jJDamas;
    }

    public int getjGHanoi() {
        return jGHanoi;
    }

    public void setjGHanoi(int jGHanoi) {
        this.jGHanoi = jGHanoi;
    }

    public int getjGDamas() {
        return jGDamas;
    }

    public void setjGDamas(int jGDamas) {
        this.jGDamas = jGDamas;
    }

    public int getTiempoHanoi() {
        return tiempoHanoi;
    }

    public void setTiempoHanoi(int tiempoHanoi) {
        this.tiempoHanoi = tiempoHanoi;
    }

    public int getTiempoDamas() {
        return tiempoDamas;
    }

    public void setTiempoDamas(int tiempoDamas) {
        this.tiempoDamas = tiempoDamas;
    }

    public int getPartidasJugadasHanoi() {
        return partidasJugadasHanoi;
    }

    public void setPartidasJugadasHanoi(int partidasJugadasHanoi) {
        this.partidasJugadasHanoi = partidasJugadasHanoi;
    }

    public int getPartidasJugadasCheckers() {
        return partidasJugadasCheckers;
    }

    public void setPartidasJugadasCheckers(int partidasJugadasCheckers) {
        this.partidasJugadasCheckers = partidasJugadasCheckers;
    }

    public int getPartidasGanadasCheckers() {
        return partidasGanadasCheckers;
    }

    public void setPartidasGanadasCheckers(int partidasGanadasCheckers) {
        this.partidasGanadasCheckers = partidasGanadasCheckers;
    }

    public int getJugadasRealizadasDamas() {
        return jugadasRealizadasDamas;
    }

    public void setJugadasRealizadasDamas(int jugadasRealizadasDamas) {
        this.jugadasRealizadasDamas = jugadasRealizadasDamas;
    }

    public int getVictoriamasrapida() {
        return victoriamasrapida;
    }

    public void setVictoriamasrapida(int victoriamasrapida) {
        this.victoriamasrapida = victoriamasrapida;
    }
public ArrayList<Principal> juegosHanoi = new ArrayList<>();
public ArrayList<CheckersWindow> juegodCheckers = new ArrayList<>();
private int partidasJugadasHanoi, partidasJugadasCheckers, partidasGanadasCheckers, jugadasRealizadasDamas, victoriamasrapida;

    public Users(String name) {
        this.name = name;
        this.juegodCheckers= new ArrayList<CheckersWindow>();
        this.juegosHanoi= new ArrayList<Principal>();
        this.jGDamas=0;
        this.jGHanoi=0;
        this.jJDamas=0;
        this.jJHanoi=0;
        this.jugadasRealizadasDamas=0;
        this.tiempoDamas=0;
        this.tiempoHanoi=0;
        this.jugadasRealizadasDamas=0;
        this.jugadasRealizadasHanoi=0;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Principal> getJuegosHanoi() {
        return juegosHanoi;
    }

    public void setJuegosHanoi(ArrayList<Principal> juegosHanoi) {
        this.juegosHanoi = juegosHanoi;
    }
    public void addCheckersgame (CheckersWindow gameOfCheckers){
        this.juegodCheckers.add(gameOfCheckers);
    }

    public ArrayList<CheckersWindow> getJuegodCheckers() {
        return juegodCheckers;
    }

    public void setJuegodCheckers(ArrayList<CheckersWindow> juegodCheckers) {
        this.juegodCheckers = juegodCheckers;
    }


}
