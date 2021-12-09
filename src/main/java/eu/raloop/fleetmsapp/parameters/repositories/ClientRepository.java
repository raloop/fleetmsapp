package eu.raloop.fleetmsapp.parameters.repositories;

import eu.raloop.fleetmsapp.parameters.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
