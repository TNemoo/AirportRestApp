package com.springcourse.AirportRestApp.DTO;

import lombok.*;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirlineDTO {
    private Long id;
    private String nameCompany;
    private String owner;
    private String paymentAccount;
//    @ToString.Exclude
//    private Set<PlaneDTO> planes;
//    @ToString.Exclude
//    private Set<AirportDTO> airports;

    private int quantityPlanes;
}
