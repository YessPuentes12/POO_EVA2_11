/*

 */
package eva2_11_figuras_override;


public class Círculo extends Figura {
 
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//------------------------------------------------------------------------------    
    
  @Override   
    
  public double calcularA(){
  return Math.PI*(radio*radio);
  }  
    
//------------------------------------------------------------------------------    

 @Override

 public double calcularPe(){
 return Math.PI*(radio*2);   
 }
//------------------------------------------------------------------------------  
 
 @Override
 
  public String toString(){
    String cade = "\nDatos del círculo.\n"
            + "Área: "+calcularA()+"\n"
            + "Perímetro: "+calcularPe();
    return cade;
  }
    
    
}
