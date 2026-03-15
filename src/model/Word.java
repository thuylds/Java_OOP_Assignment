
package model;

public class Word {
    private String word;
    private String meaning;
    

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return  word + " | " + meaning;
    }
    
    public static Word fromFileString(String line) {
    String[] parts = line.split("\\|");
    if (parts.length == 2) {
        return new Word(parts[0].trim(), parts[1].trim());
    }
    return null; 
}
}
