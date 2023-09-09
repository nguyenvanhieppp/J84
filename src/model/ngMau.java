package model;

public class ngMau {
	private double a; //TextField a
	private double b; //TextFiled b
	private double c; //TextField ketQua
	
	public ngMau() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void cong() {
		this.c = this.a + this.b;
	}
	public void tru() {
		this.c = this.a - this.b;
	}
	public void nhan() {
		this.c = this.a * this.b;
	}
	public void chia() {
		this.c = Math.round((this.a / this.b)*100.0)/100.0;
	}
	public void pow() {
		//Nếu từ 0,51 trở lên thì làm tròn lên 1 và Ngược Lại xuống 0
		
		this.c = Math.round(Math.pow(a, b)*100.0)/100.0; //Làm tròn lấy 2 đơn vị
	}
	public void mod() {
		this.c = this.a % this.b;
	}
}
