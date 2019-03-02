package edith.example.eva1_5_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiListener implements View.OnClickListener {
    Context cnt;
    public MiListener(Context cnt){
        this.cnt = cnt;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(cnt, "Evento generado por MiListener", Toast.LENGTH_SHORT).show();
    }
}
