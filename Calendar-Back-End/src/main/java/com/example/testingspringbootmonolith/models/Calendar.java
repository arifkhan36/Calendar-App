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

    @Column(name = "DAY")
    private String day;

    @Column(name = "MONTH")
    private String month;

    @Column(name = "STARTTIME")
    private String starttime;

    @Column(name = "ENDTIME")
    private String endtime;

    @Column(name = "DESCREPTION")
    private String descreption;

    public Calendar(String day, String month, String starttime, String endtime, String descreption) {
        this.day = day;
        this.month = month;
        this.starttime = starttime;
        this.endtime = endtime;
        this.descreption = descreption;
    }

}




