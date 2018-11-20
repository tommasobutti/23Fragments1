package com.albertoserver.fragments_1.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.albertoserver.fragments_1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

    private ImageView ivImagen;
    private TextView lblManage;
    private Button btnManage;
    private Context context;

    // Crear variable private Context context;

    public ManageFragment() {
        context = getActivity();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        // Todo el código necesario para que el frame funcione.
        lblManage = rootView.findViewById(R.id.lblManage);
        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "HOLA MUNDO", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
