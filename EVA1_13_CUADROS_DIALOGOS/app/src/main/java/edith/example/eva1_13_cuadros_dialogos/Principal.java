package edith.example.eva1_13_cuadros_dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void clicDialogoDef(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de Diálogo de Android")
                .setMessage("Hola Mundo Cruel")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Botón OK", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Botón NO", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Botón CANCEL", Toast.LENGTH_SHORT).show();
                    }
                })
                .create().show();

    }

    public void clicDialogoProp(View v){
        final Dialog dlgMiDialogo;
        dlgMiDialogo = new Dialog(this);
        //El layout
        dlgMiDialogo.setContentView(R.layout.cuadro_dialogo);
        TextView txtVwTitu;
        final EditText edtTxtCaptu;
        Button btnOk;
        txtVwTitu = dlgMiDialogo.findViewById(R.id.txtVwTitu);
        edtTxtCaptu = dlgMiDialogo.findViewById(R.id.edtTxtCaptu);
        btnOk = dlgMiDialogo.findViewById(R.id.btnOk);
        txtVwTitu.setText("MI CUADRO DE DIALOGO");
        edtTxtCaptu.setHint("Introduce tu nombre");
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edtTxtCaptu.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        dlgMiDialogo.show();
    }
}
