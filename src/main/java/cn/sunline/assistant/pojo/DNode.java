package cn.sunline.assistant.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;


public class DNode implements Cloneable,Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String desc;
	private int line;
	private Map<String, Object> attributes = new HashMap<String, Object>();
	private List<DNode> childs = new LinkedList<DNode>();
	
	public DNode()
	{
		
	}
	
	public int getNodeLevel(int level)
	{
		if (childs.size() > 0) level ++;
		for (DNode child : childs)
		{
			int temp = child.getNodeLevel(level);
			if (temp > level) level = temp;
		}
		
		return level;
	}
	
	
	public int getNodeLevel()
	{
		return getNodeLevel(0);
	}
	
	public String getRandomId()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}
	
	@SuppressWarnings("unchecked")
	public void putData(Map data)
	{
		Iterator<String> iter = data.keySet().iterator(); 
		while (iter.hasNext())
		{
			String key = iter.next();
			Object val = data.get(key);
			if (val instanceof String)
			{
				attributes.put(key,(String) val);
			}
		}
	}

	public void putAll(Map<String, String> record)
	{
		attributes.putAll(record);
	}
	
	
	public DNode(String name)
	{
		this.name = name;
	}
	
	public DNode(String name, String...paras)
	{
		this(name);
		for (int i = 0; i < paras.length; i = i + 2)
		{
			this.attributes.put(paras[i], paras[i+1]);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	public List<DNode> getChilds() {
		return childs;
	}
	public void setChilds(List<DNode> childs) {
		this.childs = childs;
	}


	@Override
	public DNode clone()
	{
		DNode Node = new DNode(this.name);
		Node.desc = this.desc;
		Node.getAttributes().putAll(this.getAttributes());
		for (DNode child : getChilds())
		{
			Node.getChilds().add(child.clone());
		}
		return Node;
	}

	public DNode findChildElement(String... attris)
	{
		return findChildElement(this,attris);
	}
	
	public DNode findChildElementById(String id)
	{
		return findChildElement("id", id);
	}
	
	public DNode findChildElement(DNode elem, String... attris)
	{
		if (attris == null || attris.length % 2 != 0) return null;
		
		if (elem.getAttributes() != null)
		{
			int same = 0;
			for (int i = 0; i < attris.length; i = i + 2)
			{
				if (elem.getAttributes().containsKey(attris[i]))
				{
					String value = elem.getAttributes().get(attris[i]).toString();
					if (value == null || attris[i + 1] == null) same++;
					
					if (value.equals(attris[i + 1])) same++;
				}
				else
					break;
			}
			
			if (same == attris.length / 2) return elem;
		}
		
		
		for (DNode item : elem.getChilds())
		{
			DNode child = findChildElement(item, attris);
			if (child != null) return child;
		}
		
		return null;
	}

	public boolean getChildPaths(DNode parent, DNode elem, List<DNode> nodes)
	{
		for (DNode child : parent.getChilds())
		{
			if (child == elem)
			{
				nodes.add(parent);
				return true;
			}
			else
			{
				boolean fetch = getChildPaths(child, elem, nodes);
				if (fetch)
				{
					nodes.add(parent);
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	
	public void loadChildElements(DNode elem, List<DNode> nodes, String... attris)
	{
		if (attris == null || attris.length % 2 != 0) return;
		boolean fetch = false;
		if (elem.getAttributes() != null)
		{
			int same = 0;
			for (int i = 0; i < attris.length; i = i + 2)
			{
				if (elem.getAttributes().containsKey(attris[i]))
				{
					String value = elem.getAttributes().get(attris[i]).toString();
					if (value == null || attris[i + 1] == null) same++;
					if (value.equals(attris[i + 1])) same++;
				}
				else
					break;
			}
			if (same == attris.length / 2) fetch  = true;
		}
		if (fetch)
		{
			nodes.add(elem);
		}
		else
		{
			for (DNode item : elem.getChilds())
			{
				loadChildElements(item, nodes, attris);					
			}
		}
	}


	@Override
	public String toString() {
		return "DNode [id=" + id + ", name=" + name + ", desc=" + desc + ", line=" + line + ", attributes=" + attributes
				+ ", childs.size()=" + childs.size() + ", childs=" + childs + "]\r\n";
	}

	public String toJsonString(){
		return JSON.toJSONString(this);
	}


	public DNode findChildElementByTag(String tag)
	{
		for (DNode child : this.getChilds())
		{
			if (child.getName().equals(tag)) return child;
		}
		
		return null;
	}
}
