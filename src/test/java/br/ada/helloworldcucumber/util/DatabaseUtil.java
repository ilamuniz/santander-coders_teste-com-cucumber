package br.ada.helloworldcucumber.util;

import br.ada.helloworldcucumber.model.Movie;

import java.sql.*;

public class DatabaseUtil {

    public static Movie readMovie(String title) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM MOVIE WHERE title = '" + title + "'");
             ResultSet result = statement.executeQuery()
        ) {
            Movie movie = null;
            if (result.next()) {
                movie = new Movie();
                movie.setId(result.getLong("id"));
                movie.setTitle(result.getString("title"));
                movie.setGenre(result.getString("genre"));
                movie.setRating(result.getFloat("rating"));
            }
            return movie;
        }
    }

    public static void insertMovie(Movie movie) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO movie(title, genre, rating) VALUES(?, ?, ?)");
        ) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setFloat(3, movie.getRating());
            statement.executeUpdate();
        }
    }

    public static void updateMovie(Movie movie) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("UDPATE movie(title, genre, rating) SET title = ?, genre = ?, rating = ? WHERE id = ?");
        ) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setFloat(3, movie.getRating());
            statement.setLong(4, movie.getId());
            statement.executeUpdate();
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection("jdbc:h2:tcp://localhost:9092/nio:~/movie", "sa", "password");
    }
}
