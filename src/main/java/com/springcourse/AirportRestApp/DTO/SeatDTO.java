package com.springcourse.AirportRestApp.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.springcourse.AirportRestApp.models.CharClass;
import lombok.*;

import javax.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatDTO {
    private Long id;
    private Integer charRow;
    private CharSymbol charSymbol;
    private CharClass charClass;
    private PlaneDTO plane;

    public enum CharSymbol {
        A, B, C, D, E, F, G
    }
}
