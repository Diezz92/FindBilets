import java.util.Arrays;
import java.util.Comparator;

public class Manager extends Repository {

    protected Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void add(Tickets ticket) {
        repo.add(ticket);
    }

    public void removeById(Tickets ticket) {
        repo.removeById(ticket.getId());
    }

    public Tickets[] findAll(String from, String to) {
        return repo.findAll();
    }

    public Tickets[] searchBy(String from, String to) {
        Tickets[] result = new Tickets[0];
        for (Tickets ticket : repo.findAll()) {
            if (matches(ticket, from, to)) {
                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Tickets ticket, String from, String to) {
        if (ticket.getFrom().equals(from)) {
            if (ticket.getTo().equals(to)) {
                return true;
            }
        }
        return false;
    }
}
