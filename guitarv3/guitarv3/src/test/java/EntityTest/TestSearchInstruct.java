package EntityTest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.InventoryDao;
import Entity.Instruct;
import Entity.InstructSpec;
import Entity.Inventory;
@RunWith(BlockJUnit4ClassRunner.class)
public class TestSearchInstruct {		
	@Test
	public void searchInstruct(){			
		Inventory inventory=init();
		Map searchProperties=new HashMap();
		createMap(searchProperties,"builder","1","model","1","type","1","numString","1",
				"backWood","1","topWood","1");
		InstructSpec searchInstructSpec=new InstructSpec(searchProperties);
		System.out.println(searchInstructSpec);
		List<Instruct> matchingInstructs=inventory.serach(searchInstructSpec);
		if(matchingInstructs.isEmpty()){
			System.out.println("没有你需要的");
		}else{
			System.out.println("你需要的乐器有-");
			for(Iterator i=matchingInstructs.iterator();i.hasNext();){
				Instruct instruct=(Instruct)i.next();
				Map properties=instruct.getInstructSpec().getProperties();				
				if(properties.containsKey("numString")){
					System.out.print("吉他：");
				}else{
					System.out.print("曼陀林：");
				}					
				System.out.print("price="+instruct.getPrice()+
						" serialNumber="+instruct.getSerialNumber());
				for(Iterator a=properties.keySet().iterator();a.hasNext();){
					String name=(String)a.next();
					System.out.print(" "+name+"="+properties.get(name));
				}
				System.out.println();
			}
		}
	}	
	public static Inventory init(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");		 
		InventoryDao inventoryDao=(InventoryDao)ac.getBean("inventoryDao");
		List<Instruct> list=inventoryDao.findAll();
		Inventory inventory=new Inventory(list);
		return inventory;
		
	}
	public static void createMap(Map map,String a,String aValue,String b,
			String bValue,String c,String cValue,String d,String dValue,
			String e,String eValue,String f,String fValue){
		map.put(a, aValue);
		map.put(b, bValue);
		map.put(c, cValue);
		map.put(d, dValue);
		map.put(e, eValue);
		map.put(f, fValue);
	}
}
