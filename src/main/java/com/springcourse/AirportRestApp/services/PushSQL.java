package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.models.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class PushSQL {

    private final AllRepository allRepository;

    public PushSQL(AllRepository allRepository) {
        this.allRepository = allRepository;
    }


    public void setSeatsToPlanes() {
        Set<Seat> seats737_900ER = createListForAnyPlane(153, 0, 16, 0); //список сидений для Boeing 737 900ER
        Set<Seat> seats737_800 = createListForAnyPlane(135, 0, 16, 0); //список сидений для Boeing 737 800
        Set<Seat> seats737_700 = createListForAnyPlane(149, 0, 0, 0); //список сидений для Boeing 737 700

        pushSeatsToPlane(seats737_900ER, 1);
        pushSeatsToPlane(seats737_900ER, 2);
        pushSeatsToPlane(seats737_900ER, 3);
        pushSeatsToPlane(seats737_800, 4);
        pushSeatsToPlane(seats737_800, 5);
        pushSeatsToPlane(seats737_800, 6);
        pushSeatsToPlane(seats737_800, 7);
        pushSeatsToPlane(seats737_800, 8);
        pushSeatsToPlane(seats737_800, 9);
        pushSeatsToPlane(seats737_700, 10);
    }

    private void pushSeatsToPlane(Set<Seat> seats, long id_plane) {
        Optional<Plane> plane = allRepository.plane.findById(id_plane);
        if (plane.isPresent()) {
            for (Seat seat : seats)
                seat.setPlane(plane.get());
            plane.get().setSeats(seats);
            allRepository.seat.saveAll(seats);
            allRepository.plane.save(plane.get());
        }
    }

    private Set<Seat> createListForAnyPlane(int economy, int comfort, int business, int first) {
        Set<Seat> seats = new HashSet<>();
        if (economy > 0)
            fillingSeatsClass(seats, CharClass.ECONOMY, economy);
        if (comfort > 0)
            fillingSeatsClass(seats, CharClass.COMFORT, comfort);
        if (business > 0)
            fillingSeatsClass(seats, CharClass.BUSINESS, business);
        if (first > 0)
            fillingSeatsClass(seats, CharClass.FIRST, first);
        return seats;
    }

    private void fillingSeatsClass(Set<Seat> seats, CharClass charClass, int quantity) {
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
    }
}

