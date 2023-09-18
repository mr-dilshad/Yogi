package com.project;

import com.project.model.Address;
import com.project.model.ContactDetail;
import com.project.model.WellnessCentre;
import com.project.repository.WellnessCentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.UUID;

@SpringBootApplication
@EnableMongoRepositories
public class WellnessCentreMain implements CommandLineRunner {

    @Autowired
    private WellnessCentreRepository wellnessCentreRepository;
    public static void main(String[] args) {
            SpringApplication.run(WellnessCentreMain.class, args);
    }

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i<5;i++) {
            WellnessCentre wellnessCentre = WellnessCentre.builder()
                    .id(UUID.randomUUID())
                    .name("WellnessCentre1")
                    .address(Address.builder().city("City1").state("State1").country("Country1").postalCode("PostalCode1").streetAddress("StreetAddress1").build())
                    .contactDetail(ContactDetail.builder().name("Name1").email("Email").phoneNumber("Phone1").build())
                    .build();
            wellnessCentreRepository.save(wellnessCentre);

        }
    }
}
