import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketsTest {

    Repository repo = new Repository();
    Manager manager = new Manager(repo);
    Tickets ticket1 = new Tickets(1, 1299, 95, " Moscow ", " Kazan ", "From Moscow", "To Kazan");
    Tickets ticket2 = new Tickets(7, 2199, 95, " Moscow ", " Kazan ", "From Kazan", "To Moscow");


    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
    }


    @Test

    public void SearchByCity() {

        Tickets[] actual = manager.searchBy("From Moscow", "To Kazan");
        Tickets[] expected = {ticket1, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }


//   @Test

//    public void AllInProduct() {
//
//        Tickets[] actual = manager.findAll();
//        Tickets[] expected = {ticket1, ticket2,};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

    @Test

    public void RemoveId() {

        repo.removeById(ticket1.getId());

        Tickets[] actual = repo.findAll();
        Tickets[] expected = {ticket2};

        assertArrayEquals(expected, actual);
    }
}
