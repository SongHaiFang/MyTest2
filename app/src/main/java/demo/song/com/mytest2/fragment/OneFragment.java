package demo.song.com.mytest2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import demo.song.com.mytest2.MainActivity;
import demo.song.com.mytest2.R;
import demo.song.com.mytest2.adapter.HomeAdapter;
import demo.song.com.mytest2.bean.Bean;
import okhttp3.Call;

/**
 * data:2017/9/21 0021.
 * Created by ：宋海防  song on
 */
public class OneFragment extends android.support.v4.app.Fragment {

    private RecyclerView recyclerView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.one_fragment, container, false);
        initView();
        okGet();

        return view;
    }

    private void okGet() {
        OkHttpUtils.get()
                .url("http://h5test.newaircloud.com/api/getLayouts?sid=xkycs&cid=10024&date=")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        String string = response.toString();
                        Bean bean = new Gson().fromJson(string, Bean.class);
                        HomeAdapter adapter = new HomeAdapter(bean,getActivity());
                        recyclerView.setAdapter(adapter);

                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                    }
                });
    }

    private void initView() {
        recyclerView = (RecyclerView) view.findViewById(R.id.recy);
    }
}
