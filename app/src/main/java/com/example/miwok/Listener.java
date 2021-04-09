package com.example.miwok;

import android.view.View;
import android.widget.Toast;

public class Listener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open numbers", Toast.LENGTH_SHORT).show();
    }
}
