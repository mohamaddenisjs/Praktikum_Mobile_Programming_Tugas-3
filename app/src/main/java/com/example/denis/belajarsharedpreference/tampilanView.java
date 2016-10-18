package com.example.denis.belajarsharedpreference;

import java.util.HashMap;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.Html;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;
public class tampilanView extends AppCompatActivity {
    // Session Manager Class
    SessionManager session;
    // Button Submit
    Button btnsubmit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_view);
        // Session class instance
        session = new SessionManager(getApplicationContext());
        TextView lblNamaAnda = (TextView) findViewById(R.id.lblNamaAnda);
        TextView lblNim = (TextView) findViewById(R.id.lblNim);
        // Button submit
        btnsubmit = (Button) findViewById(R.id.btnSubmit);
        HashMap<String, String> user = session.getTampilan();
        // nama
        String nama = user.get(SessionManager.KEY_NAMA_ANDA);
        // email
        String nim = user.get(SessionManager.KEY_NIM);
        // menampilkan user data
        lblNamaAnda.setText(Html.fromHtml("Nama: <b>" + nama + "</b>"));
        lblNim.setText(Html.fromHtml("NIM: <b>" + nim + "</b>"));
    }
}
