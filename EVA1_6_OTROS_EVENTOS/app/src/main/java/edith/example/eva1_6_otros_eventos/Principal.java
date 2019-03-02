package edith.example.eva1_6_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdGrpProfes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGrpProfes = findViewById(R.id.rdGrpProfes);
        rdGrpProfes.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdBtnMartina) {
            Toast.makeText(this, "100", Toast.LENGTH_SHORT).show();
        } else if(i == R.id.rdBtnArzola) {
            Toast.makeText(this, "75", Toast.LENGTH_SHORT).show();
        } else if(i == R.id.rdBtnRuben) {
            Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
        } else if(i == R.id.rdBtnTalavera) {
            Toast.makeText(this, "-50", Toast.LENGTH_SHORT).show();
        } else if(i == R.id.rdBtnLorena) {
            Toast.makeText(this, "45", Toast.LENGTH_SHORT).show();
        }
    }
}
