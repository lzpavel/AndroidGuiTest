package ru.pfl.guitest;

import androidx.annotation.Nullable;

import java.util.Objects;

public class RecyclerItem {

    private String name;

    public RecyclerItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(@Nullable @org.jetbrains.annotations.Nullable Object obj) {
        //return super.equals(obj);
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecyclerItem item = (RecyclerItem) obj;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash(name);
    }*/
}
