
package dao;

import context.DBContext;
import java.util.List;
import model.Fruit;


interface FruitDAO{
    
    List<Fruit> getAllFruit();
    
}
