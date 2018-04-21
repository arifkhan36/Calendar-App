package com.example.testingspringbootmonolith.models;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "CALENDAR")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time")
    private String start_time;

    @Column(name = "end_time")
    private String end_time;

    @Column(name = "description")
    private String description;

    @Column(name = "day")
    private String day;

    @Column(name = "month")
    private String month;

    public Calendar(String start_time, String end_time, String description,String day, String month) {
        this.start_time = start_time;
        this.end_time = end_time;
        this.description = description;
        this.day = day;
        this.month = month;
    }

}




