import java.sql.*;
 class Iqquser {
     static PreparedStatement prestmt=null;
     static Connection conn=null;
     static ResultSet rs=null;
     //查询用户
     public static Boolean findUser(String qqnumber,String pwd) throws SQLException{
                try{
                    //1.加载数据库驱动
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/jdbc";
                    String username="root";
                    String password="123";
                    //2.获取数据库连接
                    conn=DriverManager.getConnection(url, username, password);
                    //3.定义需要执行的SQL
                    String sql="select * from tb_qquser"
                    +"where qqnumber=?"
                    +"and pwt=?";
                    //4.创建PrepareadStatement对象
                    prestmt=conn.prepareStatement(sql);
                    prestmt.setString(1,qqnumber);
                    prestmt.setString(2, pwd);
                    //5.执行SQL并将获取的数据信息存放在ResultSet中
                    rs=prestmt.executeQuery();
                    //如果查询结果集中有超过一条记录，则登陆成功
                    if(rs.next()){return true;}
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    if(rs!=null){rs.close();}
                    if(prestmt!=null){prestmt.close();}
                    if(conn!=null){conn.close();}
                }
                return false;
     }
     public static void main(String[] args) throws SQLException{
          System.out.println("输入是否正确"+findUser("123456789","123"));
          System.out.println("输入是否正确"+findUser("12346789","123"));

     }
}
