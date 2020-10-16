package InterfaceEx1;

public class MonsterFarm {
    
    public static void main (String args[]){
        Monster x [] = new Monster[6];
        for (int i = 0; i < 6; i++) {
            if (i<2)
                x[i] = new Vampire("Monster " + (i+1));
            else if (i<4)
                x[i] = new Zombie("Monster " + (i+1));
            else
                x[i] = new Werewolf("Monster " + (i+1));
        }
        for (int i = 0; i < 6; i++) {
            x[i].identify();
            x[i].attack();
            if(x[i] instanceof Vampire) //only vampires
                //casting to a specific object
                ((Vampire)x[i]).changeToBat();
        }
    }
    
}
