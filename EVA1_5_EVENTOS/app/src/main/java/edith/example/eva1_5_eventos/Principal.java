package edith.example.eva1_5_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    Button btnListener, btnClaseAn, btnClaseExt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);

        //Evento implementado por clase anónima
        btnClaseAn = findViewById(R.id.btnClaseAn);
        btnClaseAn.setOnClickListener(new View.OnClickListener() { //Rápido pero no reutilizable
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Evento generado por clase anónima", Toast.LENGTH_SHORT).show();
            }
        });

        btnClaseExt = findViewById(R.id.btnClaseExt);
        btnClaseExt.setOnClickListener(this);

        //Evento implementado por clase externa
        MiListener mlClick = new MiListener(this);
        btnClaseExt.setOnClickListener(mlClick);
    }

    public void onClickXML (View v){
        Toast.makeText(this, "Evento generado por propiedad onClick", Toast.LENGTH_SHORT).show();
    }

    public void onClick (View view){
        Toast.makeText(this, "Evento generado por Listener", Toast.LENGTH_SHORT).show();
    }
}
