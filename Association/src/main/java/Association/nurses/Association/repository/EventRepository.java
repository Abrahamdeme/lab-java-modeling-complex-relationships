package Association.nurses.Association.repository;

import Association.nurses.Association.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {}
