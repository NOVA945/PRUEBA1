package laboratorio2;





public class salario {

    
    
 public class salario_neto{}
    private double salarioneto,descuento,salariobruto,horastrabajadas,pagoporhora,neto;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  

    
   public void setHoras(double horas) {
        this.horastrabajadas = horas;
    }
    
    public double getHoras() {
        return horastrabajadas;
    }
     public double getPago(){
       return this.pagoporhora;
    }

    public void setPago(double pago){
       this.pagoporhora = pago;
    }
  public double SalarioBruto(){
        return salariobruto=this.pagoporhora * this.horastrabajadas;
    }
  public double Descuento(){
        return descuento= this.pagoporhora * this.horastrabajadas *0.2;
        
    }
  
     public double NETO(){
        return salarioneto= this.descuento - this.salariobruto;
        
    }
  
  
}
 
  

