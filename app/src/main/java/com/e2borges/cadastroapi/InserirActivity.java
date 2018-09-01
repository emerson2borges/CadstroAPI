package com.e2borges.cadastroapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;

public class InserirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);

        final EditText editTextFirstName = findViewById(R.id.edt_Nome);
        final EditText editTextLastName = findViewById(R.id.edt_Sobrenome);

        Button botaoInserir = findViewById(R.id.btn_Inserir);

        botaoInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Person person = new Person();
                Call<Person> call = new RetrofitConfig().getPersonService().addPerson(person);

                person.setFirstName(editTextFirstName.getText().toString());
                person.setLastName(editTextLastName.getText().toString());

                call = new RetrofitConfig().getPersonService().addPerson(person);
            }
        });
    }
}
