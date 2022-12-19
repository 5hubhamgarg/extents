package com.example.my_application;
import androidx.appcompat.app.AppCompatActivity;
import
import
import
import
import
import
android.content.Intent;
android.os.Bundle;
android.view.View;
android.widget.Button;
android.widget.EditText;
android.widget.TextView;
public class MainActivity extends AppCompatActivity {
int sum = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button button
Intent intent
EditText e1 =
EditText e2 =
= (Button) findViewById(R.id.button);
= new Intent(this, MainActivity2.class);
(EditText) findViewById(R.id.editTextNumber);
(EditText) findViewById(R.id.editTextNumber2);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
sum = Integer.parseInt(e1.getText().toString()) +
Integer.parseInt(e2.getText().toString());
intent.putExtra("ans", sum);
startActivity(intent);
});
}
