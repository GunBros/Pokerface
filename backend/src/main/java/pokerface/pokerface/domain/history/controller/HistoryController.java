package pokerface.pokerface.domain.history.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pokerface.pokerface.domain.history.dto.request.HistoryRequest;
import pokerface.pokerface.domain.history.dto.response.HistoryResponse;
import pokerface.pokerface.domain.history.service.HistoryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/histories")
@RequiredArgsConstructor
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping
    public List<HistoryResponse> historyListAll(){
        return historyService.findAll().stream()
                .map(history -> HistoryResponse.of(history, historyService.convertGameLogToData(history.getGameLog())))
                .collect(Collectors.toList());
    }

    @GetMapping("/{historyId}")
    public HistoryResponse getHistory(@PathVariable Long historyId){
        return historyService.getHistory(historyId);
    }

    @PostMapping
    public void historyRegistry(@RequestBody @Validated HistoryRequest historyRequest){
        historyService.save(historyRequest);
    }
}
