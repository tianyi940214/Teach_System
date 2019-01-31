package entity;

import java.sql.Date;

public class User {
	public User() {
		super();
	}

	public User(String student_id, String student_name, String student_sex,
			String student_age, String student_address, String student_phone,
			String student_mailaddress) {

		this.student_id = student_id;
		this.student_name = student_name;
		this.student_sex = student_sex;
		this.student_age = student_age;
		this.student_address = student_address;
		this.student_phone = student_phone;
		this.student_mailaddress = student_mailaddress;
	}
	
	public User(String teacher_id, String teacher_name, String teacher_sex,
			String teacher_age, String teacher_address,
			String teacher_phone,String teacher_mailaddress,String teacher_password) {

		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_sex = teacher_sex;
		this.teacher_age = teacher_age;
		this.teacher_address = teacher_address;
		this.teacher_phone = teacher_phone;
		this.teacher_mailaddress = teacher_mailaddress;
		this.teacher_password=teacher_password;
	}
	
		
		




	public User(String teacher_name, String lesson_id, String lesson,
			String lesson_week, String lesson_time) {
		super();
		this.teacher_name = teacher_name;
		this.lesson_id = lesson_id;
		this.lesson = lesson;
		this.lesson_week = lesson_week;
		this.lesson_time = lesson_time;
	}

	





	public User(String student_id, String student_name, String teacher_id,
			String teacher_name, String lesson, Date time_student,
			Date time_teacher) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.lesson = lesson;
		this.time_student = time_student;
		this.time_teacher = time_teacher;
	}







	private String student_username;
	private String student_password;
	private String teacher_username;
	private	String teacher_password;
	
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getTeacher_username() {
		return teacher_username;
	}
	public void setTeacher_username(String teacher_username) {
		this.teacher_username = teacher_username;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	private String student_id;
	private String student_name;
	private String student_sex;
	private String student_age;
	private String student_address;
	private String student_phone;
	private String student_mailaddress;
	private String teacher_id;
	private String teacher_name;
	private String teacher_sex;
	private String teacher_age;
	private String teacher_address;
	private String teacher_mailaddress;
	private String teacher_phone;
	private String lesson_id;
	private String lesson;
	private String lesson_week;
	private String lesson_time;
	private String question_id;
	private String question;
	private Date time_student;
	private Date time_teacher;
	private String answer;
	private String kcjd;
	private String test_id;
	private Date test_time;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public String getStudent_age() {
		return student_age;
	}
	public void setStudent_age(String student_age) {
		this.student_age = student_age;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_mailaddress() {
		return student_mailaddress;
	}
	public void setStudent_mailaddress(String student_mailaddress) {
		this.student_mailaddress = student_mailaddress;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_sex() {
		return teacher_sex;
	}
	public void setTeacher_sex(String teacher_sex) {
		this.teacher_sex = teacher_sex;
	}
	public String getTeacher_age() {
		return teacher_age;
	}
	public void setTeacher_age(String teacher_age) {
		this.teacher_age = teacher_age;
	}
	public String getTeacher_address() {
		return teacher_address;
	}
	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}
	public String getTeacher_mailaddress() {
		return teacher_mailaddress;
	}
	public void setTeacher_mailaddress(String teacher_mailaddress) {
		this.teacher_mailaddress = teacher_mailaddress;
	}
	public String getTeacher_phone() {
		return teacher_phone;
	}
	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}
	public String getLesson_id() {
		return lesson_id;
	}
	public void setLesson_id(String lesson_id) {
		this.lesson_id = lesson_id;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public String getLesson_week() {
		return lesson_week;
	}
	public void setLesson_week(String lesson_week) {
		this.lesson_week = lesson_week;
	}
	public String getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Date getTime_student() {
		return time_student;
	}
	public void setTime_student(Date time_student) {
		this.time_student = time_student;
	}
	public Date getTime_teacher() {
		return time_teacher;
	}
	public void setTime_teacher(Date time_teacher) {
		this.time_teacher = time_teacher;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getKcjd() {
		return kcjd;
	}
	public void setKcjd(String kcjd) {
		this.kcjd = kcjd;
	}
	public String getTest_id() {
		return test_id;
	}
	public void setTest_id(String test_id) {
		this.test_id = test_id;
	}
	public Date getTest_time() {
		return test_time;
	}
	public void setTest_time(Date test_time) {
		this.test_time = test_time;
	}

	public String getLesson_time() {
		return lesson_time;
	}

	public void setLesson_time(String lesson_time) {
		this.lesson_time = lesson_time;
	}
	
}
