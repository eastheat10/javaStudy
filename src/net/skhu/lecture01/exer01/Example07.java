package net.skhu.lecture01.exer01;

import java.util.Date;
import java.util.GregorianCalendar;

// equals 메소드 재정의
// true false false false false 나와야 함

import java.util.Objects;

class Data {
    double weight;
    String name;
    boolean enabled;
    Date startDate;

    public Data(double weight, String name, boolean enabled, Date startDate) {
        this.weight = weight;
        this.name = name;
        this.enabled = enabled;
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object obj) {
    	if((obj instanceof Data) == false) return false;

    	Data d = (Data)obj;
    	boolean b = this.weight == d.weight && this.name.equals(d.name) && this.enabled == d.enabled &&
    			Objects.equals(this.startDate, d.startDate);
//    				this.startDate.getYear() == d.startDate.getYear() &&
//    				this.startDate.getMonth() == d.startDate.getMonth() &&
//    				this.startDate.getDay() == d.startDate.getDay();

    	return b;
    }

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


}

public class Example07 {

    static Date createDate(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Data d1 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d2 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d3 = new Data(11.9, "data", true, createDate(2018, 9, 10));
        Data d4 = new Data(10.3, "datt", true, createDate(2018, 9, 10));
        Data d5 = new Data(10.3, "data", false, createDate(2018, 9, 10));
        Data d6 = new Data(10.3, "data", true, createDate(2018, 9, 11));

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d4));
        System.out.println(d1.equals(d5));
        System.out.println(d1.equals(d6));
     }
}
