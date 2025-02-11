package au.com.telstra.simcardactivator.dto;

import java.util.Objects;

public class SimCardActuatorActuateResp {
    boolean success;

    public SimCardActuatorActuateResp() {}
    public SimCardActuatorActuateResp(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() { return this.success; }
    public void setSuccess(boolean success) { this.success = success; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCardActuatorActuateResp that = (SimCardActuatorActuateResp) o;
        return Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.success);
    }

    @Override
    public String toString() {
        return "SimCardActuatorActuateResp{" +
                "success=" + this.success +
                '}';
    }
}