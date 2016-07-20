package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by Roiprez on 17/07/2016.
 */
public class Word {

    private String englishWord;
    private String miwokWord;

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
}
