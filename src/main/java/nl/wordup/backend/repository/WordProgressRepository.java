package nl.wordup.backend.repository;

import nl.wordup.backend.model.WordProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface WordProgressRepository extends JpaRepository<WordProgress, Long> {
    Optional<WordProgress> findByUserIdAndWordId(Long userId, Long wordId);
    List<WordProgress> findByUserId(Long userId);
}