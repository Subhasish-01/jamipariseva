package com.jamipariseva.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDto {

    private String IDN;
    private String KTSR;
    private Integer SRNA;
    private String SFNAME;
    private String SLNAME;
    private String FH;
    private String FHNAME;
    private Integer SHARE;
    private String AD1;
    private String AD2;
    private String AD3;

}
