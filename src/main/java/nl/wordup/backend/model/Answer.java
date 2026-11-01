package nl.wordup.backend.model;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String givenAnswer;
    private boolean isCorrect;

    @ManyToOne(optional = false)
    @JoinColumn(name = "word_id")
    private Word word;

    @ManyToOne(optional = false)
    @JoinColumn(name = "session_id")
    private PracticeSession session;

    public Long getId() { return id; }
    public String getGivenAnswer() { return givenAnswer; }
    public void setGivenAnswer(String givenAnswer) { this.givenAnswer = givenAnswer; }
    public boolean isCorrect() { return isCorrect; }
    public void setCorrect(boolean correct) { isCorrect = correct; }
    public Word getWord() { return word; }
    public void setWord(Word word) { this.word = word; }
    public PracticeSession getSession() { return session; }
    public void setSession(PracticeSession session) { this.session = session; }
}