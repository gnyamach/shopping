package com.vogella.android.shopping;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_one, container, false);
        Bundle bundle = getArguments();
        TextView name = (TextView)view.findViewById(R.id.name_editText_frag1);
        name.setText(bundle.getString("name"));
        TextView email = (TextView)view.findViewById(R.id.email_textView_frag1);
        email.setText(bundle.getString("email"));
        TextView item1 = (TextView)view.findViewById(R.id.item1_editText_frag1);
        item1.append(bundle.getString("shopping_1"));
        TextView item2 = (TextView)view.findViewById(R.id.item2_textView_frag1);
        item2.append(bundle.getString("shopping_2"));
        TextView item3 = (TextView)view.findViewById(R.id.item3_editText_frag1);
        item3.append(bundle.getString("shopping_3"));
        TextView item4 = (TextView)view.findViewById(R.id.item4_textView_frag1);
        item4.append(bundle.getString("shopping_4"));
        TextView item5 = (TextView)view.findViewById(R.id.item5_editText_frag1);
        item5.append(bundle.getString("shopping_5"));
        TextView item6 = (TextView)view.findViewById(R.id.item6_textView_frag1);
        item6.append(bundle.getString("shopping_6"));
        TextView item7 = (TextView)view.findViewById(R.id.item7_editText_frag1);
        item7.append(bundle.getString("shopping_7"));
        TextView item8 = (TextView)view.findViewById(R.id.item8_textView_frag1);
        item8.append(bundle.getString("shopping_8"));
        return view;

    }

}
