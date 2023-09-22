package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyFarm {
    public static void main(String[] args) {
        List<FarmAnimal> theFarm = new ArrayList<FarmAnimal>(); //creates array list for FarmAnimal objects called theFarm
        //creates specific animals
        theFarm.add(new Duck("Donald","male",3.2,5,"Quack Quack"));
        theFarm.add(new Duck("Cheese","female",3.6,5,"Quack Quack"));
        theFarm.add(new Cow("Molly","female",1600.0,3,"Moo Moo"));
        theFarm.add(new Chicken("Albert","male",1.6,2,"Cock-a-Doodle-doo"));
        theFarm.add(new Chicken("Amelia","female",1.8,4,"Cluck Cluck"));
        theFarm.add(new Chicken("Dixie","female",1.7,4,"Cluck Cluck"));

        for(FarmAnimal animal : theFarm)
            System.out.println(animal);

        for(FarmAnimal animal : theFarm)
            System.out.println(animal.feedLoadingSchedule());
    }
}
