package nl.wordup.backend.model;

import jakarta.persistence.*;

@Entity
public class PracticeSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int durationSeconds;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "word_list_id")
    private WordList wordList;

    public Long getId() { return id; }
    public int getDurationSeconds() { return durationSeconds; }
    public void setDurationSeconds(int durationSeconds) { this.durationSeconds = durationSeconds; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public WordList getWordList() { return wordList; }
    public void setWordList(WordList wordList) { this.wordList = wordList; }
}