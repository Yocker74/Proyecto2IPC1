/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.src.torreshanoiydamas;
        
/**
 *
 * @author mdyoc
 */
public class Pila {
    private int counterNodes=0;
    private Node header;

    public int getCounterNodes() {
        return counterNodes;
    }

    public void setCounterNodes(int counterNodes) {
        this.counterNodes = counterNodes;
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }
    public void push(Node node){
        counterNodes++;
        if(header==null){
            header=node;
        }else{
            node.setDown(header);
            header.setUp(node);
            header=node;
        }
    }
    public void pop(){
        if(counterNodes>0){
            counterNodes--;
            header= header.getDown();
            
        }
    }
    public String peek(){
        return header.getData();
    }
}
