package pokerface.pokerface.domain.detail.entity;

import lombok.Getter;

@Getter
public enum Result {
    WIN(1),
    LOSE(0),
    FORCE(-1);

    private final Integer value;

    Result(Integer value){
        this.value = value;
    }
}