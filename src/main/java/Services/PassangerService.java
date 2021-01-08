package Services;

import DAO.UserDAO;
import models.Passenger;
import models.Seat;

import java.util.List;

public class PassangerService {
    private UserDAO usersDao = new UserDAO();

    public PassangerService() {
    }

    public Passenger findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(Passenger user) {
        usersDao.save(user);
    }

    public void deleteUser(Passenger user) {
        usersDao.delete(user);
    }

    public void updateUser(Passenger user) {
        usersDao.update(user);
    }

    public List<Passenger> findAllUsers() {
        return usersDao.findAll();
    }

    public Seat findAutoById(int id) {
        return usersDao.findAutoById(id);
    }
}
