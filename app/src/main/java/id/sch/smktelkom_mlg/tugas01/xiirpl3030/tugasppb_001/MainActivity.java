package id.sch.smktelkom_mlg.tugas01.xiirpl3030.tugasppb_001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ETnama, ETtl, ETtt, ETal, ETas, EThp;
    Button BtOk;
    TextView hasil;
    RadioGroup RgJk;
    RadioButton RBl, RBp;
    Spinner spKelas, spPil;
    String Pil, Kel, hsl, hsll;
    CheckBox cbsen, cbsel, cbrab, cbkam, cbjum, cbsab, cbmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETnama = (EditText) findViewById(R.id.etNama);
        ETtl = (EditText) findViewById(R.id.etTempat);
        ETtt = (EditText) findViewById(R.id.etTanggal);
        ETal = (EditText) findViewById(R.id.etAlamat);
        ETas = (EditText) findViewById(R.id.etAsal);
        EThp = (EditText) findViewById(R.id.etNo);

        hasil = (TextView) findViewById(R.id.Hasil);

        BtOk = (Button) findViewById(R.id.bOk);

        BtOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DoProses();
            }
        });
    }

    private void DoProses() {
        if (isValid()) {
        }
    }

    private boolean isValid() {
        return false;
    }
}