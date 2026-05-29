package com.jamipariseva.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class KhatianId implements Serializable {
    private String IDN;
    private String KTSR;
}
