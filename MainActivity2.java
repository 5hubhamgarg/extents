package com.example.my_application;
import androidx.appcompat.app.AppCompatActivity;
import
import
import
import
android.content.Intent;
android.os.Bundle;
android.widget.TextView;
android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main2);
Bundle extras = getIntent().getExtras();
int sum = extras.getInt("ans");
Toast.makeText(this, "The sum is "+sum, Toast.LENGTH_SHORT).show();
TextView t1 = (TextView) findViewById(R.id.textView6);
}
t1.setText("The sum is "+sum);
}
