package zombieSim.DigitalDecay.com;

public class ZombieSimThread extends Thread
{
	private boolean bRun = true;
	
	private void Update()
	{
		
	}
	
	private void Render()
	{
		
	}
	
	@Override
	public void run()
	{
		//Main game loop
		while( bRun )
		{
			//TODO: Implement the 2 following methods.
			Update();
			Render();
		}
	}
}
