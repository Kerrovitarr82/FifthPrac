package com.example.fifthprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements ContentFragment.OnFragmentSendDataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view, ContentFragment.class, null)
                .commit();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view2, SecondContentFragment.class, null)
                .commit();
    }

    @Override
    public void onSendData() {
        SecondContentFragment fragment = (SecondContentFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container_view2);
        fragment.setSelectedItem();
    }
}

