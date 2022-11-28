import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Predicate;

public class TicketReservation {

    public static double confirmationNumber = 0;
   public static final int maxListSize = 2;
   public static final int maxQueueSize = 3;
   private  ArrayList<Passenger> confirmedList = new ArrayList<>();
   private Queue<Passenger> waitingList = new LinkedBlockingQueue<>(maxQueueSize);

   public boolean  bookFlight (Passenger passenger) {
       if(confirmedList.size() == maxListSize) {
           boolean added = waitingList.offer(passenger);
           if(added)
                passenger.setConfirmationNumber(confirmationNumber++);
           return added;
       } else {
           passenger.setConfirmationNumber(confirmationNumber++);
           return confirmedList.add(passenger);
       }
   }

   public void printWaitingList() {
       System.out.println("Current waiting list: ");
       System.out.println(waitingList);
   }

   // cancel / remove
   public boolean removePassenger (Double confirmationNumber) {
       Iterator<Passenger> passengerIterator = waitingList.iterator();

       while (passengerIterator.hasNext()) {
           Passenger passenger = passengerIterator.next();
           if(passenger.getConfirmationNumber().equals(confirmationNumber))
                return waitingList.remove(passenger);
       }

       passengerIterator = confirmedList.iterator();
       while (passengerIterator.hasNext()) {
           Passenger passenger = passengerIterator.next();
           if(passenger.getConfirmationNumber().equals(confirmationNumber)) {
               boolean removed =  confirmedList.remove(passenger);
               if (removed &&  !waitingList.isEmpty())
                     confirmedList.add(waitingList.remove());
               return removed;
           }
       }
       return false;
   }


}



