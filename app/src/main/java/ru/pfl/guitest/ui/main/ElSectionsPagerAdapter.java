package ru.pfl.guitest.ui.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ElSectionsPagerAdapter extends FragmentPagerAdapter {


    public ElSectionsPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        /*Fragment fragment = null;
        switch (position){
            case 0:
                fragment = MyBlankFragment.newInstance();
                break;
            case 1:
                fragment = UielmFragmentButtons.newInstance();
                break;
            case 3:
                break;
        }

        return fragment;*/
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
