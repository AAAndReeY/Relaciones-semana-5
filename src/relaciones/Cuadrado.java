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
public class Cuadrado extends FiguraGeometrica{
    
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    
    
    public Double calcularElPerimetroCirculo(){
        return lado* Math.PI;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro() {
       return lado *4;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
        
}
