package com.foobar.hellostudio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by tom on 11/15/13.
 */
public class ListViewFragment extends Fragment
{

    public ListViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);
        updateList((ListView)rootView.findViewById(R.id.listView));
        return rootView;
    }

    private void updateList(ListView list)
    {
        String[] notesArray = new String[] { "foo", "bar", "baz"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, notesArray);

        list.setAdapter(adapter);
    }
}
