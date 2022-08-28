public class Repository {

    protected Tickets[] tickets = new Tickets[0];


    public void add(Tickets ticket) {
        Tickets[] tmp = new Tickets[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void removeById(int id) {
        Tickets[] tmp = new Tickets[tickets.length - 1];
        int copyToIndex = 0;
        for (Tickets product : tickets) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }

    protected Tickets[] findAll() {
        return tickets;
    }
}
