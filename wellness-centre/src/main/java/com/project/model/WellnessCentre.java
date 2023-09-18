package com.project.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "wellness-centre")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WellnessCentre {
    @Id
    private UUID id;
    private String name;
    private Address address;
    private ContactDetail contactDetail;
}
