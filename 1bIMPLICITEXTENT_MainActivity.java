package com.example.my_application;
import androidx.appcompat.app.AppCompatActivity;
import
import
import
import
import
import
import
import
android.content.Intent;
android.net.Uri;
android.os.Bundle;
android.view.View;
android.widget.Button;
android.widget.EditText;
android.widget.TextView;
android.widget.Toast;
public class MainActivity extends AppCompatActivity {
int sum = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button button = (Button) findViewById(R.id.button);
Intent intent = new Intent(this, MainActivity2.class);
EditText p = (EditText) findViewById(R.id.editTextPhone);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String num = p.getText().toString();
Intent it = new Intent(Intent.ACTION_DIAL);
it.setData(Uri.parse("tel:"+num));
Toast.makeText(MainActivity.this, "Th number is dialing",
Toast.LENGTH_SHORT).show();
startActivity(it);
}
});
}
}
