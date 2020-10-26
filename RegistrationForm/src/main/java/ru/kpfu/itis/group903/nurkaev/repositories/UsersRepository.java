package ru.kpfu.itis.group903.nurkaev.repositories;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import ru.kpfu.itis.group903.nurkaev.exceptions.DbException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

public class UsersRepository {

    public static final String extension = "csv";
    public static final String path = "C:/Users/nurka/Desktop/Projects/2 year/RegistrationForm/src/main/java/ru/kpfu/itis/group903/nurkaev/tmp/";

    private static void checkDb(String db) throws DbException {
        File f = new File(getDbFullPath(db));
        if (!f.exists() || !f.isFile() || !f.canRead() || !f.canWrite()) {
            throw new DbException();
        }
    }

    private static String getDbFullPath(String db) {
        return path + db + '.' + extension;
    }

    public static void addEntry(String db, String[] data) throws DbException {
        checkDb(db);
        try (CSVWriter writer = new CSVWriter(new FileWriter(getDbFullPath(db), true))) {
            writer.writeNext(data);
        } catch (IOException e) {
            throw new DbException();
        }
    }

    public static List<String[]> getAllEntries(String db) throws DbException {
        checkDb(db);
        try {
            CSVReader reader = new CSVReader(new FileReader(getDbFullPath(db)));
            return reader.readAll();
        } catch (IOException e) {
            throw new DbException();
        }
    }
}
