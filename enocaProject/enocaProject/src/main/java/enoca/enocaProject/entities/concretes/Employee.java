package enoca.enocaProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty(access = Access.READ_ONLY)
	private int id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "surName")
	private String surName;

//@ManyToOne(fetch = FetchType.LAZY, optional = false)
//@JoinColumn(name = "tutorial_id", nullable = false)
//@OnDelete(action = OnDeleteAction.CASCADE)
//@JsonIgnore

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

}
