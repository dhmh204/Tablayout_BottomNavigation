package com.example.tablayoutbotomnavigation.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutbotomnavigation.Fragment.BlankFragmentHome;
import com.example.tablayoutbotomnavigation.Fragment.BlankFragmentProfile;
import com.example.tablayoutbotomnavigation.Fragment.BlankFragmentSetting;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {
    public HomeViewPagerAdapter(@NonNull FragmentManager fm, int behaviorResumeOnlyCurrentFragment) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return new tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            default:
                return "Tab 1";

        }

    }
}
