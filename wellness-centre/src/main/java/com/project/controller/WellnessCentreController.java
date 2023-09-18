package com.project.controller;


import com.project.model.WellnessCentre;
import com.project.service.WellnessCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/wellness-centres")
public class WellnessCentreController {
    @Autowired
    WellnessCentreService wellnessCentreService;

    // Create a new WellnessCentre
    @PostMapping
    public WellnessCentre createWellnessCentre(@RequestBody WellnessCentre wellnessCentre) {
        return wellnessCentreService.createWellnessCentre(wellnessCentre);
    }

    // Get a WellnessCentre by ID
    @GetMapping("/{id}")
    public ResponseEntity<WellnessCentre> getWellnessCentreById(@PathVariable UUID id) {
        Optional<WellnessCentre> wellnessCentre = wellnessCentreService.getWellnessCentre(id);
        return wellnessCentre.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<String> getDummyData(){
        return ResponseEntity.ok("This is dummy data");
    }

    // Update an existing WellnessCentre
    @PutMapping("/{id}")
    public ResponseEntity<WellnessCentre> updateWellnessCentre(
            @PathVariable UUID id, @RequestBody WellnessCentre wellnessCentre) {
        WellnessCentre updatedWellnessCentre = wellnessCentreService.updateWellnessCentre(id, wellnessCentre);
        if (updatedWellnessCentre != null) {
            return ResponseEntity.ok(updatedWellnessCentre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a WellnessCentre by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWellnessCentre(@PathVariable UUID id) {
        if (wellnessCentreService.deleteWellnessCentre(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<WellnessCentre>> getWellnessCentres(){
        return ResponseEntity.ok(wellnessCentreService.getAllWellnessCentres());
    }

}