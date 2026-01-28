class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head;
    private Ticket tail;

    void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
            return;
        }
        tail.next = newTicket;
        newTicket.next = head;
        tail = newTicket;
    }

    void removeTicket(int ticketId) {
        if (head == null) return;

        if (head.ticketId == ticketId) {
            if (head == tail) {
                head = tail = null;
                return;
            }
            tail.next = head.next;
            head = head.next;
            return;
        }

        Ticket temp = head;
        while (temp.next != head) {
            if (temp.next.ticketId == ticketId) {
                if (temp.next == tail) tail = temp;
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchTicket(String key) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(key) || temp.movieName.equalsIgnoreCase(key)) {
                System.out.println("Found: " + temp.ticketId);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Not Found");
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "zs", "abc", 10, "10:00 AM");
        system.addTicket(2, "cx", "xyz", 15, "10:05 AM");
        system.addTicket(3, "ert", "jk", 18, "10:10 AM");

        system.displayTickets();

        system.searchTicket("Inception");

        system.removeTicket(2);

        system.displayTickets();

        System.out.println(system.countTickets());
    }
}
