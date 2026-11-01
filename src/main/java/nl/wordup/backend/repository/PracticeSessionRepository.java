package nl.wordup.backend.repository;

import nl.wordup.backend.model.PracticeSession;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PracticeSessionRepository extends JpaRepository<PracticeSession, Long> {
    List<PracticeSession> findByUserId(Long userId);
}