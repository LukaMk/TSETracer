package com.Ideabytes;


import java.util.Objects;

public class ConstantsEntity {
    private int row;


    private String paragraph;

    public ConstantsEntity(int row, String paragraph) {

        this.paragraph = paragraph;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantsEntity that = (ConstantsEntity) o;
        return row == that.row &&
                Objects.equals(paragraph, that.paragraph);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, paragraph);
    }

    @Override
    public String toString() {
        return "ConstantsEntity{" +
                "row=" + row +
                ", paragraph='" + paragraph + '\'' +
                '}';
    }
}
