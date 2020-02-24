package com.introid.bottomsheetwithbuttons;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet extends BottomSheetDialogFragment {
    BottomSheetListener bottomSheetListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.bottomsheeet_layout, container,false);

        Button button1= view.findViewById( R.id.button1 );
        Button button2= view.findViewById( R.id.button2 );

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetListener.onButtonClicked( "BUTTON 1 cLICKED" );
                dismiss();
            }
        } );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetListener.onButtonClicked( "BUTTON 2 cLICKED" );
                dismiss();
            }
        } );

        return view;
    }

    public interface  BottomSheetListener{
        void onButtonClicked(String text);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        try{
        bottomSheetListener= (BottomSheetListener) context;}
        catch(ClassCastException e){
            throw new ClassCastException( context.toString()+ " must Implement BottomSheet " ) ;

        }


    }
}
