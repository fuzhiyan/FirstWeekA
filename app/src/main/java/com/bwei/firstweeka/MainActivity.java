package com.bwei.firstweeka;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private TabLayout tab;
    private List<String> list=new ArrayList<>();
    private List<Fragment> flist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp= (ViewPager) findViewById(R.id.vp);
        tab= (TabLayout) findViewById(R.id.tab);
        list.add("第一");
        list.add("第二");
        list.add("第三");
        list.add("第四");
        list.add("第五");
        list.add("第六");
        list.add("第七");
        list.add("第八");
        list.add("第九");
        list.add("第十");
        flist=new ArrayList<Fragment>();
        flist.add(new Frag());
        flist.add(new Frag2());
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Bundle b = new Bundle();
                b.putString("page",list.get(position));

                return flist.get(position);
            }

            @Override
            public int getCount() {
                return flist.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

        });
        tab.setupWithViewPager(vp);
        tab.setTabTextColors(Color.BLUE,Color.RED);
        tab.setTabMode(TabLayout.MODE_FIXED);




    }
}
