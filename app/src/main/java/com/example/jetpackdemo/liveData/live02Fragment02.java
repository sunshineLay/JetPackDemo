package com.example.jetpackdemo.liveData;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpackdemo.R;

/**
 * @TODO:
 * @Date: 2021/11/23 15:42
 * @User: lay
 */
public class live02Fragment02 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.live02_fragment_02, container, false);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar);
        live02ViewModel live02ViewModel = new ViewModelProvider(getActivity(), new ViewModelProvider.NewInstanceFactory()).get(live02ViewModel.class);
        live02ViewModel.getProgress().observe(getActivity(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                seekBar.setProgress(i);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                live02ViewModel.getProgress().setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        return view;
    }
}
