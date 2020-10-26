package Collection.News;

class News
{
	private String title;
	private String writer;
	private String releaseTime;
	private String content;
	
	public News(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getWriter()
	{
		return writer;
	}

	public void setWriter(String writer)
	{
		this.writer = writer;
	}

	public String getReleaseTime()
	{
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime)
	{
		this.releaseTime = releaseTime;
	}

	@Override
	public String toString()
	{
		return title;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		News other = (News) obj;
		if (title == null)
		{
			if (other.title != null) return false;
		} 
		else if (!title.equals(other.title)) return false;
		return true;
	}
}
