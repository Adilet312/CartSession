package book.data;

import java.sql.*;

import book.business.OrderDetail;
import java.util.ArrayList;
import java.util.List;
public class OrderDetailDB
{
    public static int insert(OrderDetail orderDetail)
    {
        ConnectionPool pool =  ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "INSERT INTO OrderDetail (ProductId, Quantity) "
                     + "VALUES (?,?)";
        try
        {
            ps = connection.prepareStatement(query);
            ps.setLong(1,orderDetail.getProduct().getProductId());
            ps.setInt(2, orderDetail.getQuantity());
            return ps.executeUpdate();
        }
        catch (SQLException e)
        {
            System.err.println(e);
            return 0;
        }
        finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
   
}
