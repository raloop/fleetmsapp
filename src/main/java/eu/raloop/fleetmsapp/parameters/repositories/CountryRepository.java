package eu.raloop.fleetmsapp.parameters.repositories;

import eu.raloop.fleetmsapp.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
