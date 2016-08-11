package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Roiprez on 17/07/2016.
 */
public class Word {

    private String englishWord;
    private String miwokWord;
    private int translationImage;

    public Word(String englishWord, String miwokWord, int image){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.translationImage = image;
    }

    public Word(String englishWord, String miwokWord){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getTranslationImage(){ return translationImage;}
}
