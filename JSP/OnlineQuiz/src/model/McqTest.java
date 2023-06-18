package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mcqtest_tbl")
public class McqTest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	private String qname;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	private String marks;
	
	public McqTest() {
		super();
	}

	public McqTest(String qname, String opt1, String opt2, String opt3, String opt4, String ans,
			String marks) {
		super();
		this.qname = qname;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}	
	
	public McqTest(int qid, String qname, String opt1, String opt2, String opt3, String opt4, String ans,
			String marks) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	

}
