/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.awt.Color;
import java.util.Iterator;

/**
 *
 * @author thicc
 */
public class FichaBarra extends Ficha {

    Iterator<Cadrado> it = cadrados.iterator();

    public FichaBarra() {
        Cadrado c1 = new Cadrado(120,0, Color.YELLOW);
        Cadrado c2 = new Cadrado(120,30, Color.YELLOW);
        Cadrado c3 = new Cadrado(150,30, Color.YELLOW);
        Cadrado c4 = new Cadrado(150,0, Color.YELLOW);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);
        cadrados.add(c4);
        }
    }



@Override
public boolean rotarFicha() {

    }
}
