public class MovieTicket {
   
    private String movieName;
    private String seatNumber; 
    private double price;      


    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null; 
        this.price = 0.0;
    }


    public void bookTicket(String seat, double cost) {
        this.seatNumber = seat;
        this.price = cost;
        System.out.println("Successfully booked ticket for: " + this.movieName);
    }

   
    public void displayTicketDetails() {
        System.out.println("--- Ticket Details ---");
        System.out.println("Movie: " + this.movieName);
        if (this.seatNumber == null) {
            System.out.println("Status: NOT YET BOOKED");
        } else {
            System.out.println("Seat: " + this.seatNumber);
            System.out.printf("Price: $%.2f\n", this.price);
        }
    }

    
    public static void main(String[] args) {
        
        MovieTicket ticket1 = new MovieTicket("Dune: Part Two");

        
        ticket1.displayTicketDetails();
        System.out.println(); 

        
        ticket1.bookTicket("Row G, Seat 12", 18.50);
        System.out.println(); 

        
        ticket1.displayTicketDetails();
    }
}