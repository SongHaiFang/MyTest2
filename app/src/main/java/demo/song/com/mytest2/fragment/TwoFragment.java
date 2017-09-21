package demo.song.com.mytest2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.song.com.mytest2.R;

/**
 * data:2017/9/21 0021.
 * Created by ：宋海防  song on
 */
public class TwoFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.two_fragment, container, false);
        return view;
    }
}
