package eu.raloop.fleetmsapp.parameters.repositories;

import eu.raloop.fleetmsapp.parameters.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
