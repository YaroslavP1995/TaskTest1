package com.example.slavik.tasktest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    public static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    private int pageNumber;

    static FragmentOne newInstance(int page) {
        FragmentOne fragmentOne = new FragmentOne();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        fragmentOne.setArguments(arguments);
        return fragmentOne;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, null);
        TextView numOfPage = view.findViewById(R.id.numFragments);
        numOfPage.setText("" + (pageNumber + 1));
        return view;
    }
}
