package pl.bartosiak.CashFlow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "cash")
public class FixedCosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String costName;
    private int dayOfMonth;
    private LocalDate costStart;
    private LocalDate costStop;
    private double value;
    private String description;
    private String createdBy;//TODO pewnie tzreba będzie przejść na relacje z userem
    private LocalDateTime createdDate;
    private String modificationBy;
    private LocalDateTime modificationDate;

}
