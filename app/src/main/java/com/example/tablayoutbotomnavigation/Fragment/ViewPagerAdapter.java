package com.example.tablayoutbotomnavigation.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutbotomnavigation.MainActivity;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behaviorResumeOnlyCurrentFragment) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BlankFragmentHome();
            case 1:
                return new BlankFragmentProfile();
            case 2:
                return new BlankFragmentSetting();
            default:
                return new BlankFragmentHome();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
