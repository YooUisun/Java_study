package study.quiz.quiz14;

public class StudentDTO {
    private String id;  
    private String name;
    private int grade;
    private String jumin;
    private java.sql.Date birthday;
    private String tel;
    private double height;
    private int deptno1;
    private int deptno2;
    private int profno;

    public StudentDTO(String id, String name, int grade,String jumin,java.sql.Date birthday,String tel,double height,int deptno1, int deptno2,int profno) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.jumin = jumin;
        this.birthday = birthday;
        this.tel = tel;
        this.height = height;
        this.deptno1 = deptno1;
        this.deptno2 = deptno2;
        this.profno = profno;
    }

    public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getDeptno1() {
		return deptno1;
	}

	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}

	public int getDeptno2() {
		return deptno2;
	}

	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	public String getId() {  
        return id;
    }

    public void setId(String id) {  
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public java.sql.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.sql.Date birthday) {
        this.birthday = birthday;
    }

    @Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", grade=" + grade + ", jumin=" + jumin + ", birthday="
				+ birthday + ", tel=" + tel + ", height=" + height + ", deptno1=" + deptno1 + ", deptno2=" + deptno2
				+ ", profno=" + profno + "]";
	}
}
