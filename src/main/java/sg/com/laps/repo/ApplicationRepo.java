package sg.com.laps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.com.laps.model.Application;

public interface ApplicationRepo extends JpaRepository<Application, Integer> {

}
