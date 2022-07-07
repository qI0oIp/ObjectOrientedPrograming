import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Ranger("Marcus"));
        heroList.add(new WitchHunter("Sillius"));
        heroList.add(new Monk("Rumulus"));
        heroList.add(new Knight("Villfred"));
        heroList.add(new Bard("Agnes"));
        heroList.add(new Rogue("Milva"));
        heroList.add(new Academic("Olaf"));

        heroList.forEach(hero -> {
            System.out.println(hero.name);
        });

    }
}
