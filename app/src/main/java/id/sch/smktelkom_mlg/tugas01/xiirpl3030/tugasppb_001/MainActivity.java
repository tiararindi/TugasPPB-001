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

        ////////////////////////////////////////////////
        RgJk = (RadioGroup) findViewById(R.id.radioGroup);
        RBl = (RadioButton) findViewById(R.id.rbLaki);
        RBp = (RadioButton) findViewById(R.id.rbPerempuan);

        spKelas = (Spinner) findViewById(R.id.spKelas);
        spPil = (Spinner) findViewById(R.id.spPil);

        cbsen = (CheckBox) findViewById(R.id.cbSen);
        cbsel = (CheckBox) findViewById(R.id.cbSel);
        cbrab = (CheckBox) findViewById(R.id.cbRab);
        cbkam = (CheckBox) findViewById(R.id.cbKam);
        cbjum = (CheckBox) findViewById(R.id.cbJum);
        cbsab = (CheckBox) findViewById(R.id.cbSab);
        cbmin = (CheckBox) findViewById(R.id.cbMin);


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
            String nama = ETnama.getText().toString();
            String tl = ETtl.getText().toString();
            String tt = ETtt.getText().toString();
            String al = ETal.getText().toString();
            String as = ETas.getText().toString();
            String hp = EThp.getText().toString();

            /*Tvnama.setText(nama);
            Tvtl.setText(tl);
            Tvtt.setText(tt);
            Tval.setText(al);
            Tvas.setText(as);
            Tvhp.setText(hp);*/


            hsl = "Hari Les : ";
            int startlen = hsl.length();
            if (cbsen.isChecked()) hsl += cbsen.getText() + "\n";
            if (cbsel.isChecked()) hsl += cbsel.getText() + "\n";
            if (cbrab.isChecked()) hsl += cbrab.getText() + "\n";
            if (cbkam.isChecked()) hsl += cbkam.getText() + "\n";
            if (cbjum.isChecked()) hsl += cbjum.getText() + "\n";
            if (cbsab.isChecked()) hsl += cbsab.getText() + "\n";
            if (cbmin.isChecked()) hsl += cbmin.getText() + "\n";

            if (hsl.length() == startlen) hsl += "Tidak ada pada pilihan";

            hsll = null;
            if (RgJk.getCheckedRadioButtonId() != -1) {
                RadioButton rb = (RadioButton)
                        findViewById(RgJk.getCheckedRadioButtonId());
                hsll = rb.getText().toString();
            }
            if (hsll == null) {
                hasil.setText("Belum Memilih Jenis Kelamin");
            }

            hasil.setText("Nama : " + nama + "\n" +
                    "Tempat Lahir : " + tl + "\n" +
                    "Tanggal Lahir : " + tt + "\n" +
                    "Jenis Kelamin : " + hsll + "\n" +
                    "Alamat : " + al + "\n" +
                    "Asal Sekolah : " + as + "\n" +
                    "No HP : " + hp + "\n" +
                    "Kelas : " + spKelas.getSelectedItem().toString() + "\n" +
                    hsl + "\n" +
                    "Pilihan Paket : " + spPil.getSelectedItem().toString());
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = ETnama.getText().toString();
        String tl = ETtl.getText().toString();
        String tt = ETtt.getText().toString();
        String al = ETal.getText().toString();
        String as = ETas.getText().toString();
        String hp = EThp.getText().toString();


        if (nama.isEmpty()) {
            ETnama.setError("Nama Belum Diisi");
            valid = true;
        } else {
            ETnama.setError(null);
        }

        if (tl.isEmpty()) {
            ETtl.setError("Tempat Lahir Belum Diisi");
            valid = true;
        } else {
            ETtl.setError(null);
        }

        if (tt.isEmpty()) {
            ETtt.setError("Tanggal Lahir Belum Diisi");
            valid = true;
        } else {
            ETtt.setError(null);
        }

        if (al.isEmpty()) {
            ETal.setError("Alamat Belum Diisi");
            valid = true;
        } else {
            ETal.setError(null);
        }

        if (as.isEmpty()) {
            ETas.setError("Asal Sekolah Belum Diisi");
            valid = true;
        } else {
            ETas.setError(null);
        }

        if (hp.isEmpty()) {
            EThp.setError("No Hp Belum Diisi");
            valid = true;
        } else {
            EThp.setError(null);
        }
        return valid;
    }
    }