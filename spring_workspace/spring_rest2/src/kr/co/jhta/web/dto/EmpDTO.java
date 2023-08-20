package kr.co.jhta.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDTO {
	private int empno;
	private String ename;
	private String JOB;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
}
