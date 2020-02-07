package App;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    BuddyInfo findById(Integer id);
    List<BuddyInfo> findByName(String name);
    List<BuddyInfo> findByCell(String number);

    void deleteById(Integer id);
}