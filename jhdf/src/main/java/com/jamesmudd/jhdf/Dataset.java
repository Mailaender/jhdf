package com.jamesmudd.jhdf;

import java.util.Map;

public class Dataset implements Node {

	private final String name;
	private final Group parent;

	public Dataset(String name, Group parent) {
		this.name = name;
		this.parent = parent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGroup() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Node> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPath() {
		return parent.getPath() + "/" + name;
	}

}
