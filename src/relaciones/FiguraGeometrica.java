/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Estudiante
 */
public abstract class FiguraGeometrica {
    
    private Double area;
    private Double perimetro;
    
    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();
    
}
