/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peca;

/**
 *
 * @author Admin
 */
public class JogoDeXadrez {
    public static void main(String[] args) {
        Peca rei = new Rei();
        Peca rainha = new Rainha();
        Peca torre = new Torre();

        rei.mover();
        rainha.mover();
        torre.mover();
    }
}
