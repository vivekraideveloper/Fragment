package com.vijayjaidewan01vivekrai.fragment_github;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Second extends Fragment {

    TextView textView;


    public Second() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);

        textView = view.findViewById(R.id.text_view);
        Bundle bundle = getArguments();
        textView.setText(bundle.getString("data"));

        return view;
    }

}
