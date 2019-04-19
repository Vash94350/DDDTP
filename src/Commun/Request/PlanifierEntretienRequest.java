package Commun.Request;

import java.time.LocalDateTime;

public class PlanifierEntretienRequest {
    private String candidateId;
    private LocalDateTime dateEntretien;

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public LocalDateTime getDateEntretien() {
        return dateEntretien;
    }

    public void setDateEntretien(LocalDateTime dateEntretien) {
        this.dateEntretien = dateEntretien;
    }
}
