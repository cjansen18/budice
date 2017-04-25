package com.chrisjansen.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by A426156 on 4/24/2017.
 */
@Data
@Entity
public class GenericAssumption {
    private @Id @GeneratedValue Long id;
    private @NonNull String sourceSystem, productType;
    private String prepaymentType;
    private int prepaymentRate;

    @Tolerate
    public GenericAssumption(){}
}
