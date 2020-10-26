package Genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DAO<T>
{
	private Map<String, T> map = new HashMap<String, T>();
	
	public void save(String id, T entity)
	{
		map.put(id, entity);
	}
	
	public T get(String id)
	{
		return map.get(id);
	}
	
	public void update(String id, T entity)
	{
		map.replace(id, entity);
	}
	
	public List<T> list()
	{
		Collection<T> c = map.values();
		List<T> list = new ArrayList<T>(c);
		return list;
	}
	
	public void delete(String id)
	{
		map.remove(id);
	}
}
