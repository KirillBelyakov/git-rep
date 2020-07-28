import java.time.LocalDate;

public class Student {
    private int idNumber;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int idNumber, String surname, String name, String patronymic,
                   LocalDate dateOfBirth, String address, int phoneNumber, String faculty,
                   int course, String group) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student " +
                "idNumber=" + idNumber + ", surname=" + surname + ", name=" + name +
                ", patronymic= " + patronymic + ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", phoneNumber=+" + phoneNumber +
                ", faculty=" + faculty +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}

//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(),
// getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией,
// должно быть объявлено несколько конструкторов.
// 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//    Создать массив объектов. Вывести:
//    a) список студентов заданного факультета;
//    b) списки студентов для каждого факультета и курса;
//    c) список студентов, родившихся после заданного года;
//    d) список учебной группы.


