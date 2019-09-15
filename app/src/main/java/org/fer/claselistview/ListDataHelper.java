package org.fer.claselistview;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.avion, "avion", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.bicho, "bicho", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.carro, "carro", android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.dead, "dead", android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.flame, "flame", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.perro, "perro", android.R.color.holo_orange_dark));
        list.add(new ListViewItem(R.drawable.phone, "phone", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.pintar, "pintar", android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.star, "star", android.R.color.holo_red_dark));

        return list;
    }

}