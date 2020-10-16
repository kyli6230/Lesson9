package InterfaceEx1;

public class Zombie implements Monster{

    private String name;
    
    public Zombie(String n){
        name = n;
    }
    
    @Override
    public void attack() {
        System.out.println("Zombie is eating your brains!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the zombie.");
    }
    
}
