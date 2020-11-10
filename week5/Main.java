
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        DBConnection();
           // insert("big","ben","BigBen@example.com");
       // dropById(6);
        updateTable("big","ben","BigBen@example.com",11);
       Select("user");

    }

    public static Connection DBConnection(){
        Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pool";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
                connection = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static  void insert(String name,String last_name,String email) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBConnection();
        try {
            String qwery = "INSERT INTO USER (NAME , LAST_NAME, EMAIL)  VALUES (?,?,?);";
             preparedStatement = connection.prepareStatement(qwery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setString(3, email);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void dropById(int id){
        PreparedStatement preparedStatement = null;
        Connection connection = DBConnection();

        try {
            String qwery = "delete from  user where id = ?";
             preparedStatement = connection.prepareStatement(qwery);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public  static  void Select(String name){
         Connection connection = DBConnection();
        Statement statement = null;
        try {
             statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from " + name);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String names = resultSet.getString(2);
                String last_name = resultSet.getString(3);
                String email = resultSet.getString(4);
                System.out.println(id);
                System.out.println(names);
                System.out.println(last_name);
                System.out.println(email);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (statement != null)
                    statement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static  void updateTable(String name, String last_name,String email, int id){
        Connection connection = DBConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("update user set name = ?, last_name = ?, email = ? where id = ?");
            statement.setString(1,name);
            statement.setString(2,last_name);
            statement.setString(3,email);
            statement.setInt(4,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (statement != null)
                    statement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
