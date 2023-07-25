package vn.hongphucduong.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hongphucduong.customer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
