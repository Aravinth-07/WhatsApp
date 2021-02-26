package com.aravinth.whatsapp;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import Fragments.CallsFragment;
import Fragments.ChatsFragment;
import Fragments.StatusFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    public PagerAdapter(FragmentManager fm,int noOfTabs)
    {
        super(fm);
        this.noOfTabs = noOfTabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
