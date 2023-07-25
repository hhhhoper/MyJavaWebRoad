import java.sql.*;
public class JDBC {
     public static void main(String[]args) throws Exception{
    	  Connection conn=null;
       Statement stmt=null;
       ResultSet rs=null;
       try{
          //1.加载数据库驱动
          Class.forName("com.mysql.jdbc.Driver");
          //2.通过DrivierManager获取数据库连接
          String url="jdbc:mysql://localhost:3306/jdbc";
          String username="root";
          String password="123";
          conn=DriverManager.getConnection(url, username, password);
          //3.通过Connection对象获取Statement对象
          stmt=conn.createStatement();
          //4.使用Statement执行SQL语句
          String sql="select* from tb_user";
          rs=stmt.executeQuery(sql);
          //5.操作ResultSet结果集
          System.out.println("id   |    name |    sex "+"  |    email     |    birthday");
          while(rs.next()){
               int id=rs.getInt("id");
               String name=rs.getString("name");
               String sex=rs.getString("sex");
               String email=rs.getString("email");
               String birthday=rs.getString("birthday");
               System.out.println(id+"   |    "+name+" |    "+sex+"  |    "+email+"     |    "+birthday);

          }
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          //6.关闭连接,释放资源
          if(rs!=null){rs.close();}
          if(stmt!=null){rs.close();}
          if(conn!=null){rs.close();}
       }
     }
     
}
