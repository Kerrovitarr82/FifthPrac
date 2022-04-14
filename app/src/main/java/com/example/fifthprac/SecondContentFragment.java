package com.example.fifthprac;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Date;

public class SecondContentFragment extends Fragment {

    public SecondContentFragment(){
        super(R.layout.second_fragment_content);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_fragment_content, container, false);
    }

    public void setSelectedItem() {
        String curDate = new Date().toString();
        TextView textView = getView().findViewById(R.id.dateTextView);
        textView.setText(curDate);
    }
}

