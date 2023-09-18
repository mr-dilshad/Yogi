package com.project.service;

import com.project.model.WellnessCentre;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WellnessCentreService {
    public Optional<WellnessCentre> getWellnessCentre(UUID id);
    public WellnessCentre createWellnessCentre(WellnessCentre wellnessCentre);

    WellnessCentre updateWellnessCentre(UUID id, WellnessCentre wellnessCentre);

    boolean deleteWellnessCentre(UUID id);

    List<WellnessCentre> getAllWellnessCentres();
}
