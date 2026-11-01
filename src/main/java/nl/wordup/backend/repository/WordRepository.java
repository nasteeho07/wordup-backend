package nl.wordup.backend.repository;

import nl.wordup.backend.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {
    List<Word> findByWordListId(Long wordListId);
}