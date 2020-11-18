package ru.kpfu.itis.group903.nurkaev.books.repositories;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework 11
 */

public class BooksRepository {

    // language=SQL
    private static final String SQL_SELECT_BOOKS_WITH_AUTHORS =
            "SELECT a.name, STRING_AGG(b.name, ', ' ORDER BY b.name)\n" +
                    "FROM author a\n" +
                    "         INNER JOIN book b on b.id = a.book_id\n" +
                    "GROUP BY a.name\n" +
                    "ORDER BY a.name;";

    private final DataSource dataSource;

    public BooksRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public HashMap<String, String> getAuthorsWithBooks() {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BOOKS_WITH_AUTHORS);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet == null) {
                throw new SQLException("Empty result");
            }

            HashMap<String, String> hashMap = new HashMap<>();
            while (resultSet.next()) {
                String author = resultSet.getString(1);
                String books = resultSet.getString(2);
                hashMap.put(author, books);
            }

            return hashMap;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
