package com.example.viewpagerfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SlideAdapter extends FragmentStateAdapter {
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        String data;
        switch (position) {
            case 0:
                data = "A";
            case 1:
                data = "B";
            case 2:
                data = "C";
            case 3:
                data = "D";
            case 4:
                data = "E";
            default:
                data = "";
                break;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
