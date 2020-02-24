package com.introid.bottomsheetwithbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomSheet.BottomSheetListener {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button openBottomSheet = findViewById(R.id.button_clocked);

        textView=findViewById( R.id.tv_messeage );

        openBottomSheet.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheet bottomSheet= new BottomSheet();
                bottomSheet.show( getSupportFragmentManager(),"First Bottom Sheet" );
            }
        } );
    }

    @Override
    public void onButtonClicked(String text) {
        textView.setText( text );
    }
}
