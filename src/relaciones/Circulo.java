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
public class Circulo extends FiguraGeometrica {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    
    public Double calcularDiametro() {
        return 2 * radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

}
