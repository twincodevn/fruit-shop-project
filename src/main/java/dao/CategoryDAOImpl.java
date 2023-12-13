/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Category;

/**
 *
 * @author bravee06
 */
public class CategoryDAOImpl extends DBContext implements CategoryDAO{

    @Override
    public Category findById(int id) {
        String query = "select * from Category where id = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new Category(id,rs.getString(2));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        CategoryDAOImpl test = new CategoryDAOImpl();
        System.out.println(test.findById(2));
    }
    
}
