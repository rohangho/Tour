package com.example.android.guide;

/**
 * Created by ROHAN on 29-06-2017.
 */

public class tour {

    private String name_of_res;

    private int pointer_of_image;

    public tour(String name, int pointer) {
        pointer_of_image = pointer;
        name_of_res = name;
    }

    public String getresname() {
        return name_of_res;
    }

    public int getimg() {
        return pointer_of_image;
    }


}
