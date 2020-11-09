package ru.kpfu.itis.group903.nurkaev.services;

import ru.kpfu.itis.group903.nurkaev.exceptions.NoRoomsAvailableException;
import ru.kpfu.itis.group903.nurkaev.forms.AvailabilityForm;
import ru.kpfu.itis.group903.nurkaev.models.Room;
import ru.kpfu.itis.group903.nurkaev.repositories.RoomsRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Sem 1
 */

public class RoomsServiceImpl implements RoomsService {

    private final RoomsRepository roomsRepository;

    public RoomsServiceImpl(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }

    @Override
    public void save(Room entity) {
        roomsRepository.save(entity);
    }

    @Override
    public void delete(Room entity) {
        roomsRepository.delete(entity);
    }

    @Override
    public void update(Room entity) {
        roomsRepository.update(entity);
    }

    @Override
    public Optional<Room> findById(Long id) {
        return roomsRepository.findById(id);
    }

    @Override
    public Optional<Room> findByName(String name) {
        return roomsRepository.findByName(name);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomsRepository.findAll();
    }

    @Override
    public List<Room> getAvailableRooms(AvailabilityForm availabilityForm) throws NoRoomsAvailableException {
        return roomsRepository.getAvailableRooms(availabilityForm);
    }
}
