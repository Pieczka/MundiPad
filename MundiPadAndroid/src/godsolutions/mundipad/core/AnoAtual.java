package godsolutions.mundipad.core;

import android.R;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextSwitcher;

public class AnoAtual {
	private static final int ANO_INICIAL = 1;
	private TextSwitcher mAnoAtual;
	private Integer mAno = 0;
	private Handler mHandler = new Handler();
	
	public AnoAtual() {
		mAno = ANO_INICIAL;
		iniciar();
	}

	private void iniciar() {
		mAnoAtual = (TextSwitcher) findViewById(R.id.tsAnoAtual);

		// Start lengthy operation in a background thread
		new Thread(new Runnable() {
			public void run() {
				SystemClock.sleep(20);
				mHandler.post(new Runnable() {
					public void run() {
						mAnoAtual.setText( mAno.toString() );
					}
				});
			}
		}).start();
	}
}