package pl.bartosiak.CashFlow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "cash")
public class Receivables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateReceivables;
    private double value;
    private String invoiceNumber;
    private String description;
    private boolean isPaid;
    @OneToOne
    private Partner partner;


}
