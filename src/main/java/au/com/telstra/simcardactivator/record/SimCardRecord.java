package au.com.telstra.simcardactivator.record;

import au.com.telstra.simcardactivator.model.SimCard;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SimCardRecord {
    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String iccid;

    @Column(nullable = false)
    private String customerEmail;

    @Column(nullable = false)
    private boolean active;

    protected SimCardRecord() {}
    public SimCardRecord(SimCard simCard) {
        this.iccid = simCard.getIccid();
        this.customerEmail = simCard.getCustomerEmail();
        this.active = simCard.isActive();
    }

    public long getId() { return this.id; }

    public String getIccid() { return this.iccid; }

    public String getCustomerEmail() { return this.customerEmail; }

    public boolean isActive() { return this.active; }

    @Override
    public String toString() {
        return "SimCardRecord{" +
                "id=" + id +
                ", iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", active=" + active +
                '}';
    }
}