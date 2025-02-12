package au.com.telstra.simcardactivator.dto;

import java.util.Objects;

public class SimCardResp {
    String iccid;
    String customerEmail;
    boolean active;

    public SimCardResp() {}
    public SimCardResp(String iccid, String customerEmail, boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public String getIccid() { return this.iccid; }
    public void setIccid(String iccid) { this.iccid = iccid; }

    public String getCustomerEmail() { return this.customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public boolean isActive() { return this.active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCardResp that = (SimCardResp) o;
        return active == that.active && Objects.equals(this.iccid, that.iccid) && Objects.equals(this.customerEmail, that.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.iccid, this.customerEmail, this.active);
    }

    @Override
    public String toString() {
        return "SimCardResp{" +
                "iccid='" + this.iccid + '\'' +
                ", customerEmail='" + this.customerEmail + '\'' +
                ", active=" + this.active +
                '}';
    }
}