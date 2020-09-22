package com.space.service;

import com.space.model.ShipTO;
import com.space.repository.ShipEntity;
import com.space.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ShipServiceImpl implements ShipService {
    private ShipRepository repository;

    @Autowired
    public ShipServiceImpl(ShipRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShipTO> getAll() {
        List<ShipEntity> shipEntities = Optional.ofNullable(repository.findAll())
                .orElse(Collections.emptyList());

        return shipEntities.stream()
                .map(ship -> new ShipTO(
                        ship.getId(), ship.getName(), ship.getPlanet(),
                        ship.getShipType(), ship.getProdDate(), ship.getUsed(),
                        ship.getSpeed(), ship.getCrewSize()))
                .collect(Collectors.toList());
    }
}
