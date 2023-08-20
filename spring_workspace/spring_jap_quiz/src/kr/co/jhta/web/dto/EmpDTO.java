package kr.co.jhta.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDTO {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	int empno;
	String ename;
	int sal;
	String job;
}
