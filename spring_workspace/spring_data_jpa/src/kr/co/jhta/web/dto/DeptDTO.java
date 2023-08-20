package kr.co.jhta.web.dto;

import javax.persistence.Column;
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
@Table(name="department")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	int deptno;
	String dname;
	@Column(length=50, nullable=false) // false 기본
	String loc;
}
