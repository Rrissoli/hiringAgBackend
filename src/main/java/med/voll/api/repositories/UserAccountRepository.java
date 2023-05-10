package med.voll.api.repositories;

import med.voll.api.models.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {
    UserAccount findByName(String name);
}
