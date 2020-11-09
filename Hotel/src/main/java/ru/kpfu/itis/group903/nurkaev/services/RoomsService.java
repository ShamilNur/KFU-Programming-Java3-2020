package ru.kpfu.itis.group903.nurkaev.services;

import ru.kpfu.itis.group903.nurkaev.exceptions.NoRoomsAvailableException;
import ru.kpfu.itis.group903.nurkaev.forms.AvailabilityForm;
import ru.kpfu.itis.group903.nurkaev.models.Room;

import java.util.List;
import java.util.Optional;

public interface RoomsService {
    void save(Room entity);
    void delete(Room entity);
    void update(Room entity);
    Optional<Room> findById(Long id);
    Optional<Room> findByName(String name);
    List<Room> getAllRooms();
    List<Room> getAvailableRooms(AvailabilityForm availabilityForm) throws NoRoomsAvailableException;
}
