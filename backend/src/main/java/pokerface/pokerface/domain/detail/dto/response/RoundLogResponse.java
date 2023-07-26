package pokerface.pokerface.domain.detail.dto.response;

import lombok.Builder;
import pokerface.pokerface.domain.detail.entity.Result;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Builder
public class RoundLogResponse {
    public final Integer cardNum;

    public final List<Integer> battingMoney;

    @Enumerated(EnumType.STRING)
    public Result result;

    public static RoundLogResponse of(Integer cardNum, List<Integer> battingMoney, Result result){
        return new RoundLogResponse(cardNum, battingMoney, result);
    }
}
