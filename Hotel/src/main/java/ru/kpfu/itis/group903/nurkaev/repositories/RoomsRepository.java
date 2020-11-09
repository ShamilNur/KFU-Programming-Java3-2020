package ru.kpfu.itis.group903.nurkaev.repositories;

import ru.kpfu.itis.group903.nurkaev.exceptions.NoRoomsAvailableException;
import ru.kpfu.itis.group903.nurkaev.forms.AvailabilityForm;
import ru.kpfu.itis.group903.nurkaev.models.Room;

import java.util.List;
import java.util.Optional;

public interface RoomsRepository extends CrudRepository<Room> {
    Optional<Room> findByName(String name);
    List<Room> getAvailableRooms(AvailabilityForm availabilityForm) throws NoRoomsAvailableException;
}
