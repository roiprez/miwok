/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("black", "lutti"));
        words.add(new Word("yellow", "otiiko"));
        words.add(new Word("blue", "tollokosu"));



        //Creating an ArrayAdapter which creates an array that fits the layout of a view
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        //Creating the ListView object from the ListView XML
        ListView listView = (ListView) findViewById(R.id.list);

        //Set an adapter for the ListView
        listView.setAdapter(itemsAdapter);
    }
}