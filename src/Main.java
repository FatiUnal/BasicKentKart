import Entities.Belediye;
import Entities.DolumMerkezi;
import Entities.Otobus;
import Entities.Users.Student;
import Entities.Users.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new Student("fatih","unal","2002");
        Belediye belediye = new Belediye(user1);
        belediye.createCard();

        User user2 = new Student("fatih","unal","2002");
        Belediye belediye2 = new Belediye(user2);
        belediye2.createCard();

        Otobus otobus = new Otobus(user1.getCard());
        otobus.otobuseBin(user1);
        


    }
}
