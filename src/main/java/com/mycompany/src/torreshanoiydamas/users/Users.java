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
public ArrayList<Principal> juegosHanoi = new ArrayList<>();
public ArrayList<CheckersWindow> juegodCheckers = new ArrayList<>();
private int partidasJugadasHanoi, partidasJugadasCheckers, partidasGanadasCheckers, jugadasRealizadasDamas, victoriamasrapida;

    public Users(String name) {
        this.name = name;
        this.juegodCheckers= new ArrayList<CheckersWindow>();
        this.juegosHanoi= new ArrayList<Principal>();
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

    public ArrayList<CheckersWindow> getJuegodCheckers() {
        return juegodCheckers;
    }

    public void setJuegodCheckers(ArrayList<CheckersWindow> juegodCheckers) {
        this.juegodCheckers = juegodCheckers;
    }


}
