import java.util.*;

public class HangHungryManModel extends HangHungryMan
{
	// properties
	private ArrayList<HungryManView> views;

	
	// constructors
	public HangHungryManModel()
	{
		views = new ArrayList<HungryManView>();
	}

	// methods
	@Override
	public int tryChar( char chr)
	{
		int result = super.tryChar( chr);
		recognizeViews();
		return result;
	}

	public void addView( HungryManView view)
	{
		views.add( view);
		if ( view != null)
		{
			view.update();
		}	
	}

	public void recognizeViews()
	{
		if ( views != null)
		{
			for ( int i = 0; i < views.size(); i++)
			{
				views.get(i).update();
			}
		}
	}
}