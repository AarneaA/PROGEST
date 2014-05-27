package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class Literaal<T> extends PuuTipp {
    protected T value;

    public Literaal(T value) {
        this.value = value;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)this.value);
    }

    public T getValue() { //
        return value;
    }

}
