public class Menu {
    private static int buyTicketOpt = 1;
    private static int queueCheckOpt = 2;
    private static int backToMainMenuOpt = 3;

    private int userSelect;

    private boolean isMenuRunning = false;

    private  final TicketReservation tkt = new TicketReservation();

   public void start() {
       isMenuRunning = true;
       while (this.userSelect != 3) {
           this.userSelect = IO.getUserSelect("""
                   Press  [ 1 ]   Buy Ticket Now
                   Press  [ 2 ]   Check The Waiting List
                   Press  [ 3 ]   Exit""");
           selection();
       }
   }
   public void selection() {
       if (userSelect == buyTicketOpt) {
           Passenger passenger = new Passenger();
           boolean booked =  tkt.bookFlight(passenger);
           System.out.println(booked ? "Successfully booked flight" : "Flight could not be booked");
       } else if (userSelect == queueCheckOpt) {
           tkt.printWaitingList();
       } else if (userSelect == backToMainMenuOpt) {
           isMenuRunning = false;
           System.out.println("i hope you die soon in a  car accident or cancer");
       }
   }

}
