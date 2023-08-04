package pokerface.pokerface.domain.room.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pokerface.pokerface.domain.room.dto.response.RoomInfoRes;
import pokerface.pokerface.domain.room.service.RoomService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomInfoRes>> getAllRoomInfos() {
        return new ResponseEntity<>(roomService.findAllRoomInfos(), HttpStatus.OK);
    }

    @GetMapping("/{sessionId}")
    public ResponseEntity<RoomInfoRes> getRoomInfo(@PathVariable String sessionId) {
        return new ResponseEntity<>(roomService.findRoomInfoById(sessionId), HttpStatus.OK);
    }

    @PostMapping("/{sessionId}/{email}")
    public ResponseEntity<Void> removeMember(@PathVariable String sessionId,
                                             @PathVariable String email) {
        roomService.removeMember(sessionId, email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
