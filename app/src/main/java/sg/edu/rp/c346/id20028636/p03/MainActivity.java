package sg.edu.rp.c346.id20028636.p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgbt;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgbt = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioButtonGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    stringResponse = "He says " + etInput.getText().toString();

                }
                else{
                    stringResponse = "She says " + etInput.getText().toString();

                }

                tvDisplay.setText(stringResponse);

            }
        });

        tgbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tgbt.isChecked()){
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }

            }
        });





    }
}