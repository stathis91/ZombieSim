package zombieSim.DigitalDecay.com;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ZombieSimStage extends SurfaceView implements SurfaceHolder.Callback
{
	private ZombieSimThread mainthread;
	
	
	public ZombieSimStage( Context context )
    {
	    super( context );
	    
	    this.getHolder().addCallback( this );
	    this.setFocusable( true );
	    
	    mainthread = new ZombieSimThread();
    }

	@Override
    public void surfaceChanged( SurfaceHolder holder, int iFormat, int iWidth, int iHeight )
    {
	    
    }

	@Override
    public void surfaceCreated( SurfaceHolder holder )
    {
		//Fire up the game loop!
	    mainthread.start();
    }

	@Override
    public void surfaceDestroyed( SurfaceHolder holder )
    {
	    try
	    {
	    	mainthread.join();
	    }
	    catch( InterruptedException e )
	    {
	    	//TODO: proper error logging.
	    	Log.d( "Game", "Thread failed to stop." );
	    }
    }
	
	@Override
	public boolean onTouchEvent( MotionEvent event )
	{
		if( event.getAction() == MotionEvent.ACTION_DOWN )
		{
			//Our user pressed the screen somewhere! Log the coordinates for now..
			Log.d( "Game", "User pressed the following coordinates: " + event.getX() + ", " + event.getY() );
		}
		
		return super.onTouchEvent( event );
	}
	
	@Override
	protected void onDraw( Canvas canvas )
	{
		
	}
	
}
