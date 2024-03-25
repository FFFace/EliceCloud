create database student;
use student;

create table students(
	studentIndex int not null auto_increment,
    studentName varchar(10) not null,
    primary key(studentIndex)
);

create table studyTime(
	studentIndex int not null auto_increment,
    studyTime date,
    foreign key(studentIndex) references students(studentIndex)
);