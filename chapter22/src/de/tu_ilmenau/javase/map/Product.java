package de.tu_ilmenau.javase.map;

import java.util.Objects;

public class Product {
    private String name;
    private int no;

    public Product() {}

    public Product(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return no == product.no && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no);
    }
}
