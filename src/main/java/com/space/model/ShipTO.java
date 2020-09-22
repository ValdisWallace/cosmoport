package com.space.model;

import com.space.controller.ShipOrder;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class ShipTO {
    private Long id;
    private String name;
    private String planet;
    private ShipOrder shipType;
    private OffsetDateTime prodDate;
    private Boolean isUsed;
    private BigDecimal speed;
    private Integer crewSize;

    public ShipTO(Long id, String name, String planet, ShipOrder shipType,
                  OffsetDateTime prodDate, Boolean isUsed, BigDecimal speed, Integer crewSize) {
        this.id = id;
        this.name = name;
        this.planet = planet;
        this.shipType = shipType;
        this.prodDate = prodDate;
        this.isUsed = isUsed;
        this.speed = speed;
        this.crewSize = crewSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public ShipOrder getShipType() {
        return shipType;
    }

    public void setShipType(ShipOrder shipType) {
        this.shipType = shipType;
    }

    public OffsetDateTime getProdDate() {
        return prodDate;
    }

    public void setProdDate(OffsetDateTime prodDate) {
        this.prodDate = prodDate;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }
}
