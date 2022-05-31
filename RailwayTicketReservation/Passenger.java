package RailwayTicketReservation;

public class Passenger {

    static int id=1;
    String name;
    int age;
    String gender;
    String berthPreference;
    int passengerId;

    public void PassengerDetail (String name,int age,String gender,String berthPreference){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.berthPreference=berthPreference;
        passengerId=id++;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", berthPreference='" + berthPreference + '\'' +
                ", passengerId=" + passengerId +
                '}';
    }
}
