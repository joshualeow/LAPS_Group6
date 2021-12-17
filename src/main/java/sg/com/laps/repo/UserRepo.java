package sg.com.laps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.com.laps.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
