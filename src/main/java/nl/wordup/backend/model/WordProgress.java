package nl.wordup.backend.model;

import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "word_id"}))
public class WordProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "word_id")
    private Word word;

    private int incorrectCount;
    private boolean isMastered;

    public Long getId() { return id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Word getWord() { return word; }
    public void setWord(Word word) { this.word = word; }
    public int getIncorrectCount() { return incorrectCount; }
    public void setIncorrectCount(int incorrectCount) { this.incorrectCount = incorrectCount; }
    public boolean isMastered() { return isMastered; }
    public void setMastered(boolean mastered) { isMastered = mastered; }
}