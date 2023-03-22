/*

 */
package eva2_11_figuras_override;


public class EVA2_11_FIGURAS_OVERRIDE {


    public static void main(String[] args) {
     Círculo circulo = new Círculo();
     circulo.setRadio(6);
     System.out.println(circulo);     
     
     Triangulo tri = new Triangulo();
     tri.setAltura(5);
     tri.setBase(4);
     System.out.println(tri);
     
    }
    
}
