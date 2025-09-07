package com.learn.studentmanagement.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Scores {

    @Id
    @GeneratedValue
    private int marksId;
    @NotBlank
    @JsonProperty("firstLang")
    private int firstLang;
    @JsonProperty("secondLang")
    private int secondLang;
    @JsonProperty("thirdLang")
    private int thirdLang;
    @JsonProperty("mathematics")
    private int mathematics;
    @JsonProperty("science")
    private int science;
    @JsonProperty("sst")
    private int sst;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
}
