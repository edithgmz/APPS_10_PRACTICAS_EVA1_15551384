package edith.example.eva1_11_ciclo_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    /*FOREGROUND --> Visible para el usuario*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toast.makeText(this, "onCreate - Inicialización", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart - Jale de la UI", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume - Reconectar", Toast.LENGTH_SHORT).show();
    }
    /*BACKGROUND*/
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause - Duración breve", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop - Trabajo pesado de liberación", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy - Duración breve", Toast.LENGTH_SHORT).show();
    }
    /*TRANSICIÓN*/
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart - Paso de background a foreground", Toast.LENGTH_SHORT).show();
    }
}
