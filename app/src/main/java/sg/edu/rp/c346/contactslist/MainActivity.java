package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact_List> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContact);

        alContactList = new ArrayList<>();
        Contact_List contact1 = new Contact_List("Mary", "+65", "65442334");
        Contact_List contact2 = new Contact_List("Ken", "+65", "97442437");
        alContactList.add(contact1);
        alContactList.add(contact2);

        caContact = new CustomAdapter(this, R.layout.contact, alContactList);

        lvContact.setAdapter(caContact);
    }
}
