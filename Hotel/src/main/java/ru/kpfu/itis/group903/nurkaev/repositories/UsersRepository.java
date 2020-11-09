package ru.kpfu.itis.group903.nurkaev.repositories;

import ru.kpfu.itis.group903.nurkaev.exceptions.DuplicateEntryException;
import ru.kpfu.itis.group903.nurkaev.exceptions.WrongEmailOrPasswordException;
import ru.kpfu.itis.group903.nurkaev.forms.LoginForm;
import ru.kpfu.itis.group903.nurkaev.forms.UserForm;
import ru.kpfu.itis.group903.nurkaev.models.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User> {
    Optional<User> findOneByEmail(String email);
    void deleteByEmail(String email);
    void updateByEmail(String firstName, String lastName, String email);

    void signUp(UserForm userForm) throws DuplicateEntryException;
    void signIn(LoginForm loginForm) throws WrongEmailOrPasswordException;
}
