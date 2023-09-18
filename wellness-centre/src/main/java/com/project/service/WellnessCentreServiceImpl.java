package com.project.service;

import com.project.model.WellnessCentre;
import com.project.repository.WellnessCentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WellnessCentreServiceImpl implements WellnessCentreService {

    @Autowired
    WellnessCentreRepository wellnessCentreRepository;
    @Override
    public Optional<WellnessCentre> getWellnessCentre(UUID id) {
        return wellnessCentreRepository.findById(id);
    }

    @Override
    public WellnessCentre createWellnessCentre(WellnessCentre wellnessCentre) {
        return wellnessCentreRepository.save(wellnessCentre);
    }

    @Override
    public WellnessCentre updateWellnessCentre(UUID id, WellnessCentre wellnessCentre) {
        return wellnessCentreRepository.save(wellnessCentre);
    }

    @Override
    public boolean deleteWellnessCentre(UUID id) {
        Optional<WellnessCentre> wellnessCentres = wellnessCentreRepository.findById(id);
        if(wellnessCentres.isEmpty()){
            return false;
        }
        wellnessCentreRepository.delete(wellnessCentres.get());
        return true;
    }

    /**
     * @return
     */
    @Override
    public List<WellnessCentre> getAllWellnessCentres() {
        return wellnessCentreRepository.findAll();
    }

}
