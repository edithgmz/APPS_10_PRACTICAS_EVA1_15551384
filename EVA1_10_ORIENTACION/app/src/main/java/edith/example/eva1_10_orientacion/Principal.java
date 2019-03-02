package edith.example.eva1_10_orientacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVxMensa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVxMensa = findViewById(R.id.txtVwMensa);
        int iVal = (int)(Math.random() * 100);
        txtVxMensa.setText(iVal + ""); //Si no se pone "" va a detectar el valor como un ID de recurso
    }
}
