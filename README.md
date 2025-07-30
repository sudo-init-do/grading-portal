# 🎓 Student Grading Portal

A Spring Boot-based backend system for managing students, courses, and grades with both RESTful APIs and a simple Thymeleaf UI.

---

## 📌 Features

- Add & list **Students**, **Courses**, and **Grades**
- Assign grades to students in specific courses
- Fetch grades by student or course
- View students via Thymeleaf frontend (`/students`)
- PostgreSQL integration with Spring Data JPA
- Clean architecture using DTOs, Services, and Repositories
- Java 17, Maven-based project

---

## 🛠️ Tech Stack

| Layer             | Technology                      |
|------------------|----------------------------------|
| Language         | Java 17                          |
| Framework        | Spring Boot                      |
| ORM              | Spring Data JPA (Hibernate)      |
| Database         | PostgreSQL                       |
| UI Engine        | Thymeleaf                        |
| Build Tool       | Maven                            |
| Dev Tools        | Spring DevTools, Lombok          |

---

## 📁 Project Structure

```

src/
├── controller/
│   ├── StudentController.java
│   ├── CourseController.java
│   └── GradeController.java
├── model/
│   ├── Student.java
│   ├── Course.java
│   └── Grade.java
├── dto/
│   └── GradeDto.java
├── repository/
│   ├── StudentRepository.java
│   ├── CourseRepository.java
│   └── GradeRepository.java
├── service/
│   ├── StudentService.java
│   ├── CourseService.java
│   └── GradeService.java
├── templates/
│   └── students.html
└── GradingPortalApplication.java

````

---

## 🔌 API Endpoints

### 📚 Students

| Method | Endpoint        | Description        |
|--------|------------------|--------------------|
| GET    | `/api/students` | Get all students   |
| POST   | `/api/students` | Add a new student  |

### 🏫 Courses

| Method | Endpoint        | Description       |
|--------|------------------|-------------------|
| GET    | `/api/courses`  | Get all courses   |
| POST   | `/api/courses`  | Add a new course  |

### 📝 Grades

| Method | Endpoint                        | Description                      |
|--------|----------------------------------|----------------------------------|
| POST   | `/api/grades`                   | Assign a grade                   |
| GET    | `/api/grades/student/{id}`      | Get grades by student            |
| GET    | `/api/grades/course/{id}`       | Get grades by course             |

---

## 🌐 View (Thymeleaf)

| URL         | Description            |
|-------------|------------------------|
| `/students` | Web view of students   |

---

## 🚀 Running the Project

1. Clone the repository
```bash
git clone https://github.com/<your-username>/grading-portal.git
cd grading-portal
````

2. Configure PostgreSQL credentials in `application.yml`

3. Run the project

```bash
mvn spring-boot:run
```

4. Open your browser and navigate to:

* `http://localhost:8080/students` for UI
* `http://localhost:8080/api/students` for API

---

## 📚 What You’ll Learn

* Java Spring Boot structure and best practices
* Building REST APIs with Spring MVC
* JPA entity relationships and repositories
* Using Thymeleaf with Spring Boot
* Clean separation of concerns (DTOs, Services, Controllers)

---

## 📬 Author

**Oyeyemi Obaloluwa Emmanuel**
Student · Full Stack Developer · Cybersecurity Major
