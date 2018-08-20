package com.example.sivaram.myassignment;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class p3 extends AppCompatActivity {
    private DatabaseReference as,sa;
    FirebaseDatabase database;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        final TextView status=findViewById(R.id.status);
        final TextView timestamp = findViewById(R.id.textView);
        final TextView ad1=findViewById(R.id.ad1);
        final TextView ad2=findViewById(R.id.ad2);
        final TextView ad3=findViewById(R.id.ad3);
        final TextView rate=findViewById(R.id.rate1_id);
        final TextView tax=findViewById(R.id.tax1_id);
        final TextView discount=findViewById(R.id.discount1_id);
        final TextView total=findViewById(R.id.grandtotal1_id);
        final TextView position=findViewById(R.id.job_id);
        final TextView start =findViewById(R.id.starttime1_id);
        final TextView end =findViewById(R.id.endtime1_id);
        final TextView tt = findViewById(R.id.totaltime1_id);
        final TextView payment=findViewById(R.id.paymentStatus1_id);
        final TextView service=findViewById(R.id.edit_Text_id);
        final TextView tip = findViewById(R.id.tip);
        final Button bt=findViewById(R.id.bt);
        final ImageView pi = findViewById(R.id.image_id);
        Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/assingnment-8e608.appspot.com/o/Ray5251b4f6e375c.jpg?alt=media&token=ec6e0913-5695-4764-a9dc-4a18794054be").into(pi);
        database= FirebaseDatabase.getInstance();
        as=database.getReference("Electrician");
        sa=as.child("Varun");
        sa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                user=dataSnapshot.getValue(User.class);
                timestamp.setText(user.getTimestamp().toString());
                status.setText(user.getStatus().toString());
                ad1.setText(user.getAd1().toString());
                ad2.setText(user.getAd2().toString());
                ad3.setText(user.getAd3());
                position.setText(user.getPosition());
                rate.setText(user.getRate());
                tax.setText(user.getTax());
                discount.setText(user.getDiscount());
                total.setText(user.getTotal());
                start.setText(user.getStart().toString());
                end.setText(user.getEnd().toString());
                tt.setText(user.getTt().toString());
                payment.setText(user.getPayment().toString());
                service.setText(user.getService());
                tip.setText(user.getRole().toString());
                bt.setText(user.getCancel().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
