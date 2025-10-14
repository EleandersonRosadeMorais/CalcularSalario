package br.com.ulbra.calcularsalarios;

import android.os.Bundle;
import android.app.AlertDialog;
import android.widget.*;
import android.view.*;
import androidx.appcompat.app.AppCompatActivity;

public class SalarioActivity extends AppCompatActivity {
    RadioGroup rgopcoes;
    Button btcalcular;
    EditText edsalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        edsalario = (EditText) findViewById(R.id.edsalario);
        rgopcoes = (RadioGroup) findViewById(R.id.rgopcoes);
        btcalcular = (Button) findViewById(R.id.btcalcular);

        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (edsalario.getText().toString().isEmpty()) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);
                    dialogo.setTitle("Atenção");
                    dialogo.setMessage("Por favor, digite seu salário!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                    return;
                }

                double salario = Double.parseDouble(edsalario.getText().toString());
                int op = rgopcoes.getCheckedRadioButtonId();
                double novo_salario = 0;

                if (op == -1) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);
                    dialogo.setTitle("Atenção");
                    dialogo.setMessage("Por favor, selecione um percentual!");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                    return;
                }

                if (op == R.id.rb_neg30)
                    novo_salario = salario - (salario * 0.3);
                else if (op == R.id.rb_neg15)
                    novo_salario = salario - (salario * 0.15);
                else if (op == R.id.rb20)
                    novo_salario = salario + (salario * 0.2);
                else if (op == R.id.rb40)
                    novo_salario = salario + (salario * 0.4);
                else if (op == R.id.rb60)
                    novo_salario = salario + (salario * 0.6);
                else
                    novo_salario = salario;

                String valorFormatado = String.format("%.2f", novo_salario).replace(".", ",");

                AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);
                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Seu novo salário é: R$ " + valorFormatado);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}