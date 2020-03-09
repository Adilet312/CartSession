
package book.data;
import java.sql.*;
import java.util.*;
import book.business.Product;
/**
 *
 * @author amt
 */
public class ProductDB 
{
    
    public static Product getProductByCode(String productCode)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Product "
                       + "WHERE ProductCode = ?";
        try 
        {
           ps = connection.prepareStatement(query);
           ps.setString(1,productCode);
           rs = ps.executeQuery();
           if(rs.next())
           {
               Product product = new Product();
               product.setProductId(rs.getLong("ProductId"));
               product.setCode(rs.getString("ProductCode"));
               product.setName(rs.getString("ProductName"));
               product.setDescription(rs.getString("ProductDesc"));
               product.setPrice(rs.getDouble("ProductPrice"));
               return product;
           }
           else
           {
               return null;
           }
        }
        catch(SQLException e)
        {
            System.err.println(e);
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
   
    public static Product getProductById(Long givenId)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
                String query = "SELECT * FROM Product "
                       + "WHERE ProductId = ?";
        try 
        {
           ps = connection.prepareStatement(query);
           ps.setLong(1,givenId);
           rs = ps.executeQuery();
           if(rs.next())
           {
               Product product = new Product();
               product.setProductId(rs.getLong("ProductId"));
               product.setCode(rs.getString("ProductCode"));
               product.setName(rs.getString("ProductName"));
               product.setDescription(rs.getString("ProductDesc"));
               product.setPrice(rs.getDouble("ProductPrice"));
               return product;
           }
           else
           {
               return null;
           }
        }
        catch(SQLException e)
        {
            System.err.println(e);
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        
    }
    
    public static ArrayList<Product> getAllProducts()
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Product ";
        try 
        {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Product> products = new ArrayList<>();
            while(rs.next())
            {
                Product product = new Product();
                product.setProductId(rs.getLong("ProductId"));
                product.setCode(rs.getString("ProductCode"));
                product.setName(rs.getString("ProductName"));
                product.setDescription(rs.getString("ProductDesc"));
                product.setPrice(rs.getDouble("ProductPrice"));
                products.add(product);
                
            }
            return products;
        }
                catch(SQLException e)
        {
            System.err.println(e);
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
}
