package dungeoncrawler.builder.impl.simple;

import dungeoncrawler.builder.Entity;
import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleLocation implements Location
{
	private final String name;
	private final String description;
	private final List<Portal> portals;
	private final List<Entity> entities;

	public SimpleLocation(String name, String description)
	{
		this.name = name;
		this.description = description;
		this.portals = new ArrayList<>();
		this.entities = new ArrayList<>();
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public List<Portal> getPortals()
	{
		return Collections.unmodifiableList(portals);
	}

	@Override
	public List<Entity> getEntities()
	{
		return Collections.unmodifiableList(entities);
	}

	public void addPortal(Portal portal)
	{
		portals.add(portal);
	}

	public void addEntity(Entity entity)
	{
		entities.add(entity);
	}

	public void removeEntity(Entity entity)
	{
		entities.remove(entity);
	}
}
