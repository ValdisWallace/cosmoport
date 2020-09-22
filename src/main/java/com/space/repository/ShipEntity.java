package com.space.repository;

import com.space.controller.ShipOrder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "ship")
public class ShipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String planet;
    @Enumerated(EnumType.STRING)
    private ShipOrder shipType;
    private OffsetDateTime prodDate;
    private Boolean isUsed;
    private BigDecimal speed;
    private Integer crewSize;

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

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    private BigDecimal rating;
}

