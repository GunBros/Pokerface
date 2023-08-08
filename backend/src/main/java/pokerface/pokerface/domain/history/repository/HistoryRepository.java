package pokerface.pokerface.domain.history.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pokerface.pokerface.domain.history.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
}
