package kr.co.jhta.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptDTO {
	int deptno;
	String dname;
	String loc;
}
