package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class ThingsThatFly {
    public static void main(String[] args) {
        List<Flight> flyingList = new ArrayList<>();
        flyingList.add(new Airplane("Boeing 747",2016));
        flyingList.add(new Bird("Eagle"));
        flyingList.add(new Bird("HummingBird"));

        for(Flight flyingThing : flyingList) {
            System.out.print(flyingThing);
            flyingThing.fly();
        }
    }
}
