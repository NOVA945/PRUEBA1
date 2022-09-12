package laboratorio2;





public class operaciones {
    
    private double numero1;
    private double numero2;

    public operaciones (){}

    public operaciones (double num1, double num2){
       this.numero1 = num1;
       this.numero2 = num2; 
    }

    public void setNumero1(double num1){
       this.numero1 = num1;
    }

    public double getNumero1(){
       return this.numero1;
    }

    public double getNumer2(){
       return this.numero2;
    }

    public void setNumero2(double numero2){
       this.numero2 = numero2;
    }

    public double Suma(){
       return this.numero1 + this.numero2;
    }
    public double resta(){
       return this.numero1 - this.numero2;
    }

    public double Multiplicacion(){
        return this.numero1 * this.numero2;
    }

    public double division(){
        if (this.numero2 != 0)
          return this.numero1 / this.numero2;
        else 
          return 0;
    }
}

