package demo.song.com.mytest2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Timer;
import java.util.TimerTask;

import demo.song.com.mytest2.fragment.OneFragment;
import demo.song.com.mytest2.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private RadioButton button1,button2,button3;
    private RadioGroup group;
    private Toolbar toolbar;
    private Object o;

    //    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.but1:
//                        button1.setTextSize(20);
                        button2.setTextSize(15);
                        pager.setCurrentItem(0);
                        break;
                    case R.id.but2:
                        button1.setTextSize(15);
//                        button2.setTextSize(20);
                        pager.setCurrentItem(1);
                        break;
                }
            }
        });
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new OneFragment();
                        break;
                    case 1:
                        fragment = new TwoFragment();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });

    }

    private void initView() {
        pager = (ViewPager) findViewById(R.id.pager);
        group = (RadioGroup) findViewById(R.id.rg);
        button1 = (RadioButton) findViewById(R.id.but1);
        button2 = (RadioButton) findViewById(R.id.but2);
        toolbar = (Toolbar) findViewById(R.id.tool);

    }

    public void nullp(){
        o = null;
        System.out.print(o.toString());

    }
}
