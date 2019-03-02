package edith.example.eva1_7_eventos_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEs, rdBtnEn;
    TextView txtVwNom, txtVwApe;
    EditText edtTxtNom, edtTxtApe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtApe = findViewById(R.id.edtTxtApe);

        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdBtnEs) {
            rdBtnEs.setText(R.string.idioma_es_es);
            rdBtnEn.setText(R.string.idioma_en_es);
            txtVwNom.setText(R.string.nom_es);
            txtVwApe.setText(R.string.ape_es);
            edtTxtNom.setText(R.string.hint_nom_es);
            edtTxtApe.setText(R.string.hint_ape_es);
        } else if(i == R.id.rdBtnEn) {
            rdBtnEs.setText(R.string.idioma_es_en);
            rdBtnEn.setText(R.string.idioma_en_en);
            txtVwNom.setText(R.string.nom_en);
            txtVwApe.setText(R.string.ape_en);
            edtTxtNom.setText(R.string.hint_nom_en);
            edtTxtApe.setText(R.string.hint_ape_en);
        }
    }
}
