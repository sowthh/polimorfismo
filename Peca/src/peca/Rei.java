/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peca;

/**
 *
 * @author Admin
 */
class Rei extends Peca {

    public Rei() {
        super("Rei");
    }

    @Override
    public void mover() {
        System.out.println("O " + nome + " pode mover uma casa em qualquer direção.");
    }
}
