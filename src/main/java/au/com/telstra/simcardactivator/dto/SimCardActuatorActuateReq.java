package au.com.telstra.simcardactivator.dto;

import java.util.Objects;

public class SimCardActuatorActuateReq {
    String iccid;

    public SimCardActuatorActuateReq() {}
    public SimCardActuatorActuateReq(String iccid) {
        this.iccid = iccid;
    }

    public String getIccid() { return this.iccid; }
    public void setIccid(String iccid) { this.iccid = iccid; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCardActuatorActuateReq that = (SimCardActuatorActuateReq) o;
        return Objects.equals(this.iccid, that.iccid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.iccid);
    }

    @Override
    public String toString() {
        return "SimCardActuatorReq{" +
                "iccid='" + this.iccid + '\'' +
                '}';
    }
}