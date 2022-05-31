package RailwayTicketReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //   Passenger p = new Passenger();
        Booking b = new Booking();

        while (true) {
            System.out.println("------------welcome to railway ticket booking--------------- ");
            System.out.println("1.book tickets ");
            System.out.println("2.cancel tickets ");
            System.out.println("3.show booked tickets ");
            System.out.println("4.exit " + '\n' );

            Scanner scan = new Scanner(System.in);
            System.out.println(" enter a number from (1-5) : " + '\n' );
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println('\n' + "ticket booking....   " + '\n');
                    System.out.println("enter name , age ,gender ,berthPreference (U or M or L)  :  ");
                    String name=scan.next();
                    int age=scan.nextInt();
                    String gender = scan.next();
                    String berthPreference = scan.next();
                    Passenger p = new Passenger();
                    p.PassengerDetail(name ,age ,gender ,berthPreference);

                    b.BookTicket(p);


                    break;

                case 2:
                    System.out.println('\n'+ "ticket cancelling....  ");
                    System.out.println("enter the passenger id to cancel it : ");
                    int id = scan.nextInt();
                    b.CancelTicket(id);
                    System.out.println("ticket cancelled successfully.......");
                    break;



                case 3:
                    System.out.println('\n'+ "booked tickets details are....  ");
                    b.BookedTickets();

                    break;

                case 4:
                    System.out.println('\n'+ "exit...................");
                     System.exit(0);

                    break;

                default:
                    System.out.println(" please enter a valid number...... ");
                    break;

                    
            }
        }
    }
}