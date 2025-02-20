package Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{
    
}
