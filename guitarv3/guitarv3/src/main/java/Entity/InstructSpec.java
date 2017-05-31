package Entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;


@Embeddable
public class InstructSpec {	
	@ElementCollection(fetch=FetchType.EAGER)
	@Column(length=18)	
	private Map<String,String> properties;	
	public InstructSpec() {
		super();
	}	
	public InstructSpec(Map properties) {
		if(properties.isEmpty()){
			this.properties=new HashMap();
		}
		else{
			this.properties=new HashMap(properties);
		}
	}
	public boolean matches(InstructSpec otherSpec){
		for(Iterator i=properties.keySet().iterator();i.hasNext();){
			String propertyName=(String)i.next();
			if(!properties.get(propertyName).equals(otherSpec.getProperties().get(propertyName))){
				return false;
			}
		}
		return true;
	}
	public Map<String,String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String,String> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "InstructSpec [properties=" + properties + "]";
	}
	
}
