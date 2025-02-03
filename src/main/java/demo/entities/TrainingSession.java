package demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "training_sessions")

public class TrainingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    @ManyToOne
    private Team team;

    @ManyToOne
    private User coach;

    private LocalDateTime dateTimeStart;
    private LocalDateTime dateTimeEnd;
    private LocalDateTime arrivalTime;
    private String location;
}
