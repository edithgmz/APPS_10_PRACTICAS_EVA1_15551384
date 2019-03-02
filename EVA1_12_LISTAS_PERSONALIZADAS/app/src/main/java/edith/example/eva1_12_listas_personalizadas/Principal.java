package edith.example.eva1_12_listas_personalizadas;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwCiudades;
    Clima[] acClimaCd = {
            new Clima(R.drawable.light_rain, "Delicias", "Despejado", "Seco y polvoriento", 17),
            new Clima(R.drawable.atmospher, "Entre ríos", "Soleado", "Despejado", 24),
            new Clima(R.drawable.cloudy, "Ciudad Juarez", "Nublado", "Nublado con intervalos", 19.3),
            new Clima(R.drawable.rainy, "Cuahutemoc", "Despejado", "Lluvias moderadas", 17),
            new Clima(R.drawable.snow, "Delicias", "Despejado", "Nevadas intensas", -30),
            new Clima(R.drawable.tornado, "Villa Ahumada", "Hollywoodezco", "The day after tomorrow", 28),
            new Clima(R.drawable.thunderstorm, "Chihuahua", "Tormentoso", "Hollywoodezco", 0)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwCiudades = findViewById(R.id.lstVwCiudades);
        lstVwCiudades.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, acClimaCd));
        lstVwCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        clicDialogo(position);
        Toast.makeText(this, acClimaCd[position].getDesc_clima(), Toast.LENGTH_SHORT);
    }

    public void clicDialogo(int i){
        new AlertDialog.Builder(this)
                .setTitle("Clima")
                .setMessage(acClimaCd[i].getDesc_clima())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {}
                }).create().show();
    }
}
