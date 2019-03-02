package edith.example.eva1_9_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwTitu;
    TextView txtVwDesc;
    static String[] asLibros = {"Futu.re", "Metro 2033", "L3"};
    static String[] asSinopsis = {"En el siglo XXV, la humanidad ha alcanzado la inmortalidad gracias al " +
            "agua viva, el agua vital que se reparte de manera gratuita entre la " +
            "población de la Europa Unida. La muerte ya no existe, pero la " +
            "superpoblación ha convertido en limitados algunos recursos, como el " +
            "aire y el espacio.\n\n" +
            "En dicho mundo, cuando una persona quiere tener un hijo debe " +
            "administrarse una inyección de vejez para morir y dejar lugar a su " +
            "sucesor. Naturalmente, hay quien intenta tener hijos de manera " +
            "clandestina y conservar la inmortalidad. La Falange es la organización " +
            "policial encargada de perseguir a estos disidentes.\n\n" +
            "Yan es uno de los Inmortales, como también se conoce a los " +
            "miembros de la Falange. Un día recibe un singular encargo: asesinar " +
            "al número dos de una formación política clandestina que lucha por el " +
            "derecho de los ciudadanos a tener hijos libremente.\n\n" +
            "Futu.re es probablemente la novela más madura de Dmitry " +
            "Glukhovsky. Ambientada en parte en una Barcelona futurista, trata " +
            "temas tan de actualidad como los derechos de los ciudadanos o la " +
            "sobrexplotación de los recursos naturales por parte del ser humano.\n\n" +
            "Una novela que recupera los grandes temas del género y que está a " +
            "la altura de clásicos como Fahrenheit 451 o 1984.", "L2", "L3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstVwTitu = findViewById(R.id.lstVwTitu);
        txtVwDesc = findViewById(R.id.txtVwDesc);

        lstVwTitu.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1, asLibros));

        lstVwTitu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwDesc.setText(asSinopsis[position]);
    }
}
