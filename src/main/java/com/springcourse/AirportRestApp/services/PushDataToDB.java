package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.controllers.AllServices;
import com.springcourse.AirportRestApp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Transactional
@Service
public class PushDataToDB {

    public String execute() {

        /*
        List<Airline> airlines = new ArrayList<>();
        airlines.add(create("American Airlines", "American Airlines Group", "6655 5425 6672 5456 89"));
        airlines.add(create("American Eagle Airlines", "AMR Corporation", "6655 4824 5334 3359 45"));


        List<Airport> airports = new ArrayList<>();
        airports.add(create("Idaho Falls Regional Airport", "Idaho Falls", 2));
        airports.add(create("Hartsfield-Jackson Atlanta International Airport", "Atlanta, Georgia, USA", 5));
        airports.add(create("Chicago O'Hare International Airport", "O'Hare, Chicago, Illinois, USA", 1));
        airports.add(create("Denver International Airport", "Northeast Denver, Colorado, USA", 6));
        airports.add(create("San Francisco International Airport", "San Mateo County, California, USA", 4));


        List<Client> clients = new ArrayList<>();
        clients.add(create("John Constantine", "John@gmail.com"));
        clients.add(create("LeBron James", "LeBron@gmail.com"));
        clients.add(create("Kareem Abdul-Jabbar", "Kareem@gmail.com"));
        clients.add(create("Karl Malone", "Karl@gmail.com"));
        clients.add(create("Kobe Bryant", "Kobe@gmail.com"));
        clients.add(create("Michael Jordan", "Michael@gmail.com"));
        clients.add(create("Dirk Nowitzki", "Dirk@gmail.com"));
        clients.add(create("Wilt Chamberlain", "Wilt@gmail.com"));
        clients.add(create("Kevin Durant", "Kevin@gmail.com"));


        List<ClientDetails> clientDetails = new ArrayList<>();
        clientDetails.add(create(1520F, CharClass.BUSINESS, "4564 9885 5456 7865 60", true));
        clientDetails.add(create(100F, CharClass.BUSINESS, "4564 9812 5426 4578 45", true));
        clientDetails.add(create(110F, CharClass.BUSINESS, "4564 9812 5426 4578 45", true));
        clientDetails.add(create(2520F, CharClass.BUSINESS, "4564 9252 5256 4875 21", true));
        clientDetails.add(create(1020F, CharClass.BUSINESS, "4564 9825 5456 4587 32", true));
        clientDetails.add(create(4520F, CharClass.BUSINESS, "4564 1812 4256 4565 33", true));
        clientDetails.add(create(140F, CharClass.BUSINESS, "4564 9252 5442 7865 44", true));
        clientDetails.add(create(140F, CharClass.BUSINESS, "4564 2512 5426 4578 78", true));
        clientDetails.add(create(11F, CharClass.BUSINESS, "4564 9825 5442 4785 65", true));


        List<Phone> phones = new ArrayList<>();
        phones.add(create("10-256-892-35-65"));
        phones.add(create("10-256-822-65-65"));
        phones.add(create("10-256-811-35-45"));
        phones.add(create("10-256-216-62-65"));
        phones.add(create("10-256-564-85-25"));
        phones.add(create("10-256-814-45-62"));
        phones.add(create("10-256-841-63-62"));
        phones.add(create("10-256-824-77-25"));
        phones.add(create("10-256-896-87-45"));
        phones.add(create("10-256-842-69-68"));
        phones.add(create("10-256-596-65-77"));


        List<Plane> planes = new ArrayList<>();
        planes.add(create(16, 0, 153, 0, 5, 52.5
                , "737-900ER", 823, 29660));
        planes.add(create(16, 0, 135, 0, 5, 48.5
                , "737-800", 823, 25600));
        planes.add(create(0, 0, 149, 0, 6, 33.0
                , "737-700", 925, 22660));



        List<Seat> seats737_900ER = create(153,0,16,0);
        List<Seat> seats737_800 = create(135,0,16,0);
        List<Seat> seats737_700 = create(149,0,0,0);

        for (int i=0; i<3; i++)
            Optional<Plane> plane = allRepository.plane.findById((long)i);
        plane.setSeats(seats737_900ER.stream().collect(Collectors.toSet()));
        for (int i=3; i<7; i++)
            planes.get(i).setSeats(seats737_800.stream().collect(Collectors.toSet()));
        for (int i=7; i<11; i++)
            planes.get(i).setSeats(seats737_700.stream().collect(Collectors.toSet()));

        List<Flight> flights = new ArrayList<>();
        flights.add(create(3,50));
        flights.add(create(5,20));
        flights.add(create(2,15));


        List<Ticket> tickets = new ArrayList<>();
        for (int i=0; i<9; i++)
            tickets.add(create());

        Set<Plane> planeSet = new
        airlines.get(0).setPlanes());

        services.airline.saveAll(airlines);
        services.airport.saveAll(airports);
        services.client.saveAll(clients);
        services.clientDetails.saveAll(clientDetails);
        services.phone.saveAll(phones);
        services.plane.saveAll(planes);
        services.seat.saveAll(seats.get(0));
        services.seat.saveAll(seats.get(1));
        services.seat.saveAll(seats.get(2));
        services.flight.saveAll(flights);
        services.ticket.saveAll(tickets);

*/
        return "";
    }





    private Airline create(String nameCompany, String owner, String paymentAccount){
        return Airline.builder().nameCompany(nameCompany).owner(owner).paymentAccount(paymentAccount).build();
    }

    private Airport create(String name, String address, int runways){
        return Airport.builder().name(name).address(address).runways(runways).build();
    }

    private Client create(String name, String email){
        return Client.builder().name(name).email(email).build();
    }

    private ClientDetails create(Float allFlightTime, CharClass charClass, String paymentAccount, Boolean privateClient){
        return ClientDetails.builder().allFlightTime(allFlightTime).charClass(charClass).paymentAccount(paymentAccount).privateClient(privateClient).build();
    }

    private Phone create(String phoneNumber){
        return Phone.builder().phoneNumber(phoneNumber).build();
    }

    private Plane create(int chairBusiness, int chairComfort, int chairEconomy, int chairFirst, int crew
            , double maxBaggage, String planeModel, int speed, int tank){
        return Plane.builder().chairBusiness(chairBusiness).chairComfort(chairComfort).chairEconomy(chairEconomy)
                .chairFirst(chairFirst).crew(crew).maxBaggage(maxBaggage).planeModel(planeModel).speed(speed).boardNumber(tank).build();
    }

    private List<Seat> create(int economy, int comfort, int business, int first) {
        List<Seat> seats = new ArrayList<>();
        seats.addAll(fillingSeatsClass(CharClass.ECONOMY,economy));
        seats.addAll(fillingSeatsClass(CharClass.COMFORT,comfort));
        seats.addAll(fillingSeatsClass(CharClass.BUSINESS,business));
        seats.addAll(fillingSeatsClass(CharClass.FIRST, first));
        return seats;
    }

    private List<Seat> fillingSeatsClass(CharClass charClass, int quantity) {
        List<Seat> seats = new ArrayList<>();
        Seat seat;
        for (int i = 1; i <= quantity; i++) {
            seat = Seat.builder().charClass(charClass).charRow(i).build();
            switch (i % 4) {
                case 0:
                    seat.setCharSymbol(Seat.CharSymbol.A);
                case 1:
                    seat.setCharSymbol(Seat.CharSymbol.B);
                case 2:
                    seat.setCharSymbol(Seat.CharSymbol.C);
                case 3:
                    seat.setCharSymbol(Seat.CharSymbol.D);
            }
            seats.add(seat);
        }
        return seats;
    }

    /**String hhmmss = "10:20:30";*/
    private Calendar formatStringToCalendar(String hhmmss) {
        String[] parts = hhmmss.split(":");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(parts[2]));
        return cal;
    }

    private Flight create(int flightHours, int flightMinutes) {

        Calendar calendar = Calendar.getInstance(); //текущее значение времени и даты
        Random random = new Random();

        Calendar departureCal = getNewDataCalendar(calendar, random.nextInt(5)
                , random.nextInt(24), random.nextInt(60));

        Calendar arriveCal = getNewDataCalendar(departureCal,0,flightHours,flightMinutes);

        Date departure = new Date(departureCal.getTimeInMillis());
        Date arrive = new Date(arriveCal.getTimeInMillis());

        return Flight.builder().departure(departure).arrive(arrive).build();
    }

    private Calendar getNewDataCalendar(Calendar calendar, int data, int hours, int minutes){
        Calendar cal = (Calendar) calendar.clone();
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + minutes);
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) + hours);
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) + data);
        return cal;
    }

    private Ticket create() {
        Random random = new Random();
        Date dateOfPurchase = new Date(getNewDataCalendar(Calendar.getInstance(),-random.nextInt(12)
                ,-random.nextInt(6),0).getTimeInMillis());

        return Ticket.builder().dateOfPurchase(dateOfPurchase).registered(false).build();
    }

    /** далее назначить связи уже в sql коде! */
}
