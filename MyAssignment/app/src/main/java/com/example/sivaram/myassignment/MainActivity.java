package com.example.sivaram.myassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private DatabaseReference as,sa;
    FirebaseDatabase database;
    ListView listView;
    User user;
    ImageView imageView;
    ArrayList<String> list,list2;
    ArrayAdapter<String> adapter,adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        final ProgressBar progressBar= findViewById(R.id.pb);
        user=new User();
        imageView=findViewById(R.id.imageview);
        Log.e("siva","ram");
        list=new ArrayList<>();
        adapter=new ArrayAdapter<String>(this,R.layout.custom,R.id.textview1,list);
        database=FirebaseDatabase.getInstance();
        as=database.getReference("Electrician");
        as.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dis:dataSnapshot.getChildren()){
                    user=dis.getValue(User.class);
                    progressBar.setVisibility(View.INVISIBLE);
                    list.add(user.getTimestamp().toString()+"       "+user.getStatus()+" \n"+user.getBillno()+"\n"+user.getRole());
                }
               listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                Intent ii = new Intent(MainActivity.this,p1.class);
                startActivity(ii);
                break;
            case 1:
                Intent iii = new Intent(MainActivity.this,p2.class);
                startActivity(iii);
                break;
            case 2:
                Intent iiii = new Intent(MainActivity.this,p3.class);
                startActivity(iiii);
                break;
            case 3:
                Intent iiiii = new Intent(MainActivity.this,p4.class);
                startActivity(iiiii);
                break;

        }

    }
}
