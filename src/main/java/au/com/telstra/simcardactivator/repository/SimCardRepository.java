package au.com.telstra.simcardactivator.repository;

import au.com.telstra.simcardactivator.record.SimCardRecord;
import au.com.telstra.simcardactivator.model.SimCard;
import org.springframework.data.repository.CrudRepository;

public interface SimCardRepository extends CrudRepository<SimCardRecord, Long> {
    SimCard findById(long id);
    SimCard save(SimCard simCard);
}