package edith.example.eva1_2_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVwMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMensaje = findViewById(R.id.txtVwMensaje);
        txtVwMensaje.setText(R.string.mi_texto);
    }
}
