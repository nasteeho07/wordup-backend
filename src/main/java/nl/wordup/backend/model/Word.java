package nl.wordup.backend.model;

import jakarta.persistence.*;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String term;

    @Column(nullable = false)
    private String translation;

    @ManyToOne(optional = false)
    @JoinColumn(name = "word_list_id")
    private WordList wordList;

    public Long getId() { return id; }
    public String getTerm() { return term; }
    public void setTerm(String term) { this.term = term; }
    public String getTranslation() { return translation; }
    public void setTranslation(String translation) { this.translation = translation; }
    public WordList getWordList() { return wordList; }
    public void setWordList(WordList wordList) { this.wordList = wordList; }
}