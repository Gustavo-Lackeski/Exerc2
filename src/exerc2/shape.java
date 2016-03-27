
package exerc2;
public class shape {
    private String name;
    shape(String x){
        name = x;
    }
    public String getName(){
        return name;
    }
    
    public static void main(String[] args) {
        Triangle t = new Triangle ("T");
        System.out.println("Area de " + t.getName() + " eh " + t.calcArea());   
        
    }
    
}
class Triangle extends shape{
    int base, altura;    
    Triangle(String x) {
        super(x);
        base = 1;
        altura = 2;
    }
    public float calcArea(){
        return (base*altura)/2;
        
    }
    
    
}