package com.jamipariseva.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "scan_khatian")
@IdClass(KhatianId.class)
public class KhatianEntity {
    @Id
    private String IDN;
    @Id
    private String KTSR;
    @Lob
    private byte[] blob_data;
    private String file_formate;
    private LocalDateTime entry_data;
    private Integer enteredBy;
    private String entryIp;
    private Integer verifiedBy;
    private LocalDateTime verificationDate;
    private String verificationIp;
    private Integer approvedBy;
    private LocalDateTime approvedDate;
    private String approvedIp;
    private LocalDateTime modificationDate;
    private Integer modifiedBy;
    private String modificationIp;
    private Integer KT1;
    private Integer KT2;
    private String isCancelled;




}
