package com.example.android.miwok;



import android.media.MediaPlayer;
import android.view.View;



/**
 * Created by Roiprez on 17/07/2016.
 */
public class Word {

    private String englishWord;
    private String miwokWord;
    private int translationImage;
    private int translationAudio;

    public Word(String englishWord, String miwokWord, int image, int audio) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.translationImage = image;
        this.translationAudio = audio;
    }

    public Word(String englishWord, String miwokWord, int audio) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.translationAudio = audio;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getTranslationImage() { return translationImage; }

    public int getTranslationAudio() { return translationAudio; }


}
