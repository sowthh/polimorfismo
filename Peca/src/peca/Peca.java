/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peca;

/**
 *
 * @author Admin
 */
abstract class Peca {
    protected String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public abstract void mover();
}
