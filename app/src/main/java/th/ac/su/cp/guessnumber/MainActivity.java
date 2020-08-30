package th.ac.su.cp.guessnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import th.ac.su.cp.guessnumber.model.Answer;

// https://codelabs.developers.google.com/android-kotlin-fundamentals/

public class MainActivity extends AppCompatActivity {

    Answer a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = new Answer();
        //a.randomValue();

        Button guessButton = findViewById(R.id.guess_button);
        //guessButton.setText("Hello");
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.number_edit_text);
                String numText = numberEditText.getText().toString();
                int num = Integer.parseInt(numText);

                String msg = a.checkAnswer(num);

                Toast t = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Toast t = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT);
        t.show();
    }
}