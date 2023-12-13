/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Fruit;

/**
 *
 * @author bravee06
 */
public class FruitDAOImpl extends DBContext implements FruitDAO {

    @Override
    public List<Fruit> getAllFruit() {
        List<Fruit> fruits = new ArrayList<>();  
        CategoryDAOImpl cdi = new CategoryDAOImpl();
        String query = "select * from Fruit";
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString(2);
                String image = rs.getString(3);
                int categoryId = rs.getInt(4);
                double price = rs.getDouble(5);
                String description = rs.getString(6);
                Category category = cdi.findById(categoryId);
                fruits.add(new Fruit(name,image,category, price, description));
            }
            return fruits;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return null;
    }
    
    
    
    
    public static void main(String[] args) {
        FruitDAOImpl test = new FruitDAOImpl();
        System.out.println(test.getAllFruit());;
    }
    
}
