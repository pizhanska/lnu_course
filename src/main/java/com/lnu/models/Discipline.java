package com.lnu.models;

public class Discipline {
    private String name;
    private String semester;
    private String disciplineType;
    private String description;

    public Discipline(String name, String semester, String disciplineType, String description) {
        this.name = name;
        this.semester = semester;
        this.disciplineType = disciplineType;
        this.description = description;
    }

    public Discipline(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDisciplineType() {
        return disciplineType;
    }

    public void setDisciplineType(String disciplineType) {
        this.disciplineType = disciplineType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nDiscipline{" +
                "\nname='" + name + '\'' +
                ", \nsemester='" + semester + '\'' +
                ", \ndisciplineType='" + disciplineType + '\'' +
                ", \ndescription='" + description + '\'' +
                '}';
    }
}
