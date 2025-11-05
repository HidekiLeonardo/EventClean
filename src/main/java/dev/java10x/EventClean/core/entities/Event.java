package dev.java10x.EventClean.core.entities;

import dev.java10x.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String nome,
                    String descricao,
                    String identificador,
                    LocalDateTime data_inicio,
                    LocalDateTime data_fim,
                    String local_evento,
                    String organizador,
                    Integer capacidade,
                    EventType tipo) {
}
