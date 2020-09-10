package com.example.leadboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LearningLeaderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LearningLeaderFragment extends Fragment {


    public LearningLeaderFragment() {
        // Required empty public constructor
    }


    public static LearningLeaderFragment newInstance() {
        LearningLeaderFragment fragment = new LearningLeaderFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learning_leader, container, false);
    }
}
