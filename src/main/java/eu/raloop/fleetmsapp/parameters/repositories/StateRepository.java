package eu.raloop.fleetmsapp.parameters.repositories;

import eu.raloop.fleetmsapp.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
