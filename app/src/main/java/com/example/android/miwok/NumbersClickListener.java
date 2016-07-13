package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        //A toast displays a simple message that disappears after a while
        Toast.makeText(view.getContext(),
            "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
