package aula10;

import java.util.Objects;

public class Retangulo {
    double altura;
    double largura;

    @Override //
    public int hashCode() {
        return Object.hash(altura, largura);
    }

    @Override
    public boolean equals(Object object) {
        // if(object == null) {
        //     return false;
        // }
        if(Objects.isNull(object)) {
            return false;
        }
        return hashCode() == object.hashCode();
    }
}
