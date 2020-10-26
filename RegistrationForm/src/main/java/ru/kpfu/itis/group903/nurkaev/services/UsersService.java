package ru.kpfu.itis.group903.nurkaev.services;

import ru.kpfu.itis.group903.nurkaev.models.User;
import ru.kpfu.itis.group903.nurkaev.exceptions.DbException;
import ru.kpfu.itis.group903.nurkaev.exceptions.DuplicateEntryException;
import ru.kpfu.itis.group903.nurkaev.repositories.UsersRepository;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

public class UsersService {
    public static void add(User user) throws DbException, DuplicateEntryException {
        if (getAllEmails().contains(user.getEmail())) {
            throw new DuplicateEntryException();
        }
        UsersRepository.addEntry("users", new String[]{user.getName(), user.getEmail(), user.getPassword()});
    }

    public static LinkedList<String> getAllEmails() throws DbException {
        List<String[]> entries = UsersRepository.getAllEntries("users");
        LinkedList<String> emails = new LinkedList<>();
        for (String[] entry : entries) {
            emails.add(entry[1]);
        }
        return emails;
    }
}
