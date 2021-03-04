package com.chlang.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "`employees`")
public class Employees implements Serializable {
    /**
     * 员工编号
     */
    @Id
    @Column(name = "`emp_no`")
    private Integer empNo;

    /**
     * 出生日期
     */
    @Column(name = "`birth_date`")
    private Date birthDate;

    /**
     * 名称
     */
    @Column(name = "`first_name`")
    private String firstName;

    /**
     * 姓氏
     */
    @Column(name = "`last_name`")
    private String lastName;

    /**
     * 性别
     */
    @Column(name = "`gender`")
    private String gender;

    /**
     * 入职时间
     */
    @Column(name = "`hire_date`")
    private Date hireDate;

    private static final long serialVersionUID = 1L;

    /**
     * 获取员工编号
     *
     * @return emp_no - 员工编号
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * 设置员工编号
     *
     * @param empNo 员工编号
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * 获取出生日期
     *
     * @return birth_date - 出生日期
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期
     *
     * @param birthDate 出生日期
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 获取名称
     *
     * @return first_name - 名称
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置名称
     *
     * @param firstName 名称
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 获取姓氏
     *
     * @return last_name - 姓氏
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置姓氏
     *
     * @param lastName 姓氏
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取入职时间
     *
     * @return hire_date - 入职时间
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * 设置入职时间
     *
     * @param hireDate 入职时间
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employees other = (Employees) that;
        return (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getHireDate() == null ? other.getHireDate() == null : this.getHireDate().equals(other.getHireDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getHireDate() == null) ? 0 : getHireDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empNo=").append(empNo);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", gender=").append(gender);
        sb.append(", hireDate=").append(hireDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}