class Car{
    public void fueltype(){
        System.out.println("Enter fueltype");
    }
}
class Dieselcar extends Car{
    public void fuelTypeis() {
        System.out.println("Diesel fuel type");
    }
}

class ElectricCar extends  Car{
    public void  fuelTypeWas(){
        System.out.println("Li-ion battery");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dieselcar dc=new Dieselcar();
        dc.fuelTypeis();
        dc.fueltype();
        ElectricCar ec=new ElectricCar();
        ec.fuelTypeWas();
        ec.fueltype();
    }
}
