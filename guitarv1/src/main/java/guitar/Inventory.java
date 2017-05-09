package guitar;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import JDBC.sqlitejdbc;
import guitar.guitar;

public class Inventory {
  private LinkedList guitars;
  private String sql;
  private PreparedStatement pstmt;
  public Inventory() {
    guitars = new LinkedList();
  }

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    guitar guitar = new guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  public guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      guitar guitar = (guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  public List<guitar> guitarList(){
	  sql="select * from guitar;";  
	  try {
			pstmt =sqlitejdbc.getConnection().prepareStatement(sql);      			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				String serialNumber = rs.getString("serialNumber");
				double price = rs.getDouble("price");
		        String builder = rs.getString("builder");
		        String model = rs.getString("model");
		        String type = rs.getString("type");
		        String backWood = rs.getString("backWood");
		        String topWood = rs.getString("topWood");
		        guitar guitar=new guitar(serialNumber,price,builder,model,type,backWood,topWood);
				guitars.add(guitar);			    
			}
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return guitars;
	
}
  public guitar search(guitar searchGuitar){
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
    	guitar guitar = (guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}