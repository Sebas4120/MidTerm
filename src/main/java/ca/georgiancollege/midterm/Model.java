package ca.georgiancollege.midterm;

import java.sql.SQLException;

public class Model extends BaseModel{

    public Model(){}

    public void insertRow() throws SQLException{

        preparedStatement = connection.prepareStatement("INSERT INTO TEST" +
                "(year) VALUES (?)");

        preparedStatement.setInt(1, 2021);
        preparedStatement.execute();
    }

}
