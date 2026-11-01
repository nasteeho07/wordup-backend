package nl.wordup.backend.repository;

import nl.wordup.backend.model.WordList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordListRepository extends JpaRepository<WordList, Long> {
}