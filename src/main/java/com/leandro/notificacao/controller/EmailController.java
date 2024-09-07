package com.leandro.notificacao.controller;


import com.leandro.notificacao.business.EmailService;
import com.leandro.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
