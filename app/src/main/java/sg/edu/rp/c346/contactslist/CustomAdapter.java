package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sg.edu.rp.c346.contactslist.Contact_List;
import sg.edu.rp.c346.contactslist.R;

/**
 * Created by 16019829 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Contact_List> contactList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact_List> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhone);

        Contact_List currentItem = contactList.get(position);
        String name = currentItem.getName();
        String code = currentItem.getCode();
        String phone = currentItem.getPhone();
        tvName.setText(name);
        tvCode.setText(code);
        tvPhone.setText(phone);

        return rowView;
    }
}
