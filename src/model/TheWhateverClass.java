package model;

public class TheWhateverClass
{
	private String description;
	private int clickCount;
	
	public String getDesciption()
	{
		return description;
	}

	public void setDesciption(String desciption)
	{
		this.description = desciption;
	}

	public int getClickCount()
	{
		return clickCount;
	}

	public void setClickCount(int clickCount)
	{
		this.clickCount = clickCount;
	}

	public TheWhateverClass()
	{
		this.description = "blank";
		this.clickCount = -10;
	}
}
