package com.jamipariseva.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "owner_details")
@IdClass(OwnerId.class)
public class OwnerEntity {
    @Id
    private String IDN;
    @Id
    private String KTSR;
    @Id
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
