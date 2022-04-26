/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.src.torreshanoiydamas;

/**
 *
 * @author mdyoc
 */
public class Node {
    private String data;
    private Node up;
    private Node down;

    public void setData(String data) {
        this.data = data;
    }

    public void setUp(Node up) {
        this.up = up;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public String getData() {
        return data;
    }

    public Node getUp() {
        return up;
    }

    public Node getDown() {
        return down;
    }
    
}
