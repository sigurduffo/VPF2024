package dungeoncrawler.impl;

import dungeoncrawler.*;
import dungeoncrawler.impl.actions.Move;

import java.util.ArrayList;
import java.util.List;

public class
EntityImpl implements Entity
{
	private String name;
	private Location location;
	private EntityCtrl controller;

	public EntityImpl(String name, EntityCtrl controller)
	{
		this.name = name;
		this.controller = controller;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public Location getLocation()
	{
		return location;
	}

	@Override
	public void setLocation(Location location)
	{
		this.location = location;
		System.out.println(name + " is now at " + location.getName());
	}

	@Override
	public void move(Portal portal)
	{
		Location destination = portal.getDestination();
		location.removeEntity(this);
		destination.addEntity(this);
		setLocation(destination);
	}

	@Override
	public List<Action> getPossibleActions()
	{
		List<Action> actions = new ArrayList<>();
		for (Portal portal : location.getPortals())
		{
			actions.add(new Move(this, portal));
		}
		return actions;
	}

	@Override
	public EntityCtrl getController()
	{
		return controller;
	}
}
