package com.jamipariseva.mapper;


import com.jamipariseva.dto.KhatianResponseDto;
import com.jamipariseva.entity.KhatianEntity;

public class KhatianMapper {
    public static KhatianResponseDto mapToKhatianDto(KhatianEntity khatianentity){
        return new KhatianResponseDto(
                khatianentity.getIDN(),
                khatianentity.getKTSR(),
                khatianentity.getBlob_data(),
                khatianentity.getFile_formate(),
                khatianentity.getEntry_data(),
                khatianentity.getEnteredBy(),
                khatianentity.getEntryIp(),
                khatianentity.getVerifiedBy(),
                khatianentity.getVerificationDate(),
                khatianentity.getVerificationIp(),
                khatianentity.getApprovedBy(),
                khatianentity.getApprovedDate(),
                khatianentity.getApprovedIp(),
                khatianentity.getModificationDate(),
                khatianentity.getModifiedBy(),
                khatianentity.getModificationIp(),
                khatianentity.getKT1(),
                khatianentity.getKT2(),
                khatianentity.getIsCancelled()

        );
    }
    public static KhatianEntity mapToKhatianEntity(KhatianResponseDto khatianresponsedto){
        return new KhatianEntity(
                khatianresponsedto.getIDN(),
                khatianresponsedto.getKTSR(),
                khatianresponsedto.getBlob_data(),
                khatianresponsedto.getFile_formate(),
                khatianresponsedto.getEntry_data(),
                khatianresponsedto.getEnteredBy(),
                khatianresponsedto.getEntryIp(),
                khatianresponsedto.getVerifiedBy(),
                khatianresponsedto.getVerificationDate(),
                khatianresponsedto.getVerificationIp(),
                khatianresponsedto.getApprovedBy(),
                khatianresponsedto.getApprovedDate(),
                khatianresponsedto.getApprovedIp(),
                khatianresponsedto.getModificationDate(),
                khatianresponsedto.getModifiedBy(),
                khatianresponsedto.getModificationIp(),
                khatianresponsedto.getKT1(),
                khatianresponsedto.getKT2(),
                khatianresponsedto.getIsCancelled()

        );
    }
}
