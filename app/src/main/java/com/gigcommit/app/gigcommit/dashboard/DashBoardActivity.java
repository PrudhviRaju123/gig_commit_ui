package com.gigcommit.app.gigcommit.dashboard;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.gigcommit.app.gigcommit.R;
import com.gigcommit.app.gigcommit.dashboard.fragments.HomeFragment;
import com.gigcommit.app.gigcommit.dashboard.fragments.MessageFragment;
import com.gigcommit.app.gigcommit.dashboard.fragments.ProfileFragment;
import com.gigcommit.app.gigcommit.dashboard.fragments.UserInterestsFragment;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    private int[] tabIcons = {R.drawable.ic_send_message_icon, R.drawable.ic_heart_icon, R.drawable.ic_message_icon, R.drawable.ic_bank_icon};
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        ViewPagerFragmentPagerAdapter viewPagerFragmentPagerAdapter = new ViewPagerFragmentPagerAdapter(getSupportFragmentManager());

        viewPagerFragmentPagerAdapter.addFragment(new HomeFragment(), "Home");
        viewPagerFragmentPagerAdapter.addFragment(new UserInterestsFragment(), "Like");
        viewPagerFragmentPagerAdapter.addFragment(new MessageFragment(), "Message");
        viewPagerFragmentPagerAdapter.addFragment(new ProfileFragment(), "Profile");

        viewPager.setAdapter(viewPagerFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);

        getSupportActionBar().hide();


    }


    public class ViewPagerFragmentPagerAdapter extends FragmentPagerAdapter {

        private ArrayList<Fragment> fragmentList = new ArrayList<>();
        private ArrayList<String> titleList = new ArrayList<>();

        public ViewPagerFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            titleList.add(title);
        }
    }
}
