package com.example.myjokes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment {

    String joke;

    public static JokeFragment newInstance(String joke){
        JokeFragment jokeFragment = new JokeFragment();
        Bundle args = new Bundle();
        args.putString("joke", joke);
        jokeFragment.setArguments(args);
        return jokeFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        joke = getArguments().getString("joke");
    }

    public JokeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_joke, container, false);
        TextView tvJoke = (TextView) v.findViewById(R.id.tvJoke);
        tvJoke.setText(joke);
        return v;
    }



}
