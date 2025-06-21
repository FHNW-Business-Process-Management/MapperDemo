package com.mapping.mapperdemo.mapper;

import com.mapping.mapperdemo.dto.DoxisDto;
import com.mapping.mapperdemo.dto.SumexDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CaseMapper {
    @Mapping(source = "versicherungsNr", target = "insuranceNumber")
    @Mapping(source = "nachname", target = "insuredPersonLastName")
    @Mapping(source = "vorname", target = "insuredPersonFirstName")
    @Mapping(source = "geburtsdatum", target = "insuredPersonDateOfBirth")
    @Mapping(source = "versicherungstyp", target = "insuranceType")
    @Mapping(source = "rechnungsdatum", target = "invoiceDate")
    @Mapping(source = "drgCode", target = "drgCodeOld")
    @Mapping(source = "rechnungstyp", target = "caseCategoryID")
    @Mapping(source = "ticketId", target = "ticketID")
    DoxisDto toDoxisDto(SumexDto sumexDto);
}
