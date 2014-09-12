package com.example.cervabarata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaInicial extends Activity {

	private final int duracao_da_tela_inicial = 5000;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_abertura);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent minhaAcao = new Intent(TelaInicial.this,
						MainActivity.class);
				TelaInicial.this.startActivity(minhaAcao);
				TelaInicial.this.finish();
			}
		}, duracao_da_tela_inicial);
	}
}
