package Entity;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Instruct {
	@Id
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id",strategy="assigned")	
	@Column(length=27)
	private String serialNumber;
	private Double price;	
	@Embedded
	private InstructSpec instructSpec;	
	public Instruct() {
		super();		
	}	
	public Instruct(String serialNumber, Double price, InstructSpec instructSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.instructSpec = instructSpec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public InstructSpec getInstructSpec() {
		return instructSpec;
	}
	public void setInstructSpec(InstructSpec instructSpec) {
		this.instructSpec = instructSpec;
	}
	@Override
	public String toString() {
		return "Instruct [serialNumber=" + serialNumber + ", price=" + price + ", instructSpec=" + instructSpec + "]";
	}
	
}
