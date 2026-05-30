package com.jamipariseva.dto;

import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhatianResponseDto {
    private String IDN;
    private String KTSR;
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
