/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.diagramadeclases;

import java.util.Date;

public class Fecha_Entrga {
    Date fecha;
    Cliente Cliente;
    Ejemplar Ejemplar;
    
    Fecha_Entrga(Date fecha,Cliente Cliente,Ejemplar Ejemplar) {
        this.fecha=fecha;
        this.Cliente=Cliente;
        this.Ejemplar=Ejemplar;
    }
}