package com.example.BarApp2.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BarApp2.api.ResourceNotFoundException;
import com.example.BarApp2.api.model.BarMaker;
import com.example.BarApp2.api.repository.BarMakerRepository;

@Service
public class BarMakerService {
    @Autowired
    private BarMakerRepository barMakerRepository;

    public List<BarMaker> getAllBarMakers() {
        return barMakerRepository.findAll();
    }

    public BarMaker createBarMaker(BarMaker barMaker) {
        return barMakerRepository.save(barMaker);
    }

    public BarMaker getBarMakerById(int id) {
        return barMakerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BarMaker not found"));
    }

    public BarMaker updateBarMaker(int id, BarMaker barMakerDetails) {
        BarMaker barMaker = barMakerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BarMaker not found"));
        barMaker.setName(barMakerDetails.getName());
        barMaker.setSpecialty(barMakerDetails.getSpecialty());
        return barMakerRepository.save(barMaker);
    }

    public void deleteBarMaker(int id) {
        BarMaker barMaker = barMakerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BarMaker not found"));
        barMakerRepository.delete(barMaker);
    }
}
