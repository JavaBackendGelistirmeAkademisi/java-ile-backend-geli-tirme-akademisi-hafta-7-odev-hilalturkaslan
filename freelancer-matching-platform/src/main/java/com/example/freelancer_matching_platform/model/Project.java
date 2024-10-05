package com.example.freelancer_matching_platform.model;

import jakarta.persistence.*;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String description;
	private Double budget;

	@ManyToOne
	private Category category;

	@JoinColumn(name = "employer_id")
	private User employer;

	public enum ProjectStatus {
		OPEN,
		CLOSED,
		COMPLETED
	}

	private ProjectStatus status;

}
package com.example.freelancer_matching_platform.model;








