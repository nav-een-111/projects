package RailwayTicketReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Booking {

    List<Passenger> list = new ArrayList<>();
    HashMap<Integer,Passenger> map = new HashMap<>();
  //  Passenger p = new Passenger();

    public void  BookTicket(Passenger p){
     list.add(p);
        map.put(p.passengerId ,p);
        System.out.println(p );
        System.out.println(" ");
    }
    public  void BookedTickets(){
        System.out.println(map );
    }
    public void CancelTicket(int passengerId){
        map.remove(passengerId);
    }


}
