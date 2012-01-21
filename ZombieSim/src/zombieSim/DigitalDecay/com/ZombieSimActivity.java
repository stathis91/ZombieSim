package zombieSim.DigitalDecay.com;

import android.app.Activity;
import android.os.Bundle;

public class ZombieSimActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		//We don't want the default Stage to be shown.
		//setContentView( R.layout.main );
		//We want our own custom one:
		this.setContentView( new ZombieSimStage( this ) );
	}
}