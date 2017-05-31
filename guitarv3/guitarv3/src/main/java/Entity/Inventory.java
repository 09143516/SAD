package Entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Entity.Instruct;

public class Inventory {
	private List<Instruct> instructs;
	public Inventory() {		
		instructs=new LinkedList<Instruct>();			
	}	
	public Inventory(List<Instruct> instructs) {
		if(instructs.isEmpty()){
			instructs=new LinkedList<Instruct>();
		}else{
			this.instructs=new LinkedList<Instruct>(instructs);
		}
	}
	public void addInstruct(Instruct instruct){						
		instructs.add(instruct);
	}
	public Instruct getInstruct(String serialNumber){
		for(Iterator i=instructs.iterator();i.hasNext();){
			Instruct instruct=(Instruct)i.next();
			if(instruct.getSerialNumber()==serialNumber){
				return instruct;
			}			
		}
		return null;
	}
	public List<Instruct> serach(InstructSpec searchInstructSpec){
		List<Instruct> matchingInstructs=new LinkedList<Instruct>();
		for(Iterator i=instructs.iterator();i.hasNext();){
			Instruct instruct=(Instruct)i.next();			
			InstructSpec instructSpec=instruct.getInstructSpec();
			if(instructSpec.matches(searchInstructSpec)){
				matchingInstructs.add(instruct);
			}		
		}
		return matchingInstructs;
	}
	public List<Instruct> getInstructs() {
		return instructs;
	}
	public void setInstructs(List<Instruct> instructs) {
		this.instructs = instructs;
	}
	
}
