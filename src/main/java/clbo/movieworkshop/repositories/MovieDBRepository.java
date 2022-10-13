package clbo.movieworkshop.repositories;

import clbo.movieworkshop.models.Movie;
import clbo.movieworkshop.repositories.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDBRepository {

    private Connection conn;

    public MovieDBRepository(){
        conn = DatabaseConnectionManager.getConnection();
    }

    public Movie read(int id){
        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * from movies WHERE id = ?");
            psts.setInt(1 , id);
            ResultSet resultSet = psts.executeQuery();
            if(resultSet.next()){
                return new Movie(
                        resultSet.getInt("id"),
                        resultSet.getInt("Year"),
                        resultSet.getInt("Length"),
                        resultSet.getString("Title"),
                        resultSet.getString("Subject"),
                        resultSet.getInt("Popularity"),
                        resultSet.getString("Awards")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new Movie();

    }

    // readAll
    public List<Movie> readAll(){
        List<Movie> movies = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * from movies");
            ResultSet resultSet = psts.executeQuery();
            while(resultSet.next()){
                movies.add(new Movie(
                        resultSet.getInt("id"),
                        resultSet.getInt("Year"),
                        resultSet.getInt("Length"),
                        resultSet.getString("Title"),
                        resultSet.getString("Subject"),
                        resultSet.getInt("Popularity"),
                        resultSet.getString("Awards"))
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }



}
