package com.client.myplace.detail;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.client.myplace.BlankFragment;

public class ImageAdapter extends FragmentPagerAdapter {
    public ImageAdapter( FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment f = new BlankFragment();
        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
