/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peca;

/**
 *
 * @author Admin
 */
class Torre extends Peca {

    public Torre() {
        super("Torre");
    }

    @Override
    public void mover() {
        System.out.println("A " + nome + " pode mover qualquer número de casas, mas somente na vertical ou horizontal.");
    }
}
