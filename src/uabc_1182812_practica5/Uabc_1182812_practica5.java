/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uabc_1182812_practica5;

import java.util.Scanner;
import uabc_1182812_practica5.Consola.TableroConsola;
import uabc_1182812_practica5.Consola.TecladoConsola;
import uabc_1182812_practica5.Interfaces.ITablero;
import uabc_1182812_practica5.Interfaces.ITeclado;

/**
 *
 * @author domi1holi
 */
public class Uabc_1182812_practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ITablero tablero= (ITablero) new TableroConsola();
        ITeclado teclado =  (ITeclado) new TecladoConsola();
        
        JuegoWordle JW = new JuegoWordle(tablero,teclado);
        JW.iniciar();
    }
}

    
    

