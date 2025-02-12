package au.com.telstra.simcardactivator.service.impl;

import au.com.telstra.simcardactivator.dto.SimCardActuatorActuateReq;
import au.com.telstra.simcardactivator.dto.SimCardActuatorActuateResp;
import au.com.telstra.simcardactivator.model.SimCard;
import au.com.telstra.simcardactivator.record.SimCardRecord;
import au.com.telstra.simcardactivator.repository.SimCardRepository;
import au.com.telstra.simcardactivator.service.ISimCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Optional;

@Service
public class SimCardServiceImpl implements ISimCardService {

    @Value("${services.sim-card-actuator-service.url}")
    private String simCardActuatorServiceUrl;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SimCardRepository simCardRepository;

    @Override
    public SimCard getCard(Long cardId) {
        Optional<SimCardRecord> simCard = this.simCardRepository.findById(cardId);
        if (simCard.isEmpty()) {
            return null;
        }
        SimCardRecord simCardRecord = simCard.get();
        return new SimCard(simCardRecord.getIccid(), simCardRecord.getCustomerEmail(), simCardRecord.isActive());
    }

    @Override
    public SimCard activateCard(SimCard simCard) {
        SimCardActuatorActuateReq actuateReq = new SimCardActuatorActuateReq(simCard.getIccid());
        String url = this.simCardActuatorServiceUrl + "/actuate";
        ResponseEntity<SimCardActuatorActuateResp> actuateResp =
                this.restTemplate.postForEntity(url, actuateReq, SimCardActuatorActuateResp.class);
        SimCardActuatorActuateResp actuateResult = actuateResp.getBody();
        if (actuateResult == null) {
            simCard.setActive(false);
        } else {
            simCard.setActive(actuateResult.getSuccess());
        }
        // DONE: Save in database
        //SimCardRecord simCardRecord = new SimCardRecord(simCard);
        //simCardRecord = simCardRepository.save(simCardRecord);
        simCard.setId(simCardRepository.save(new SimCardRecord(simCard)).getId());
        return simCard;
    }
}