package pokerface.pokerface.domain.history.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pokerface.pokerface.domain.history.entity.History;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryRequest {
    private String gameMode;

    private String gameLog;

    private Long winner;

    private Long loser;

    public History toHistory(){
        return new History(gameMode);
    }
}