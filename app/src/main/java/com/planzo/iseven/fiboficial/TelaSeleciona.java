

package com.planzo.iseven.fiboficial;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.planzo.iseven.example.R;

public class TelaSeleciona extends AppCompatActivity {

  private TextView cursoText;
  private TextView TurmaText;

  private static final String[] Cursos = {
          "Analise de sistema", "Direito", "Engenharia", "Medicina", "Biologia", "Sistsema de informação", "Ice Cream Sandwich", "Jelly Bean", "KitKat",
          "Lollipop", "Marshmallow"
  };

  private static final String[] Turma = {
          "1 Semestre", "2 Semestre", "3 Semestre", "4 Semestre", "5 Semestre", "6 Semestre", "8 Semestre", "9 Semestre", "10 Semestre"

  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.tela_seleciona);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);



    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        try {
          startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jaredrummler/Material-Spinner")));
        } catch (ActivityNotFoundException ignored) {
        }
      }
    });

    MaterialSpinner spinner2 = (MaterialSpinner) findViewById(R.id.spinner2);
    spinner2.setItems(Turma);



    MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
    spinner.setItems(Cursos);
    spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

      @Override
      public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
        Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();


      }
    });
    spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

      @Override
      public void onNothingSelected(MaterialSpinner spinner) {
        Snackbar.make(spinner, "Nenhum curso selecionado", Snackbar.LENGTH_LONG).show();

      }
    });






    spinner2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

      @Override
      public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
        Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();

      }
    });
    spinner2.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

      @Override
      public void onNothingSelected(MaterialSpinner spinner2) {
        Snackbar.make(spinner2, "Nenhuma turma selecionada", Snackbar.LENGTH_LONG).show();
      }
    });
  }
}

